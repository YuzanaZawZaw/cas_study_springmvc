<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Fetch 10 Data set from 3 api </h3>
<c:forEach var="d" items="${combineDtoList}">
	${d.id}<br>
	${d.posts.title}<br>
	${d.posts.body}<br>
	${d.products.title}<br>
	${d.products.price}<br>
	${d.quotes.author}<br>
	${d.quotes.quote}<br>
</c:forEach>