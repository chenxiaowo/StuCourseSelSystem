<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<html>
  <head>
   
  </head>
  
  <body>

<h2>信息</h2>

	<div style="margin-left:10%">
		<table border="1">
	 <s:iterator value="#session.kcs" id="kc" status="status">
		<tr>
			
			<td><s:property value="#kc.kch"/></td>
			<td><s:property value="#kc.kcm"/></td>
			<td><s:property value="#kc.kxxq"/></td>
			<td><s:property value="#kc.xs"/></td>
			<td><s:property value="#kc.xf"/></td>
			<td><s:property value="#kc.skjs"/></td>
			<td><s:property value="#kc.skdd"/></td>
			<td><s:form action="selectkc" method="post">
					<s:hidden name="seKch" value="%{#kc.kch}"/>
					<s:submit value="选择"></s:submit>
				</s:form>
			</td>
			
		</tr>
		</s:iterator>
	</table>
	</div>
	
  </body>
</html>