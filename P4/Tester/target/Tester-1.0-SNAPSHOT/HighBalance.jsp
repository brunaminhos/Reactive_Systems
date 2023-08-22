<%--
  Created by IntelliJ IDEA.
  User: bruna
  Date: 18/10/2022
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<HTML>
<head> <title>Your Balance</title></head>

<body>
<table BORDER=5 ALIGN="CENTER">
    <tr><th CLASS="TITLE"> Your Balance
</table>
<P>

<imeg center SRC="assets/imgs/boat.jpg" ALIGN="CENTER">
<BR>

It is an honour to serve you,
${eliteCustomer.firstName}
${eliteCustomer.lastName} !
<P>
    Since you are one of our most valued customers, we would like
    to offer you the opportunity to spend a mere fraction of your
    <br> <fmt:formatNumber value="${eliteCustomer.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/>

    on a boat worthy of your status.
    Please visit our <a href="http://www.princess.co.uk/">boat store</a> for
    more information.

    <br><br><br>
    <a href="index.jsp">Home</a>
</body>
</HTML>
