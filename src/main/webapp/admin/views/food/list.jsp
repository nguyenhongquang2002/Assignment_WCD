<%@ page import="com.example.Assignment_WCD.entity.Food" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>
<body>
<div class="wrapper">
    <jsp:include page="/admin/components/sidebar.jsp"/>
    <div class="main">
        <jsp:include page="/admin/components/navbar.jsp"/>
        <main class="content">
            <div class="container-fluid p-0">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card flex-fill">
                            <div class="card-header">

                                <h5 class="card-title mb-0">Latest Projects</h5>
                            </div>
                            <table class="table table-hover my-0">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th class="d-none d-xl-table-cell">Name Food</th>
                                    <th class="d-none d-xl-table-cell">category Id</th>
                                    <th class="d-none d-md-table-cell">Description</th>
                                    <th class="d-none d-md-table-cell">thumbnail</th>
                                    <th class="d-none d-md-table-cell">price</th>
                                    <th class="d-none d-md-table-cell">createdAt</th>
                                    <th class="d-none d-md-table-cell">updateAt</th>
                                    <th class="d-none d-md-table-cell">deleteAt</th>
                                    <th class="d-none d-md-table-cell">createdBy</th>
                                    <th class="d-none d-md-table-cell">updateBy</th>
                                    <th class="d-none d-md-table-cell">deleteBy</th>
                                    <th class="d-none d-md-table-cell">deleteBy</th>
                                    <th>Status</th>
                                </tr>
                                </thead>
                                <tbody>
                                <%
                                    List<Food> foods = (ArrayList<Food>) request.getAttribute("foodList");
                                    for(Food food : foods) {%>
                                <tr>
                                    <td><%= food.getId() %></td>
                                    <td><%= food.getNamefood() %></td>
                                    <td><%= food.getCategoryid() %></td>
                                    <td><%= food.getDescription() %></td>
                                    <td><%= food.getThumbnail() %></td>
                                    <td><%= food.getPrice() %></td>
                                    <td><%= food.getCreatedAt() %></td>
                                    <td><%= food.getUpdatedAt() %></td>
                                    <td><%= food.getDeletedAt() %></td>
                                    <td><%= food.getCreatedBy() %></td>
                                    <td><%= food.getUpdatedBy() %></td>
                                    <td><%= food.getDeletedBy() %></td>
                                    <td>
                                        <a class="btn btn-primary" href="/foods/update?id=<%= food.getId() %>">Edit</a>
                                        <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal<%= food.getId() %>">Delete</button>
                                        <!-- Modal -->
                                        <div class="modal fade" id="exampleModal<%= food.getId() %>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLabel">Delete foods</h5>
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                    </div>
                                                    <div class="modal-body">
                                                        Are you sure delete <%= food.getNamefood() %>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                                        <a href="/foods/delete?id=<%= food.getId() %>" class="btn btn-danger">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </td>
                                        <%}%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page="/admin/components/footer.jsp"/>
        <jsp:include page="/admin/components/scripts.jsp"/>
    </div>
</div>
</body>
</html>