<%@ page import="com.example.Assignment_WCD.entity.Category" %>
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
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>createdAt</th>
                                    <th>updateAt</th>
                                    <th>deleteAt</th>
                                    <th>createdBy</th>
                                    <th>updateBy</th>
                                    <th>deleteBy</th>
                                    <th>deleteBy</th>
                                </tr>
                                </thead>
                                <tbody>
                                <%
                                    List<Category> categories = (ArrayList<Category>) request.getAttribute("foodList");
                                    for(Category category : categories) {%>
                                <tr>
                                    <td><%= category.getId() %></td>
                                    <td><%= category.getName() %></td>
                                    <td><%= category.getCreatedAt() %></td>
                                    <td><%= category.getUpdatedAt() %></td>
                                    <td><%= category.getDeletedAt() %></td>
                                    <td><%= category.getCreatedBy() %></td>
                                    <td><%= category.getUpdatedBy() %></td>
                                    <td><%= category.getDeletedBy() %></td>
                                </tr>
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
