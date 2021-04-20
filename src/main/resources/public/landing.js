
$(document).ready(function(){

	loadData('/list/Phone',getItemByCategory);

	$("#signupDialog").load("widgets/signup/signup.html");


	$('#bazaar').click(function (e) {
		loadData('/list/Phone',getItemByCategory);
	});
});

var getItemByCategory = function (d) {

	var html = "";
	var data = d.responseObject;

	for (var itemData in data) {

		html += "<div class=\"col-md-3\">\n" +"<a href='javascript:showItemDetails("+data[itemData].id+");'>"+
			"                    <div class=\"product-item-1\">\n" +
			"                        <div class=\"product-thumb\" >\n" +
			"                            <img src="+data[itemData].images+" alt="+data[itemData].itemName +"> \n" +
			"                        </div> <!-- /.product-thumb -->\n" +
			"                        <div class=\"product-content\">\n" +
			"                            <h5><a href=\"#\"><span id=\"itemName\"> "+data[itemData].itemName +"</span></a></h5>\n" +
			"                            <span class=\"tagline\"><span id=\"address\"> "+ data[itemData].location +" </span></span>\n" +
			"                            <span class=\"price\"><span id=\"price\">"+ data[itemData].price +"</span></span>\n" +
			"                            <span class=\"h6\" ><span id=\"date\"> "+data[itemData].date +" </span></span>\n" +
			"                        </div> <!-- /.product-content -->\n" +
			"                    </div> <!-- /.product-item -->\n" +"</a>"+
			"</div> <!-- /.col-md-3 -->";


	}
	$('#products').html(html);


};

var showItemDetails = function (id) {

	loadData('/item/'+id,function (data) {

		alert(data.responseObject.itemName)

	})
}

var loadData = function(url,callBackMethod){

	$.ajax({
		async:false,
		type: "GET",
		dataType: "json",
		url: url,
		success: callBackMethod,
		error: function (error) {
			alert(error);
			console.log(error);
		},
		failure: function (fail) {
			alert(fail);
			console.log(fail);
		}
	});
};


