/**
 * @author ashutosh.sharma
 */
Ext.define('Movie', {
    extend: 'Ext.data.Model',
    fields: [{
        name: 'id', type: 'int'
    }, {
        name: 'title', type: 'string'
    }, {
        name: 'description', type: 'string'
    }, {
        name: 'releaseYear', type: 'int'
    }, {
        name: 'language', type: 'string'
    }, {
        name: 'rating', type: 'auto'
    }, {
        name: 'special_features', type: 'string'
    }, {
        name: 'category', type: 'string'
    }]
});