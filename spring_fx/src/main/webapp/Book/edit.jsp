<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<base href="../">
<meta charset="UTF-8">
<link href="layui/css/layui.css" rel="stylesheet">
<script type="text/javascript" src="layui/layui.all.js"></script>
<script src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="js/my.js"></script>

<title></title>
</head>
<body>
<style>
.layui-input{width:200px;}
</style>


<form class="layui-form" lay-filter="myform">
<input type="hidden" name="id" >

  <div class="layui-form-item">
    <label class="layui-form-label">名称</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="请输入" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <select name="sex" >
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">类型</label>
    <div class="layui-input-block">
      <select name="typeid" >
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">

var id=getQueryString("id");
layui.use(['form',], function(){
	  var form = layui.form;
	  form.on('submit(demo1)', function(data){
		  var s="Book";
		  if(id!=null){
			  s="Book/"+id;
			  data.field._method="PUT";
		  }
		 $.post(s, data.field, function(json) {
			  closeFrame();
			  parent.fresh('demo');
			}, "json");
		    
		    return false;
		  });
});

function init(){
	$.post("Book/"+id,{_method:"GET"}, function(json) {
		render('myform', json);
		getarray("Book/sexs",{_method:"GET"},"[name=sex]",json.sex);
		getlist("Type/list",{_method:"GET"},"[name=typeid]",json.typeid);
	},"json");
	
}
if(id!=null&&id.length>0){
	init();
}else{
	getarray("Book/sexs",{_method:"GET"},"[name=sex]",0);
	getlist("Type/list",{_method:"GET"},"[name=typeid]",0);
}
</script>

</body>
</html>