//服务器地址
// const server_url = "http://169.254.171.5:8080";//个人PC

const server_url = "http://169.254.166.130:8080";//个人PC

// const server_url = "http://192.168.18.213:8080";//公司PC

//获取url中的参数
function getUrlParam(name) {
    let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    let r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}



let httpService = {
    url: server_url +'',//请求路径
    _options:{
        //允许cookie跨域
        crossDomain:true,
        xhrFields:{
            withCredentials:true
        }
    },
    //POST请求方法
    post:function () {
        let editors = arguments;//方法参数
        let urls = this.url + editors[0];//请求路径
        let params = Object;//请求参数
        let options = Object;//ajax参数
        let call = Object; //回调函数
        if (editors.length === 2) {
            call = editors[1];
        }else if (editors.length === 3){
            params = editors[1];
            call = editors[2];
        }else if (editors.length === 4){
            params = editors[1];
            options = editors[2];
            call = editors[3];
        }
        this._options = $.extend(this._options,{
            url:urls,
            type:'POST',
            data:params,
            success:function (data) {
                call && typeof(call) === 'function' && call(data);
            }
        },options);
        $.ajax(this._options);
    }
};