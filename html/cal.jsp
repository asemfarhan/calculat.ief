<%@ page language="java" %>
<!-- CA Gen 8.6 - File Name: cal.jsp - generated on 2016/11/25 (329) at 02:44:24  --> 
<%@ page import="java.util.*" %>
<%
    request.setAttribute("commandLineArguments","calculat.CAL");
    request.setAttribute("numberOfArguments","1");
    request.setAttribute("localName","calculat");
    request.setAttribute("charSet","UTF-8");
    request.setAttribute("referer", request.getRequestURI());
%>
<jsp:forward page="CALServletManager" />
