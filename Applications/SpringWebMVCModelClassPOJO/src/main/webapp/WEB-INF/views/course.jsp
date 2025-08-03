<%@ page contentType="text/html; charset=UTF-8" language="java" %>


<html>
<head>
    <title>Course Details</title>
</head>
<body>

    <h2>Course Information</h2>

    <table border="1" cellpadding="10">
        <tr>
            <td><strong>Course ID:</strong></td>
            <td>${course.cid}</td>
        </tr>
        <tr>
            <td><strong>Course Name:</strong></td>
            <td>${course.cname}</td>
        </tr>
        <tr>
            <td><strong>Course Cost:</strong></td>
            <td>${course.cost}</td>
        </tr>
    </table>

</body>
</html>
