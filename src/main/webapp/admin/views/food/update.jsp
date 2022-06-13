<%@ page import="com.example.Assignment_WCD.entity.Food" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.Assignment_WCD.constant.ValidationConstant" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>
<body>
<%
    Food food = (Food) request.getAttribute("food");
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
                            <form action="/admin/views/food/update" method="post">
                                <input type="hidden" name="id" value="<%= food.getId() %>" />
                                <fieldset class="form-group">
                                    <label>NameFood</label> <input type="text"  class="form-control" name="name" value="<%= food.getNamefood() %>">
                                    <% if(errors.containsKey(ValidationConstant.FOODS_ERROR_KEY_NAMEFOOD)) { %>
                                    <% } %>
                                </fieldset>
                                <fieldset class="form-group">
                                    <label>CategoryId</label> <input type="number"  class="form-control" name="categoryid" value="<%= food.getCategoryid() %>">
                                    <% if(errors.containsKey(ValidationConstant.FOODS_ERROR_KEY_CATEGORYID)) { %>
                                    <% } %>
                                </fieldset>
                                <fieldset class="form-group">
                                    <label>Thumbnail</label> <input type="text"  class="form-control" name="thumbnail" value="<%= food.getThumbnail() %>">
                                    <% if(errors.containsKey(ValidationConstant.FOODS_ERROR_KEY_THUMBNAIL)) { %>
                                    <% } %>
                                </fieldset>
                                <fieldset class="form-group">
                                    <label>Price</label> <input type="number"  class="form-control" name="price"value="<%= food.getPrice() %>">
                                    <% if(errors.containsKey(ValidationConstant.FOODS_ERROR_KEY_PRICE)) { %>
                                    <% } %>
                                </fieldset>
                                <fieldset class="form-group">
                                    <label>Description</label> <textarea  class="form-control" name="description" ><%= food.getDescription() %></textarea>
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
