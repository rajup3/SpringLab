<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1><a href="<c:url value="/" />">spring lab</a></h1>

<h2>${msg}</h2>

<div id="tabs">
	<ul>
		<li><a href="#simple">Simple</a></li>
		<li><a href="#mapping">Request Mapping</a></li>
		<li><a href="#data">Request Data</a></li>
		<li><a href="#responses">Response Writing</a></li>
		<li><a href="#messageconverters">Message Converters</a></li>
		<li><a href="#views">View Rendering</a></li>
		<li><a href="#convert">Type Conversion</a></li>
		<li><a href="#validation">Validation</a></li>
		<li><a href="<c:url value="/form" />" title="forms">Forms</a></li>
		<li><a href="<c:url value="/fileupload" />" title="fileupload">File Upload</a></li>
		<li><a href="#exceptions">Exception Handling</a></li>
		<li><a href="#redirect">Redirecting</a></li>
        <li><a href="#async">Async Requests</a></li>
    </ul>
    <div id="simple">
		<h2>Simple</h2>
		<p>
			See the <code>org.springframework.samples.mvc.simple</code> package for the @Controller code
		</p>
		<ul>
			<li>
				<a id="simpleLink" class="textLink" href="<c:url value="/simple.do" />">GET /simple-annotation-based-method-level-controller</a>
			</li>
			<li>
				<a id="simplePathLink" class="textLink" href="<c:url value="/simple/path.do" />">GET /simple/path-annotation-based-method-level-controller</a>
			</li>
			
		</ul>
	</div>
</div>
	
<!-- /form:form-->
</body>
</html>


