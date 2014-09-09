/*
author: xuming
date: 2014/09/01
email: xuming@coldworks.com
*/
function AJAX (method, url, paramStr, fnSucceed, fnfail) {
	var oAjax = window.XMLHttpRequest? new XMLHttpRequest(): new ActiveXObject('MicroSoft.XMLHTTP');
	if(paramStr != '') {
		paramStr = '?' + paramStr;
	}
	oAjax.open(method, url + paramStr, 'true');
	oAjax.send();
	oAjax.onreadystatechange = function () {
		if(oAjax.readyState == 4) {
			if(oAjax.status == 200) {
				var json = eval('(' + oAjax.responseText + ')');
				fnSucceed && fnSucceed(json);
			}else {
				alert('网络异常，请检测您的网络设置！');
				fnfail && fnail(status);
			}
		}
	};
};
/*
author: xuming
date: 2014/09/09
email: xuming@coldworks.com
*/
function getPath(obj,fileQuery){ 
	if(window.navigator.userAgent.indexOf("MSIE")>=1){ 
		fileQuery.select(); 
		var path=document.selection.createRange().text; 
		obj.removeAttribute("src"); 
		obj.setAttribute("src",path); 
	}else { 
		var file =fileQuery.files[0];  
		var reader = new FileReader();  
		reader.onload = function(e){ 
		obj.setAttribute("src",e.target.result) 
		} 
		reader.readAsDataURL(file);  
	}
} 