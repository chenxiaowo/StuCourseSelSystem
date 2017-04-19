<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>login</title>
  </head>
  
  <body>
  <img src="images/banner.jpg"></img>
  	<div  align="center" style="margin-top: 5%">
  	<s:form action="login.action" method="post" theme="simple">
  		学号：<s:textfield name="dlb.xh"></s:textfield>
  		<br/>
  		口令：<s:textfield name="dlb.kl"></s:textfield>
  		<br/>
  		<div style="margin-top:10px">
  			<s:submit value="登录" ></s:submit>
  		<s:reset value="重置"></s:reset>
  		</div>
  	</s:form>
  </div>
  	
  </body>
</html>