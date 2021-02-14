package com.struts.training.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.manager.CommonUseManager;
import com.highradius.manager.MovieListManager;
import com.highradius.model.CLSTovoUIConfigDTO;
import com.highradius.model.CmsCustomerAgentDerivedFields;
import com.highradius.model.LuFeature;
import com.highradius.model.MapAccountFeature;
import com.highradius.model.Movie;

public class TrainingAction {

	private ArrayList<Movie> listFromAction;

	private String title;

	private String category;

	private String language;

	private int releaseYear;

	private static final String SUCCESS = "success";

	private MovieListManager movieListService;
	
	private CommonUseManager commonUtils;
	
	public TrainingAction() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		setMovieListService((MovieListManager) appContext.getBean("movieListServiceImpl"));
		setCommonUtils((CommonUseManager) appContext.getBean("commonUtilsImpl"));
		((ConfigurableApplicationContext)appContext).close();
	}

	public TrainingAction(MovieListManager movieListService, CommonUseManager commonUtils) {
		this.movieListService = movieListService;
		this.commonUtils = commonUtils; 
	}

//	public String execute() {
//		try {
//			Movie keyObject = new Movie();
//			keyObject.setTitle(getTitle());
//			keyObject.setCategory(getCategory());
//			keyObject.setLanguage(getLanguage());
//			keyObject.setReleaseYear(getReleaseYear());
//			setListFromAction(movieListService.findMovies(FileHandlingHelper.readFromAFile(), keyObject));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return SUCCESS;
//	}
	
	public static String configuredFeatures = "VOICE_CALL_RECORD,TOVO_CLS_DISPLAY_CALLING_WIDGET,TOVO_CLS_INCOMING_EMAIL,TOVO_CLS_FREEDA_SUMMARIZATION,VOICE_LEGAL_ANNOUNCEMENT";

	public static String getCLSTovoUIAccountConfig(CommonUseManager manager) {
			List<MapAccountFeature> mapAccountFeatureList;
			Map<String, CLSTovoUIConfigDTO> accountConfigMap = new HashMap<>();
			
			try {
				Integer accountId = 70369;
				List<String> listOfFeatures = Arrays.asList(configuredFeatures.trim().split(","));
				mapAccountFeatureList = manager.getCLSTovoUIAccountConfig(accountId, listOfFeatures);
				
				if (mapAccountFeatureList.size() > 0) {
					updateAccountConfigMap(mapAccountFeatureList, accountConfigMap);
					
				}
				
				if (accountConfigMap.size() != listOfFeatures.size()) {
					for (String feature : listOfFeatures) {
						if (!accountConfigMap.containsKey(feature)) {
							accountConfigMap.put(feature, null);
						}
					}
				}
			} catch (Exception e) {
				
			}
			return "SUCCESS";
		}
		
		private static void updateAccountConfigMap(List<MapAccountFeature> mapAccountFeatureList, Map<String, CLSTovoUIConfigDTO> resultMap) {
			mapAccountFeatureList.stream().parallel().forEach(mapAccountFeature -> {
				if (mapAccountFeature.getLuFeature() != null && 
						(!resultMap.containsKey(mapAccountFeature.getLuFeature().getFeatureName()) || 
						mapAccountFeature.getFkAccountId() != -1 )) {
					
					LuFeature luFeature = mapAccountFeature.getLuFeature();
					CLSTovoUIConfigDTO uiConfigDto = new CLSTovoUIConfigDTO();
					
					uiConfigDto.setFeatureValue(luFeature.getFeatureValue());
					uiConfigDto.setConfig(mapAccountFeature.getConfig());
					
					resultMap.put(luFeature.getFeatureName(), uiConfigDto);
				}
			});
		}
		
		
		private static void currency(CommonUseManager manager) {
			try {
				List<CmsCustomerAgentDerivedFields> fields = manager.getUserVirtualAndCallerIdDetails(null,null);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static String getAggregateCurrencyRollUpType(CommonUseManager manager) throws Exception {
			List<CmsCustomerAgentDerivedFields> cmsCustomerAgentDerivedFieldsList = manager.getUserVirtualAndCallerIdDetails(null,null);;
			Boolean isMultipleDocCurr = false;
			Boolean isMultipleLocalCurr = false;
			Set<String> localCurrencies = new HashSet<>();
			Set<String> documentCurrencies = new HashSet<>();
	    
			
			String aggregateCurrType = "Local Currency";			
			if (aggregateCurrType.equalsIgnoreCase("DOCUMENT_CURRENCY")) {
				
				for (CmsCustomerAgentDerivedFields cmsCustomerAgentDerivedFields : cmsCustomerAgentDerivedFieldsList) {
					if ((cmsCustomerAgentDerivedFields.getPastDueAmtDocCurrency() != null || cmsCustomerAgentDerivedFields.getCurrentOpenAmtDocCurrency() != null)
								&& (cmsCustomerAgentDerivedFields.getPastDueAmtDocCurrency().contains(",") 
										|| cmsCustomerAgentDerivedFields.getCurrentOpenAmtDocCurrency().contains(","))) {
						isMultipleDocCurr = true;
						return "GLOBAL_CURRENCY";
					}
					if (cmsCustomerAgentDerivedFields.getPastDueAmtDocCurrency() != null || cmsCustomerAgentDerivedFields.getCurrentOpenAmtDocCurrency() != null) {
						documentCurrencies.add(cmsCustomerAgentDerivedFields.getPastDueAmtDocCurrency().replaceAll("[^A-Za-z]+", ""));
						if (documentCurrencies.size() > 1)
							return "GLOBAL_CURRENCY";
					}
					
				}
				if (!isMultipleDocCurr) {
					return "Document Currency";
				}
				
			} else if (aggregateCurrType.equalsIgnoreCase("Local currency")) {
				for (CmsCustomerAgentDerivedFields cmsCustomerAgentDerivedFields : cmsCustomerAgentDerivedFieldsList) {
					if ((cmsCustomerAgentDerivedFields.getPastDueAmtLocalCurrency() != null
							|| cmsCustomerAgentDerivedFields.getCurrentOpenAmtLocalCurrency() != null)
								&& (cmsCustomerAgentDerivedFields.getPastDueAmtLocalCurrency().contains(",") 
										|| cmsCustomerAgentDerivedFields.getCurrentOpenAmtLocalCurrency().contains(","))) {
						isMultipleLocalCurr = true;
						return "GLOBAL_CURRENCY";
					}
					if (cmsCustomerAgentDerivedFields.getPastDueAmtLocalCurrency() != null || cmsCustomerAgentDerivedFields.getCurrentOpenAmtLocalCurrency() != null) {
						localCurrencies.add(cmsCustomerAgentDerivedFields.getPastDueAmtLocalCurrency().replaceAll("[^A-Za-z]+", ""));
						if (localCurrencies.size() > 1)
							return "GLOBAL_CURRENCY";
					}
					if (!isMultipleLocalCurr) {
	    				return "LOCAL_CURRENCY";
	    			}
					
				}
			} else if (aggregateCurrType.equalsIgnoreCase("GLOBAL_CURRENCY")) {
				return "GLOBAL_CURRENCY";
			}
			return "GLOBAL_CURRENCY";

	    }


	
	public static void main (String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		CommonUseManager movieManager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
		
		try {
			getAggregateCurrencyRollUpType(movieManager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Movie> getListFromAction() {
		return listFromAction;
	}

	public void setListFromAction(ArrayList<Movie> listFromAction) {
		this.listFromAction = listFromAction;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public MovieListManager getMovieListService() {
		return movieListService;
	}

	public void setMovieListService(MovieListManager movieListService) {
		this.movieListService = movieListService;
	}

	public CommonUseManager getCommonUtils() {
		return commonUtils;
	}

	public void setCommonUtils(CommonUseManager commonUtils) {
		this.commonUtils = commonUtils;
	}
	
}
