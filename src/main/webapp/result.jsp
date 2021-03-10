<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Answer for your question
    </h1>
        <%
            String result= (String) request.getAttribute("answer");
            out.println("<br><b>Answer<b><br><br>");
            out.println(result);
        %>
</body>
</html>
