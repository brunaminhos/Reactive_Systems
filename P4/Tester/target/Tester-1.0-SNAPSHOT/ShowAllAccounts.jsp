<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
<%--
  Created by IntelliJ IDEA.
  User: bruna
  Date: 18/10/2022
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Accounts</title>
</head>

<body>
    <h1>All Accounts</h1>
    <br><br>
    <table width='1000' border='2'>
        <tr>
        <td>Account ID</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Sort Code</td>
        <td>Balance</td>

    </tr>

    <c:forEach items ="${list}" var="anAccount">
        <tr>
            <td><a href="AccountDrillDown?id=${anAccount.accountNumber}">${anAccount.accountNumber}</a></td>
            <td>${anAccount.firstName}</td>
            <td>${anAccount.lastName}</td>
            <td>${anAccount.sortCode}</td>

            <c:choose>
                <c:when test="${anAccount.balance < 0}">
                    <td bgcolor=#FF0000><fmt:formatNumber value="${anAccount.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/>
            </td>
            </c:when>
            <c:otherwise>
                    <td><fmt:formatNumber value="${anAccount.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/>
            </c:otherwise>
            </c:choose>
        </tr>
        </c:forEach>
    </table>
    <br><br><br>
    <a href="index.jsp">Home</a>
</body>
</html>
