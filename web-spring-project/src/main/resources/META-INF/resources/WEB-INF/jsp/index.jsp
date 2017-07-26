<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<link href="css/web-project.css" rel="stylesheet"/>

<body>

<p>This is some text.</p>

<div style="color:#0000FF">
  <h3>This is a heading in a div element</h3>
  <p>This is some text in a div element.</p>
</div>
${testMe}
<p class="test">This is some text.</p>
<c:forEach items="${cofeeList}" var="item">
    ${item.color}<br>
</c:forEach>
${no}
 <form:form method = "POST" action = "/test" modelAttribute="coffeeForm">
         <table>
            <tr>
               <td><form:input path = "coffee"/>
  </td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
      </form:form>
      <img id="dragnea" src="images/dragnea.jpg">
<%@include file="maps.jsp" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="js/web-project.js"></script>
</body>

</html>