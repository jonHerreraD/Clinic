<%-- 
    Document   : showUsers
    Created on : Jan 24, 2024, 9:28:03 PM
    Author     : diazj
--%>

<%@page import="logic.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/bodyPt1.jsp" %>

<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Show Users</h1>
                    <p class="mb-4">Showing a complete users list</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Users</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Username</th>
                                            <th>Role</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                             <th>Id</th>
                                            <th>Username</th>
                                            <th>Role</th>
                                            <th>Action</th>
                                        </tr>
                                    </tfoot>
                                    
                                    <% 
                                    
                                    List<User> usersList = (List) request.getSession().getAttribute("usersList");

                                    %>
                                    
                                    <tbody>
                                        <% for(User usu: usersList){ %>
                                        <tr>
                                            <td id="usu_id<%=usu.getUser_id()%>"><%=usu.getUser_id() %></td>
                                            <td><%=usu.getUserName() %></td>
                                            <td><%=usu.getRole() %></td>
                                           
                                            <td style="display: flex; width: 230px;">
                                                <form name="delete" action="SvDeleteUsers" method="POST"> <!-- Sends code to servlet -->
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;">
                                                        <i class="fas fa-trash-alt"></i> Delete
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getUser_id()%>"><!-- Sends code to servlet -->
                                                </form>
                                                <form name="edit" action="SvEditUsers" method="GET"> <!-- Sends code to servlet -->
                                                    <button type="submit" class="btn btn-primary btn-user btn-block"; style="margin-right: 5px;">
                                                        <i class="fas fa-pencil-alt"></i> Edit
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getUser_id()%>"><!-- Sends code to servlet -->
                                                </form>
                                                
                                            </td>
                                            
                                        </tr>
                                        <% }%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
            
            
<%@include file="Components/bodyPt2.jsp" %>

