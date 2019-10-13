<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 11-10-19
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/css; charset =utf-8"/>
<head>
    <title>Product Discount Calculator</title>

</head>
<body>
<h1> Product Discount </h1>
<form method="post" action="/percent">
    <label>Product Description</label><input type="text" name="txt_description"/>
    <label>List Price</label> <input type="text" name="txt_price"/>
    <lable>Discount Percent</lable><input type="text" name="txt_percent"/>
    <input type="submit" id ="submit" value="percent"/>

</form>
</body>
</html>
