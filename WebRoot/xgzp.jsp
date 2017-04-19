<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>修改照片</title>
</head>
<body>
	<s:form action="upload.action" method="post" enctype="multipart/form-data">
		<s:file name="upload" label="选择图片"></s:file>
		<s:submit value="上传"></s:submit>
	</s:form>
	
	
</body>
</html>
