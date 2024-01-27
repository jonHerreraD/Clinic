<%-- 
    Document   : editUsers
    Created on : Jan 25, 2024, 10:50:53 PM
    Author     : diazj
--%>

<%@page import="logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file= "Components/bodyPt1.jsp" %>

<h1>Edit Users</h1>
<p>This section is for editing the existing users</p>

<% User usu = (User)request.getSession().getAttribute("editUser"); %>

<form class="user" action="SvEditUsers" method="POST">
    
    <div class="form-group row">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleUserName" name="exampleUserName"
                   placeholder="User" value="<%=usu.getUserName() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="examplePassword" name="examplePassword"
                   placeholder="Password" value="<%=usu.getPassword() %>">
        </div>
        <div class="col-sm-12 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleRole" name="exampleRole"
                   placeholder="Role" value="<%=usu.getRole() %>">
        </div>
    </div>
    
    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Save Changes
    </button>
    <hr>
</form>
<%@include file = "Components/bodyPt2.jsp" %>
