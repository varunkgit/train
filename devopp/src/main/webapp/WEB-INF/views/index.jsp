<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<title>welcome, Devopp</title>
<body>
<form:form modelAttribute="associate" method="post" action="saveAssociateDetails">
First Name : <form:input path="firstName"></form:input>
Last Name  : <form:input path="lastName"></form:input>
<input type ="submit" value="Submit Associate">
</form:form>
</body>
</html>