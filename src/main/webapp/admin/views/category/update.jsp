<%@ page import="com.example.Assignment_WCD.entity.Category" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.Assignment_WCD.constant.ValidationConstant" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>
<body>
<%
    Category category = (Category) request.getAttribute("category");
    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");
    if(errors == null) {
        errors = new HashMap<>();
    }
%>
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
                            <form action="/admin/views/category/update" method="post">
                                <input type="hidden" name="id" value="<%= category.getId() %>" />
                                <fieldset class="form-group">
                                    <label>Name</label> <input type="text"  class="form-control" name="name" value="<%= category.getName() %>">
                                    <% if(errors.containsKey(ValidationConstant.CATEGORYS_ERROR_KEY_NAME)) { %>
                                    <% } %>
                                </fieldset>
                                <button type="submit" class="btn btn-success">Save</button>
                            </form>
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
