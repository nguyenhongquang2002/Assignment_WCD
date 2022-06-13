package com.example.Assignment_WCD.controller.Food;

import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.entity.validation.FoodValidation;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Food food = foodModel.findById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("food", food);
        req.getRequestDispatcher("/admin/view/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String namefood = req.getParameter("namefood");
        String thumbnail = req.getParameter("thumbnail");
        Double price = 0.0;
        if(req.getParameter("price") != "" && req.getParameter("price") != null) {
            price = Double.parseDouble(req.getParameter("price"));
        }
        String description = req.getParameter("description");

        Food food = new Food(id,namefood,thumbnail,price,description);
        req.setAttribute("product", food);
        req.setAttribute("errors", FoodValidation.getFoodErrors());
        req.getRequestDispatcher("/admin/view/food/update.jsp").forward(req, resp);
    }
}
