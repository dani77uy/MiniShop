<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template"%>
<%@ taglib prefix="header" tagdir="/WEB-INF/tags/header"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/footer"%>
<%@ taglib prefix="login" tagdir="/WEB-INF/tags/login"%>


<template:page pageTitle="${pageTitle}"> 
	<login:userandpassword/>
</template:page>