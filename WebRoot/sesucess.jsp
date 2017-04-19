<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>

	你选的课程号：<h4><s:property value="#session.seKch"/></h4>
	<a href="personXk.action">点此查看你的选课情况</a>
  </body>
</html>
