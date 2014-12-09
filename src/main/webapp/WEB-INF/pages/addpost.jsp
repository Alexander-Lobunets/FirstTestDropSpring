<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alobunets
  Date: 12/8/2014
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Post Information</h2>
<form:form method="POST" action="/SpringMVC/addPost">
  <table>
    <tr>
      <td><form:label path="title">Name</form:label></td>
      <td><form:input path="title" /></td>
    </tr>
    <tr>
      <td><form:label path="body">Age</form:label></td>
      <td><form:input path="body" /></td>
    </tr>
    <tr>
      <td><form:label path="username">Username</form:label></td>
      <td><form:input path="username" /></td>
    </tr>
    <tr>
      <td><form:label path="postDate">Postdate</form:label></td>
      <td><form:input path="postDate" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>

</body>
</html>
