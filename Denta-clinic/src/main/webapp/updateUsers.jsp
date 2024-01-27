<%-- 
    Document   : updateUsers
    Created on : Jan 21, 2024, 11:15:27 PM
    Author     : diazj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file= "Components/bodyPt1.jsp" %>

<h1>Update Users</h1>
<p>This section is for update new users</p>

<form class="user" action="SvUsers" method="POST">
    
    <div class="form-group row">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleUserName" name="exampleUserName"
                   placeholder="User Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="examplePassword" name="examplePassword"
                placeholder="Password">
        </div>
        <div class="col-sm-12 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleRole" name="exampleRole"
                placeholder="Role">
        </div>
    </div>
    
    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Create User
    </button>
    <hr>
</form>
<%@include file = "Components/bodyPt2.jsp" %>
