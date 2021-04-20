function show_loader(){
    $("#loader").addClass("loader");
    //event.preventDefault();
}

hide_loader();
function hide_loader(){
    $("#loader").removeClass("loader");
    //event.preventDefault();
}
//
// if($(".item-button").length) {
//     $(".item-button").click(function(event) {
//         show_loader();
//         //load the ajax data
//         //wait(1000);
//         setTimeout(hide_loader, 1000);
//         //hide_loader();
//         event.preventDefault();
//     });
// }