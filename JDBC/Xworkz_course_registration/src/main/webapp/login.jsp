<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="getNameByEmailAndPassword" method="post">
        <input type = "text" placeholder = "enter the email" name = "email"/>
        <input type = "text" placeholder = "enter the password" name = "password"/>
        <input type = "submit" value = "Submit"/>
        <p>${name}</p>
    </form>
</body>
</html>