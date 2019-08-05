let url = getUrlParam("url");
$(function() {

});

function login() {
    let params = $("#loginForm").serializeArray();
    httpService.post("/test/login",params,function (data) {
        console.log(data);
        if (data === 'login') {
            httpService.post(url,function (res) {
                alert(res);
            });
        }else {
            $("#msg").text(data);
        }
    });
    // $.ajax({
    //     url : server_url+"/test/login",
    //     data:params,
    //     type : "post",
    //     //允许cookie跨域
    //     crossDomain:true,
    //     xhrFields:{
    //         withCredentials:true
    //     },
    //     success: function (data) {
    //         console.log(data);
    //         if (data === 'login') {
    //             $.ajax({
    //                 url : url,
    //                 type : "post",
    //                 //允许cookie跨域
    //                 crossDomain:true,
    //                 xhrFields:{
    //                     withCredentials:true
    //                 },
    //                 success: function (data) {
    //                     alert(data);
    //                 }
    //             });
    //         }else {
    //             $("#msg").text(data);
    //         }
    //     }
    // });
}
