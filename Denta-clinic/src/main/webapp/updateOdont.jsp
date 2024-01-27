<%-- 
    Document   : Register
    Created on : Jan 12, 2024, 11:48:49 PM
    Author     : diazj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/bodyPt1.jsp" %>

<h1>Update Odontologists</h1>
<p>Esto es una prueba</p>

<form class="user">
    <div class="form-group row">
        <div class="col-sm-12 mb-2">
            <input type="text" class="form-control form-control-user" id="exampleDNI"
                   placeholder="DNI">
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleName"
                   placeholder="Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleLastName"
                placeholder="Last Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="examplePhoneNumber"
                placeholder="Phone Number">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleAddress"
                placeholder="Adress">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleBirthDay"
                placeholder="Birth Day">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="exampleSpeciality"
                placeholder="Speciality">
        </div>
    </div>
    
    <a href="#" class="btn btn-primary btn-user btn-block">
        Register Account
    </a>
    <hr>
</form>

<%@include file="Components/bodyPt2.jsp" %>