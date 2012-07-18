<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head><title>Hello !</title></head>
    <body>
        <h1>Test properties load with Spring3/Jndi :</h1>
        <ul>
            <li><b>url:</b> ${urlProperty}</li>
            <li><b>login:</b> ${loginProperty}</li>
            <li><b>password:</b> ${passwordProperty}</li>
            <li><b>optionalProperty:</b> ${optionalProperty}</li>
        </ul>
    </body>
</html>
