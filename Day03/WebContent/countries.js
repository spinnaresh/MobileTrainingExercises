function createTbl(txn){
		var query = "create table if not exists " + 
		"countries(id unique, name)";
	txn.executeSql(query);
}
function createRecord(txn , countryId, countryName ){
	var query = "insert into countries values(?,?,?)";
	txn.executeSql(query,[countryId,countryName],onSuccess,onError);
}

function onSuccess(txn){
	alert("Successfully inserted");		
}
function onError(txn,error){
	alert("Error inserting record " + error.message);		
}
function onErrorWhileLoading(txn,error){
	alert("Error loading record " + error.message);		
}
function displayRecords(txn){
	var query = "select * from countries";
	txn.executeSql(query,[],function(tx,results){
		var count = results.rows.length;
		for(var i=0;i<count;i++){
			var row = results.rows.item(i);
			alert(row.name + ", " + row.age);
		}
	},onErrorWhileLoading);
}
/*var db = openDatabase("Sella","Training db","1.0",1000000);
db.transaction(createTbl);
db.transaction(createRecord);
db.transaction(displayRecords);*/
