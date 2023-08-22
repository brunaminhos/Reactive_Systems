<%--
  Created by IntelliJ IDEA.
  User: bruna
  Date: 18/10/2022
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<HTML>
<head><title>You Owe Us Money!</title></head>

<body>

<table BORDER=5 ALIGN="CENTER">
    <TR><TH CLASS="TITLE">
        We Know Where You Live!
</table>

<p>
    <img SRC="assets/imgs/mace.jpg" ALIGN="LEFT">

    <b>${badCustomer.lastName}</b>, we know where you live.
<p>
    Pay us the <fmt:formatNumber value="${badCustomer.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/>
    you owe us before it is too late!

    <br><br><br>
    <a href="index.jsp">Home</a>
</body>

</HTML>
