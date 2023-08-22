<%--
  Created by IntelliJ IDEA.
  User: bruna
  Date: 18/10/2022
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<HTML>
<head><title>Your Balance</title></head>



<body>

<table BORDER=5 ALIGN="CENTER">
    <tr><th CLASS="TITLE">
        Your Balance
</table>

<p>

    <img SRC="assets/imgs/money.jpg" ALIGN="CENTER">

<ul>
    <li>First name: ${regularCustomer.firstName}
    <li>Last name: ${regularCustomer.lastName}
    <li>Account Number: ${regularCustomer.accountNumber}
    <li>Balance: <fmt:formatNumber value="${regularCustomer.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/>

</ul>

<br><br><br>
<a href="index.jsp">Home</a>
</body>
</HTML>
