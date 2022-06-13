package com.example.Assignment_WCD.controller.Food;

import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/view/food/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String namefood = req.getParameter("namefood");
        String categoryid = req.getParameter("categoryid");
        String description = req.getParameter("description");
        String thumbnail = req.getParameter("thumbnail");
        Double price = Double.parseDouble(req.getParameter("price"));
        Food food = new Food(namefood,categoryid,description,thumbnail,price);
        req.setAttribute("food", food);
        req.getRequestDispatcher("/food/create.jsp").forward(req, resp);
    }
}
