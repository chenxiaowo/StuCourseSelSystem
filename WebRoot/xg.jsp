<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<html>
  <head>
   
  </head>
  
  <body>

<h2>信息</h2>

	<div style="margin-left:25%">
		<s:form action="modifyXx.action" method="post" >
		
		<s:textfield name="xh" value="%{#session.xsxx.xh}" label="学号"></s:textfield>
		<s:textfield name="xm" value="%{#session.xsxx.xm}" label="姓名"></s:textfield>
		<s:radio list="#{true:'男',false:'女'}" name="xb" value="%{#session.xsxx.xb}" label="性别" ></s:radio>
		<s:textfield name="csrq"  value="%{#session.xsxx.csrq}" label="出生日期"></s:textfield>
		<s:textfield name="zyId"  value="%{#session.xsxx.zyId}" label="专业id"></s:textfield>
		<s:textfield name="zxf"  value="%{#session.xsxx.zxf}" label="总学分"></s:textfield>
		<s:textfield name="bz"  value="%{#session.xsxx.bz}" label="备注"></s:textfield>
		<s:submit/>
		<s:reset/>
	</s:form>
		<a href="xgzp.jsp"><img style="width:75px;height:75px" src="<s:property value="%{#session.xsxx.zp}"/>" ></img></a>
		点击修改
	</div>
  </body>
</html>