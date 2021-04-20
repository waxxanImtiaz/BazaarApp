
$("#searchForm").submit(function(e) {
    e.preventDefault();
});
$(document).ready(function () {
    // Listen to click event on the submit button
    $('#searchSubmit').click(function (e) {

        e.preventDefault();

        var searchValue = $("#search").val();

        $.ajax({
            async: false,
            type: "GET",
            dataType: "text",
            url: '/search/' + searchValue,
            success: function (data) {
                var dataObject = JSON.parse(data);
                if (dataObject.resCode == '0')
                    showS(dataObject.responseObject);
                else
                    $('#products').html('<h1>'+dataObject.message+'</h1>');
                return false;
            },
            error: function (error) {

                alert("Search not Found");
                console.log(error);
                return false;
            },
            failure: function (fail) {

                alert(fail);
                console.log(fail);
                return false;
            }
        });

    });
});
var showS = function (data) {
    var html = "";

    debugger
    for (var itemData in data) {
        console.log(data[itemData].itemName);
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

    return false;
};