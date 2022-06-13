package com.example.Assignment_WCD.controller.Food;

import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Food> foodList = foodModel.findByAll();
        req.setAttribute("foodList", foodList);
        req.getRequestDispatcher("admin/view/food/list.jsp").forward(req, resp);
    }
}
