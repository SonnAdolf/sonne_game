<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>Sonn Game</title>
  </head>
  <body>
        <p>Hello.Here is Sonne's New website Sonn_Game</p>
        <c:forEach items="${lst}" var="usr" >
                    <p>Usrname is ${usr.usrname} and usr's passwd is ${usr.passwd}</p>
        </c:forEach>
  </body>
</html>
