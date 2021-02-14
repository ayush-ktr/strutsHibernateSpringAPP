Ext.define('Employee', {
    extend: 'Ext.data.Model',
    fields: [{
        name: 'firstName',
    }, {
        name: 'email'
    }]
});

Ext.onReady(function() {
    var data = [];
    for (var i = 0; i < 10; i++) {
        var firstName = 'User ' + (i+1),
            email = 'user'+(i+1)+'@gmail.com';

        data.push({
            firstName: firstName,
            email: email
        });
    }

    var store = Ext.create('Ext.data.Store', {
        model: 'Employee',
        data: data
    });
    var grid = Ext.create('Ext.grid.Panel', {
    	width: 700,
    	height: 500,
    	title: 'Simple',
    	store: store,
    	header: false,
    	columns: [{
    		text: 'Name',
    		dataIndex: 'firstName',
    		width: 120
    	}, {
    		text: 'Email address',
    		dataIndex: 'email',
    		width: 120
    	}],
    });
    var panel =new Ext.FormPanel({
    items: [
    	{
            xtype: 'fieldset',
            title: 'Movie Details',
            items: [
                {
                    xtype: 'textfield',
                    label: 'First Name',
                    name: 'firstName',
                    width:200,
                    placeholder: 'Enter First Name'
                },
                {
                    xtype: 'textfield',
                    label: 'Last Name',
                    name: 'lastName',
                    placeholder: 'Enter Email'
                }
            ]
        },
        {
    	xtype:'button',
    	text:"Search",
        margin: '10px 10px 10px 163px',
        handler: function(){
        	alert("Button Click Success");
        }
    },
    grid],
    renderTo: Ext.getBody()
    })
});