<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<html>
  <head>
   
  </head>
  
  <body>

<h2>信息</h2>
	
	<div style="margin-left: 25%">
	学号：<s:property value="#session.xsxx.xh"/><br/>
	姓名：<s:property value="#session.xsxx.xm"/><br/>
	性别：<s:if test='#session.xsxx.xb==true'>男</s:if>
		<s:else>女</s:else><br/>
	出生日期：<s:property value="#session.xsxx.csrq"/>
	<br/>
	专业id：<s:property value="#session.xsxx.zyId"/>
	<br/>
	总学分：<s:property value="#session.xsxx.zxf"/>
	<br/>
	备注：<s:property value="#session.xsxx.bz"/>
	<br/>
	照片:<img style="width:75px;height:75px" src="<s:property value="%{#session.xsxx.zp}"/>"></img>
	<br/>
	
	<br/>
	<a href="javascript:history.go(-1);">返回</a>
		</div>
	
  </body>
</html>