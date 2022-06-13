package com.example.Assignment_WCD.controller.Category;

import com.example.Assignment_WCD.entity.Category;
import com.example.Assignment_WCD.model.CategoryModel;
import com.example.Assignment_WCD.model.MySqlCategoryModel;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/view/category/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String name = req.getParameter("name");
        Category category = new Category(name);
            req.setAttribute("name", name);
            req.getRequestDispatcher("admin/view/category/create.jsp").forward(req, resp);
        }
    }
