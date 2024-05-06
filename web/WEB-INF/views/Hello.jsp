<%-- 
    Document   : Hello
    Created on : May 6, 2024, 1:44:14 PM
    Author     : grhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Todo App</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .todo-card {
        background-color: #f9f9f9;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        margin-bottom: 10px;
        padding: 10px;
    }
    .todo-card .topic {
        font-weight: bold;
    }
    .todo-card .description {
        margin-top: 5px;
    }
    .todo-card .actions {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-top: 10px;
    }
    .todo-card .actions button {
        cursor: pointer;
        padding: 5px 10px;
        border: none;
        border-radius: 3px;
        transition: background-color 0.3s ease;
    }
    .todo-card .actions .complete {
        background-color: green;
        color: white;
    }
    .todo-card .actions .edit {
        background-color: #007bff;
        color: white;
    }
    .todo-card .actions .delete {
        background-color: #dc3545;
        color: white;
    }
    .todo-card.completed {
        background-color: #e0e0e0;
    }
</style>
</head>
<body>
<div class="todo-card">
    <div class="topic"><%=request.getParameter("name")%></div>
    <div class="description"><%=request.getParameter("description")%></div>
    <div class="State"><%=request.getParameter("state")%></div>

    <div class="actions">
        <button class="complete">Complete</button>
        <button class="edit">Edit</button>
        <button class="delete">Delete</button>
    </div>
</div>
</body>
</html>

