package com.example.Assignment_WCD.controller.Food;

import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.entity.statusEnum.FoodStatus;
import com.example.Assignment_WCD.model.FoodModel;
import com.example.Assignment_WCD.model.MySqlFoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteFoodServlet extends HttpServlet {
    private FoodModel foodModel;

    @Override
    public void init() throws ServletException {
        foodModel = new MySqlFoodModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Food food = foodModel.findById(id);
        food.setStatus(FoodStatus.DELETED);
        food.setDeletedAt(LocalDateTime.now());
        if(foodModel.update(id, food)) {
            resp.sendRedirect("admin/view/food/list.jsp");
        }
    }
}
