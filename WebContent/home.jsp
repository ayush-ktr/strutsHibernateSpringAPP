<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script src="ext-all-debug-6.0.2.js" type="text/javascript"></script>
<link href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.2.0/classic/theme-triton/resources/theme-triton-all_1.css"
rel = "stylesheet" />
<link rel="stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/extjs/6.2.0/classic/theme-triton/resources/theme-triton-all_2.css" />
<script type="text/javascript" src="/StrutsHibernateApp/ext-all.js"></script>
<script type="text/javascript" src="CMSUserCallerId6.js"></script>
<script type="text/javascript">
var common = {
		i18n:{
			getDisplayValue(x,y){
				return y
			}
			
		}
}
</script>
<script type="text/javascript">
	Ext.application({
		   name: 'SenchaApp',
		   launch: function () {
		       Ext.create('Ext.panel.Panel', {
		           title: 'Sencha App',
		           width: '100%',
		           height: '100%',
		           renderTo: 'whitespace',
		           items: [
		        	   cms.collector.managecalleridmasking.createManageCallerIdMaskingPanel()
		           ]
		       });
		   }
		});
</script>
</head>
<body>
	<div id="whitespace"/>
</body>
</html>