Ext.ns('cms.collector.managecalleridmasking');
	


cms.collector.managecalleridmasking.tabpanel;
cms.collector.managecalleridmasking.gridpanel;
cms.collector.managecalleridmasking.createVerifyFormPanel;
cms.collector.managecalleridmasking.createOtpComponent;

var screen = window;

function resolveCMSPath(x){
	return x;
}

var globalRespDecoded;
var pollingInterval;
var callerId;

function makeSynchAJAXCall(x,y){
	console.log(x);
	console.log(y);
	var url = x.split("?")[0];
	var param = x.split("?")[1].split("=")[0];
	var paramsValue = x.split("?")[1].split("=")[1];
	var response;
	Ext.Ajax.request({ url: UPDATE_MASKING_STATUS_URL ,
		   method: 'POST',
		   params: {[param] : paramsValue},
		   success: function(responseObject){
			   console.log(responseObject)
		     response = Ext.JSON.decode(responseObject.responseText);
			   console.log(response)
			   return response;
		   },
		   failure: function(responseObject){
		     var obj = Ext.JSON.decode(responseObject.responseText);
		     alert("error");
		   }
		});
	console.log(response);
	return response="{success:true,validationCode:123456}";
}

var GET_USER_MASKING_DETAILS_URL = resolveCMSPath('http://localhost:8081/StrutsHibernateApp/getUserMaskingDetails');
var UPDATE_MASKING_STATUS_URL = resolveCMSPath('http://localhost:8081/StrutsHibernateApp/updateMaskingStatus');
var VERIFY_USER_CALLER_ID_URL = resolveCMSPath('addCallerIdForUser.do');
var GET_VERIFICATION_STATUS_URL = resolveCMSPath('http://localhost:8081/StrutsHibernateApp/squareServlet');

cms.collector.managecalleridmasking.createGrid = function(){
	
	var jsonReaderForCallerIdMasking = new Ext.data.JsonReader({
		id : 'pkUserCallerId',
		rootProperty : 'rows',
		totalProperty : "results",
		type : 'safejson',
		fields : [ {
			name: 'userName',
			mapping: 'userName'
		}, {
			name: 'virtualNumber',
			mapping: 'virtualNumber'
		}, {
			name: 'callerID',
			mapping: 'callerID'
		}, {
			name: 'maskingEnabled',
			mapping: 'maskingEnabled'
		},{
			name: 'isVerified',
			mapping: 'isVerified'
		}]
	});
	
	var proxyForCallerIdMasking = new Ext.data.HttpProxy({
		url : GET_USER_MASKING_DETAILS_URL,
		reader : jsonReaderForCallerIdMasking,
		actionMethods : {
			read : 'POST'
		}
	});
	
	storeForCallerIdMasking = new Ext.data.Store({
		pageSize : 20,
		proxy : proxyForCallerIdMasking,
//		data: [
//		      { userName : "Asha", virtualNumber : "16", callerID : "a", maskingEnabled : true }
//		   ],
		remoteSort : true,
		reader : jsonReaderForCallerIdMasking
	});
	
	cms.collector.managecalleridmasking.grid = new Ext.grid.Panel({
		itemId : 'cmsadmincalleridmaskinggridpanel',
		store : storeForCallerIdMasking,
		loadMask : true,
		columns : [{
			itemId : 'userName',
			header : 'User Name',
			tooltip : 'User Name',
			dataIndex : 'userName',
			width : 150,
			sortable : true
		},
		{
			itemId : 'virtualNumber',
			header : 'Virtual Number',
			tooltip : 'Virtual Number',
			dataIndex : 'virtualNumber',
			width : 150,
			sortable : true
		},
		{
			itemId : 'callerID',
			header : 'Caller ID',
			tooltip : 'Caller ID',
			dataIndex : 'callerID',
			width : 150,
			sortable : true
		},
		{
			itemId : 'maskingEnabled',
			header : 'Masking Enabled',
			tooltip : 'Masking Enabled',
			dataIndex : 'maskingEnabled',
			width : 150,
			sortable : true,
			xtype:'checkcolumn', 
			fieldLabel: 'checkbox_label', 
			name: 'checkbox_name', 
			text: 'text', 
			listeners: { 
				beforecheckchange: function() {
					return false;
				} 
			}
		}
		],
		viewConfig : {
			deferEmptyText : false,
			emptyText : common.i18n.getDisplayValue(
					'COMMON_MSG_NO_VIRTUAL_NUMBERS',
			'There are no virtual numbers.')
		}, 
		 selModel: {
	        type: 'checkboxmodel',
	        listeners: {
	            selectionchange: 'onSelectionChange'
	        }
		 },
		defaultListenerScope: true,
		referenceHolder: true,
	    onSelectionChange: function (sm, selections) {
	    	if(selections.length === 0){
	    		this.getReferences().verifyButton.setDisabled(true);
	    		this.getReferences().EnableDisableButton.setDisabled(true);
	    	}
	    	else {
	    		this.getReferences().verifyButton.setDisabled(false);
	    		this.getReferences().EnableDisableButton.setDisabled(false);
	    	}
	        
	    },
	    dockedItems : [
			{
				xtype : 'pagingtoolbar',
				dock : 'top',
				itemId : 'toptoolbar',
				store : storeForCallerIdMasking,
				displayInfo : true,
				displayMsg : common.i18n.getDisplayValue(
						'COMMON_MSG_VIRTUAL_NUMBERS', 'Virtual Numbers ')
						+ '{0} - {1}'
						+ common.i18n
								.getDisplayValue('COMMON_MSG_OF', ' of ')
						+ ' ' + '{2}',
				emptyMsg : common.i18n.getDisplayValue(
						'COMMON_MSG_NO_RECRDS_DISPLAY',
				'No Records to display '),
				overflowHandler : 'scroller',
				style : "position:relative",
				items : [ '-' ]
			},
			{
				xtype : 'pagingtoolbar',
				dock : 'bottom',
				itemId : 'bottomtoolbar',
				store : storeForCallerIdMasking,
				displayInfo : true,
				displayMsg : common.i18n.getDisplayValue(
						'COMMON_MSG_VIRTUAL_NUMBERS', 'Virtual Numbers')
						+ '{0} - {1}'
						+ common.i18n
								.getDisplayValue('COMMON_MSG_OF', ' of ')
						+ ' ' + '{2}',
				emptyMsg : common.i18n.getDisplayValue(
						'COMMON_MSG_NO_RECRDS_DISPLAY',
				'No Records to display '),
				overflowHandler : 'scroller',
				style : "position:relative",
				items : [ '-' ]
			},
			{
				xtype : 'toolbar',
				items:[{
					reference: 'verifyButton',
		            text: 'Verify Caller Id',
		            tooltip: 'Verify Caller Id',
		            iconCls: 'framing-buttons-option',
		            disabled: true,
		            handler:function(){
		            	win = new Ext.Window({
		        			title  : 'Verify your Caller ID',
		        			width  : 380,
		        			itemId : 'verifyCallerIdWindow',
		        			height :200,
		        			modal  : true,
		        			layout:'fit',
		        			constrain: true,
		        			autoDestroy: false,
		        			buttonAlign : 'center',
		        			items  : [cms.collector.managecalleridmasking.createVerifyFormPanel()]
		        	     }); 
		            	win.show(this);
		            	//,cms.collector.managecalleridmasking.createOtpComponent()
		            }
				},'-',
				{
					reference: 'EnableDisableButton',
		            text: 'Enable/Disable Masking',
		            tooltip: 'Enable/Disable Masking',
		            iconCls: 'framing-buttons-option',
		            disabled: true,
		            handler:function(){
		            	var storeData = storeForCallerIdMasking.data.items[0].data;
		            	if(!storeData.isVerified){
		            		Ext.Msg.alert ('Warning', 'Please verify your number first.');
		            	}else{
		            		
		            		var Msg = "";
		            		if(storeData.maskingEnabled){
			            		Msg = "Your phone number will no longer be used as Caller ID";
			            	}else{
			            		Msg = "Your phone number will be used as the default CallerID";
			            	}
		            		
		            		Ext.MessageBox.show({ 
								title: 'Enable/Disable Masking', message: Msg, width: 300,
								buttons: Ext.Msg.YESNO, 
								buttonText: { yes: 'Confirm', no: 'Cancel' } ,
								fn: function(buttonId) {
									if(buttonId == "yes"){
										var updateStatus = !storeData.maskingEnabled;
										var resp = makeSynchAJAXCall( UPDATE_MASKING_STATUS_URL+'?maskingStatus='+updateStatus,'POST');
										if(resp!=null && Ext.JSON.decode(resp).success == true){
											var mStatusSuccess,mStatusFailure;
											if(updateStatus){
												mStatusSuccess = "Enabled";
												mStatusFailure = "Enable";
											}else{
												mStatusSuccess = "Disabled";
												mStatusFailure = "Disable";
											}
											Ext.Msg.alert("Enable/Disable Masking", "Masking "+mStatusSuccess+" Successfully.");
											storeForCallerIdMasking.load();
										}else{
											Ext.Msg.alert("Enable/Disable Masking", "Failed to "+mStatusFailure+" Masking.");
										}
									}  
								}
							});
		            	}
		            }
				}
				]
				}],
			listeners : {
				render : function() {
					storeForCallerIdMasking.load({
						params : {
							start : 0,
							limit : 20
						}
					})
				}
			},
			height : 535
	});
	
	return cms.collector.managecalleridmasking.grid;
}

cms.collector.managecalleridmasking.createManageCallerIdMaskingPanel = function(
		attributes) {
	cms.collector.managecalleridmasking.gridpanel = cms.collector.managecalleridmasking.createGrid();

	var manageCallerIdMasking = {
		itemId : 'cmsadminmanagecalleridmaskingPanel-panel1',
		layout : 'fit',
		bodyStyle : 'padding:0px',
		items : [ cms.collector.managecalleridmasking.gridpanel  ]
	};

	cms.collector.managecalleridmasking.tabpanel = new Ext.TabPanel(
			{
				itemId : 'cmsadminmanagecalleridmaskingPanel-panel',
				activeTab : 0,
				bodyCssClass : true,
				border : false,
				items : [ {
					title : "CallerID Masking",
					items : [ manageCallerIdMasking ]
				} ]
			});
	
	return cms.collector.managecalleridmasking.tabpanel;
};

cms.collector.managecalleridmasking.createVerifyFormPanel = function(){
	
	var countrycode = new Ext.form.field.ComboBox({
		xtype: 'combobox',
		itemId: 'countrycode-combobox',
        width:120,
        editable: true,
        mode: 'remote',
		store: ["A","B","C","ABC","BC","C"],
		displayField: 'displayName',
		emptyText: 'Code',
		valueField: 'value',
		triggerAction : 'all',
		hidden : false,
		enableKeyEvents: true,
//		allowBlank: false
});
	
	var hBox = Ext.create('Ext.Container', {
	    fullscreen: true,
	    layout: 'column',
	    padding : '0 15 0 15',
	    margin       : "0 10 0 0",
	    items: [
	        {
	            xtype: countrycode,
	            style: 'marginRight:10px'
	        },
	        {
	        	 xtype: 'textfield',
	             allowBlank: false,
	             itemId : "phoneNumber",
	             margin : "0 0 0 15",
	             emptyText: 'Enter Number',
	             enableKeyEvents: true,
	             maskRe: /[0-9]/,
	                validator: function(v) {
	                    return /^-?[0-9]*(\.[0-9]{1,2})?$/.test(v)? true : 'Only positive/negative float (x.yy)/int formats allowed!';
	                },
	        }
	    ],
	    style: {
	    	background: '#fff',
	        position: 'absolute',
	        zIndex    : 1
	    },
	});
	var vbox = Ext.create('Ext.Container', {
	    fullscreen: true,
	    layout: 'vbox',
	    items: [{
	    		xtype: "panel",
	    		border:false,
				bodyBorder:false,
				hideBorders:true,
				itemId: 'content1',
				margin: "0 0 10 15",
				html: "Enter your phone number and we'll call you to enter a verification code.",
	    		width: 315
	    	},
	        {
	        	 xtype: hBox
	        }
	    ],
	    style: {
	    	background: '#fff',
	        position: 'absolute',
	        zIndex    : 1
	    },
	});
	
	
	var VerifyNumberForm = new Ext.create("Ext.form.Panel",{
    			monitorValid : true,
    			itemId       : 'verifyCallerId',
    			frame        : false,
    			header       : false,
    			layout        : 'anchor',
    			defaults     : {
    			              anchor:'98%',
    			              labelWidth : 120
    		    },
    		    bodyStyle    : 'background-color:#fff;padding: 10px',
    		    labelWidth   : 110,
    		    waitMsgTarget: true,
    		    defaultType  : 'textfield',
						    	buttons:[{
						     		  	text     : 'Verify',
							    	    formBind : true,
								    	handler : function(){
//								    		
								    		var phoneNumber = Ext.ComponentQuery.query('#phoneNumber')[0].getValue();
								    		var code = Ext.ComponentQuery.query('#countrycode-combobox')[0].getValue();
								    		VerifyNumberForm.destroy();
								    		win.setLoading(true);
								    		callerId = phoneNumber;
								    		var globalResp = makeSynchAJAXCall( VERIFY_USER_CALLER_ID_URL+'?phoneNumber='+code+phoneNumber,'POST');
								    		console.log(Ext.JSON.decode(globalResp))
								    		if(globalResp != null && Ext.JSON.decode(globalResp).success == true){
								    			win.setLoading(false);
								    			console.log("Helllllooooo")
								    			globalRespDecoded = Ext.JSON.decode(globalResp).validationCode.toString().split('').join('  ');
								    			win.destroy(); 
								    			cms.collector.managecalleridmasking.createOtpComponent().show(this);
								    		}
								    	}
							  },{
								  		text : 'Cancel',
								  		handler : function(){
								  			console.log("Helllloooo")
								    	    win.destroy(); 
								    	}
							  }],
				    		    buttonAlign  : 'center',
				    		    items        : [vbox]
	});
	
	return VerifyNumberForm;
	
}

cms.collector.managecalleridmasking.createOtpComponent = function(){
	
	var otpCont = Ext.create('Ext.Container', {
    fullscreen: true,
    layout: 'vbox',
    hidden: false,
    items: [{
    		xtype: "panel",
    		border:false,
			bodyBorder:false,
			hideBorders:true,
			margin: "10 0 10 15",
			html: "<p style='font-size:14px;margin-left: 18px;'>Answer the call and enter this verification code.</p>",
    		width: 315
    	},
        {
    		xtype: "panel",
    		border:false,
    		itemId : 'otpPanel',
			bodyBorder:false,
			hideBorders:true,
			margin: "0 0 10 45",
			html: "<p style='color:blue;font-size:28px;margin: 4px 5px 4px 60px'><b>"+globalRespDecoded+"</b></p>",
    		width: 315
        }
    ],
    style: {
    	background: '#fff',
        position: 'absolute',
        zIndex    : 1
    },
});
	
	var otpWindow = win = new Ext.Window({
		title  : 'Verify your Caller ID',
		width  : 380,
		itemId : 'verifyCallerIdWindow',
		height :200,
		modal  : true,
		layout:'fit',
		constrain: true,
		autoDestroy: false,
		buttonAlign : 'center',
		items  : [otpCont],
		listeners: {
	        afterrender: function() {
	        	pollingInterval = new EventSource(GET_VERIFICATION_STATUS_URL+"?callerId="+callerId);
	        	pollingInterval.addEventListener(callerId, function(event) { //CallerID-TimeStamp
	        		console.log(event)
	        			if (event && event.data) {
	        				console.log(event.data)
	        				var verificationResponse = event.data.trim();
	        				if (verificationResponse.includes("VERIFICATION_SUCCESSFULL")) {
	        					console.log("Success");
	        					pollingInterval.close();
	        					otpWindow.destroy();
		            			Ext.Msg.alert("Verify your Caller ID", "CallerID verified Successfully");
	        				}else if(verificationResponse.includes("VERIFICATION_FAILED")){
	        					console.log("Failed")
	        					pollingInterval.close();
	        					otpWindow.destroy();
	    	            		Ext.Msg.alert("Verify your Caller ID", "We could not verify your number. Please retry.");
	        				}else if(verificationResponse.includes("VERIFICATION_ON_HOLD")){
	        					console.log("Verification Pending");
	        				}else{
	        					console.log(verificationResponse);
	        					
	        				}
	        			}else{
	        				//Something went wrong
	        				pollingInterval.close();
        					otpWindow.destroy();
	        				Ext.Msg.alert("Verify your Caller ID", "Something went wrong, Please try again..");
	        			}
	        		});
	        },
	        close: function() {
	        	pollingInterval.close();
	        }
	    }
     });
	
	return otpWindow;
}