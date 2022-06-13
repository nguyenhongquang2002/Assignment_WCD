package com.example.Assignment_WCD.controller.Category;

import com.example.Assignment_WCD.entity.Category;
import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.model.CategoryModel;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlCategoryModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categoryList = categoryModel.findByAll();
        req.setAttribute("categoryList", categoryList);
        req.getRequestDispatcher("admin/view/category/list.jsp").forward(req, resp);
    }
}
