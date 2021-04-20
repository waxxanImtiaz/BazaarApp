var signup = function(){


        var name = $("#orangeForm-name").val();
        var email = $("#orangeForm-email").val();
        var password = $("#orangeForm-password").val();
        var confirmPassword = $("#orangeForm-confirm-password").val();
        // var mobile = $("#mobile").val();
        var mob =  $("#m").val();


        if (name == '') {
            alert("Please enter your name");
            return;
        }
        if (email == '') {
            alert("Please enter your email");
            return;
        }
        if (mob == '') {
            alert("Please enter your mobile number");
            return;
        }
        if (password == '') {
            alert("Please enter your password");
            return;
        }


        if (password != confirmPassword) {
            alert("Password and Confirm Password are not equal");
            return;
        }


         var obj = new Object();

        obj.name = name;
        obj.email = email;
        obj.mobile = mob;
        obj.password = password;


    var postData = JSON.stringify(obj);
    // show_loader();
    $.ajax({
        async: false,
        type: "POST",
        contentType: 'application/json',
        dataType: "json",
        url: '/signup',
        data: postData
        ,
        success: function (data) {
            // hide_loader();
           debugger
            if (data.resCode == '0'){
                document.cookie = 'name='+name;
                document.cookie = 'email='+email;
                document.cookie = 'mobile='+mob;

                return
                //alert(data.message);
            }
            alert(data.message);

            return false;
        },
        error: function (error) {

           alert("Unbale to signup");

            console.log(error);
            return false;
        },
        failure: function (fail) {

            alert(fail);
            console.log(fail);
            return false;
        }
    });

}


function validate(evt) {
    var theEvent = evt || window.event;

    // Handle paste
    if (theEvent.type === 'paste') {
        key = event.clipboardData.getData('text/plain');
    } else {
        // Handle key press
        var key = theEvent.keyCode || theEvent.which;
        key = String.fromCharCode(key);
    }

    var regex = /[0-9]|\./;
    if( !regex.test(key) ) {
        theEvent.returnValue = false;
        if(theEvent.preventDefault) theEvent.preventDefault();
    }
}