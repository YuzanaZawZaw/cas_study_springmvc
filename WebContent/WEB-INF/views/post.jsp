<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>POST PAGE(Spring MVC+Hiberante)</h3>
<c:forEach var="d" items="${postList}">
	${d.title}<br>
</c:forEach>