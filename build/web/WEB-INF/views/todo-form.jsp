<%-- 
    Document   : todo-form
    Created on : May 6, 2024, 3:32:23 PM
    Author     : grhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.2);
            animation: form-animation 0.3s ease-in;
}

@keyframes form-animation {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

        form {
            margin-top: 20px;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="button"] {
            padding: 8px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="button"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
    


    <body> 
        
        
        <!-- if form method is post , it will run get methode inside the post method in route servlet -->
 <div class="container">
     
    <form action="insert" method="post">
        
        <h3>Todo Name : <input type="text" name="name"></h3>
        <h3>Todo Description : <input type="text" name="description"></h3>
        <h3>Todo State : <input type="text" name="state"></h3><br>
        <input type="submit" value="Submit">
        
    </form>
</div>
        
    </body>
</html>
