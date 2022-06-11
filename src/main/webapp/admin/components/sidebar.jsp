<nav id="sidebar" class="sidebar">
        <div class="sidebar-content js-simplebar">
            <a class="sidebar-brand" href="index.html">
                <span class="align-middle">AdminKit</span>
            </a>

            <ul class="sidebar-nav">
                <li class="sidebar-header">
                    Pages
                </li>

                <li class="sidebar-item active">
                    <a class="sidebar-link" href="/admin/views/index.jsp">
                        <i class="align-middle" data-feather="sliders"></i> <span class="align-middle">Dashboard</span>
                    </a>
                </li>

<%--                <li class="sidebar-item">--%>
<%--                    <a class="sidebar-link" href="pages-profile.html">--%>
<%--                        <i class="align-middle" data-feather="user"></i> <span class="align-middle">Profile</span>--%>
<%--                    </a>--%>
<%--                </li>--%>

<%--                <li class="sidebar-item">--%>
<%--                    <a class="sidebar-link" href="pages-settings.html">--%>
<%--                        <i class="align-middle" data-feather="settings"></i> <span class="align-middle">Settings</span>--%>
<%--                    </a>--%>
<%--                </li>--%>

<%--                <li class="sidebar-item">--%>
<%--                    <a class="sidebar-link" href="pages-invoice.html">--%>
<%--                        <i class="align-middle" data-feather="credit-card"></i> <span class="align-middle">Invoice</span>--%>
<%--                    </a>--%>
<%--                </li>--%>

<%--                <li class="sidebar-item">--%>
<%--                    <a class="sidebar-link" href="pages-blank.html">--%>
<%--                        <i class="align-middle" data-feather="book"></i> <span class="align-middle">Blank</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
                <li class="sidebar-item">
                    <a data-target="#forms" data-toggle="collapse" class="sidebar-link collapsed">
                        <i class="align-middle" data-feather="list"></i> <span class="align-middle">Category</span>
                    </a>
                    <ul id="forms" class="sidebar-dropdown list-unstyled collapse " data-parent="#sidebar">
                        <li class="sidebar-item"><a class="sidebar-link" href="/admin/category/from">Form Category</a></li>
                        <li class="sidebar-item"><a class="sidebar-link" href="/admin/category/list">List Category</a></li>
                    </ul>
                </li>
                <li class="sidebar-item">
                    <a data-target="#ui" data-toggle="collapse" class="sidebar-link collapsed">
                        <i class="align-middle" data-feather="briefcase"></i> <span class="align-middle">Product</span>
                    </a>
                    <ul id="ui" class="sidebar-dropdown list-unstyled collapse " data-parent="#sidebar">
                        <li class="sidebar-item"><a class="sidebar-link" href="/admin/product/from">Form Product</a></li>
                        <li class="sidebar-item"><a class="sidebar-link" href="/admin/product/list">List Product</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>