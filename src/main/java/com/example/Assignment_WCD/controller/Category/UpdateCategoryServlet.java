package com.example.Assignment_WCD.controller.Category;

import com.example.Assignment_WCD.entity.Category;
import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.entity.validation.FoodValidation;
import com.example.Assignment_WCD.model.CategoryModel;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlCategoryModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category = categoryModel.findById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("category", category);
        req.getRequestDispatcher("/admin/view/category/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Category category = new Category(id,name);
        req.setAttribute("category", category);
        req.setAttribute("errors", FoodValidation.getFoodErrors());
        req.getRequestDispatcher("/admin/view/category/update.jsp").forward(req, resp);
        }
    }
