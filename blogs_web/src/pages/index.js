$(function() {

});

function test() {
    // $.ajax({
    //     type : "post",
    //     url : server_url+"/test/hello",
    //     success: function (data) {
    //         $("#testLabel").text(data);
    //     }
    // });
    httpService.post("/test/hello",function (data) {
        $("#testLabel").text(data);
    });
}

function test2() {
    httpService.post("/home",function (data) {
        if (data === 'unLogin') {
            window.location ="./login/login.html?url="+"/home";
        }else {
            $("#testLabel").text(data);
        }
    });
    // $.ajax({
    //     type : "post",
    //     url : server_url+"/home",
    //     success: function (data) {
    //         console.log(data);
    //         if (data === 'unLogin') {
    //             window.location ="./login/login.html?url="+this.url;
    //         }
    //     }
    // });
}