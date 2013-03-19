<%@ tag body-content="scriptless"  %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/footer" %>
<%@ taglib prefix="header" tagdir="/WEB-INF/tags/header"  %>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true" %>
<template:master pageTitle="${pageTitle}">
	<jsp:body>
	    <header:header/>
		<div class="main">
			<jsp:doBody/>
		</div>
		<footer:footer/>
	</jsp:body>
</template:master>