<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<fieldset>
	<legend>LOGIN</legend>
	<form:form method="post" action="checklogin.htm" commandName="loginForm">
		<ul>
			<li><form:label path="username">Usuario</form:label>
				<form:input path="username" /></li>
			<li><form:label path="password">Contrase&ntilde;a</form:label>
				<form:password path="password" /></li>
		</ul>
		<br />
		<form:label path="rememberme">Recordar</form:label>
		<form:checkbox path="rememberme" />
		<br/>
		<input type="submit" value="Login"/>
		<input type="reset" value="Cancelar"/>
	</form:form>
</fieldset>
