package com.example.Assignment_WCD.model;

import com.example.Assignment_WCD.constant.SqlConstant;
import com.example.Assignment_WCD.entity.Food;
import com.example.Assignment_WCD.entity.statusEnum.FoodStatus;
import com.example.Assignment_WCD.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MySqlFoodModel implements FoodModel{
    @Override
    public boolean save(Food food) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.FOOD_INSERT);
            preparedStatement.setString(1,food.getNamefood());
            preparedStatement.setString(2,food.getCategoryid());
            preparedStatement.setString(3,food.getDescription());
            preparedStatement.setString(4,food.getThumbnail());
            preparedStatement.setDouble(5,food.getPrice());
            preparedStatement.setString(8,food.getCreatedAt().toString());
            preparedStatement.setString(9,food.getUpdatedAt().toString());
            preparedStatement.setString(10,food.getDeletedAt().toString());
            preparedStatement.setInt(11,food.getCreatedBy());
            preparedStatement.setInt(12,food.getUpdatedBy());
            preparedStatement.setInt(13,food.getDeletedBy());
            preparedStatement.setInt(14,food.getStatus().getValue());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Food food) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.FOOD_UPDATE);
            preparedStatement.setString(1,food.getNamefood());
            preparedStatement.setString(2,food.getCategoryid());
            preparedStatement.setString(3,food.getDescription());
            preparedStatement.setDouble(4,food.getPrice());
            preparedStatement.setString(5,food.getThumbnail());
            preparedStatement.setString(6,food.getCreatedAt().toString());
            preparedStatement.setString(7,food.getUpdatedAt().toString());
            if (food.getDeletedAt() != null){
                preparedStatement.setString(8,food.getDeletedAt().toString());
            }else {
                preparedStatement.setString(8 , null);
            }
            preparedStatement.setInt(9,food.getCreatedBy());
            preparedStatement.setInt(10,food.getUpdatedBy());
            preparedStatement.setInt(11,food.getDeletedBy());
            preparedStatement.setInt(12,food.getStatus().getValue());
            preparedStatement.setInt(13,id);
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.FOOD_DELETE);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;

        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public Food findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.FOOD_FIND_BY_ID);
            preparedStatement.setInt(1,id);
            preparedStatement.setInt(2, FoodStatus.ACTIVE.getValue());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String namefood = rs.getString("namefood");
                String description = rs.getString("description");
                Double price = rs.getDouble("price");
                String thumbnail = rs.getString("thumbnail");
                LocalDateTime createdAt = rs.getTimestamp("createdAt").toLocalDateTime();
                LocalDateTime updatedAt = rs.getTimestamp("updatedAt").toLocalDateTime();
                LocalDateTime deletedAt = null;
                if (rs.getTimestamp("deletedAt") != null) {
                    deletedAt = rs.getTimestamp("deletedAt").toLocalDateTime();
                }
                int createdBy = rs.getInt("createdBy");
                int updatedBy = rs.getInt("updatedBy");
                int deletedBy = rs.getInt("deletedBy");
                FoodStatus foodStatus = FoodStatus.values()[rs.getInt("status")];
                Food food = new Food(id,namefood,description,price,thumbnail,createdAt,updatedAt,deletedAt,createdBy,updatedBy,deletedBy,foodStatus);
                return food;
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
    @Override
    public List<Food> findByAll() {
        List<Food> foods = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.FOOD_FIND_ALL);
            preparedStatement.setInt(1,FoodStatus.ACTIVE.getValue());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = Integer.parseInt(rs.getString(SqlConstant.FOOD_FIELD_ID));
                String namefood = rs.getString(SqlConstant.FOOD_FIELD_NAME);
                String description = rs.getString(SqlConstant.FOOD_FIELD_DESCRIPTION);
                Double price = rs.getDouble(SqlConstant.FOOD_FIELD_PRICE);
                String thumbnail = rs.getString(SqlConstant.FOOD_FIELD_THUMBNAIL);
                LocalDateTime createdAt = rs.getTimestamp(SqlConstant.FOOD_FIELD_CREATED_AT).toLocalDateTime();
                LocalDateTime updatedAt = rs.getTimestamp(SqlConstant.FOOD_FIELD_UPDATED_AT).toLocalDateTime();
                LocalDateTime deletedAt = null;
                if(rs.getTimestamp(SqlConstant.FOOD_FIELD_DELETED_AT) != null) {
                    deletedAt = rs.getTimestamp(SqlConstant.FOOD_FIELD_DELETED_AT).toLocalDateTime();
                }
                int createdBy = rs.getInt(SqlConstant.FOOD_FIELD_CREATED_BY);
                int updatedBy = rs.getInt(SqlConstant.FOOD_FIELD_UPDATED_BY);
                int deletedBy = rs.getInt(SqlConstant.FOOD_FIELD_DELETED_BY);
                FoodStatus foodStatus = FoodStatus.of(rs.getInt("status"));
                Food food = new Food(id, namefood , description, price, thumbnail, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, foodStatus);
                return foods;
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return foods;
    }

    @Override
    public List<Food> findByAll(int id) {
        return null;
    }
}
