<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<!-- 输出普通字符 -->
${message } <br/>
<!-- 输出List -->
<p>书籍列表</p>
<c:forEach items="${bookList}" var="node">
    <c:out value="${node}"></c:out>
</c:forEach>
<br/>
<br/>

<!-- 输出Map -->
<c:forEach items="${map}" var="node">
    姓名：<c:out value="${node.key}"></c:out>
    住址：<c:out value="${node.value}"></c:out>
    <br/>
</c:forEach>
</body>
</html>