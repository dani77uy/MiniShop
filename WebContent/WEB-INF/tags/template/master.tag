<%@ tag body-content="scriptless"  %>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true" %>
<!DOCTYPE html>
<html>
<head>
  	<title>
		${not empty pageTitle ? pageTitle : 'Mini Shop SGI'}
	</title>
</head>
<jsp:doBody/>
</html>