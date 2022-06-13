package com.example.Assignment_WCD.entity.validation;

import com.example.Assignment_WCD.constant.ValidationConstant;
import com.example.Assignment_WCD.entity.Food;

import java.util.HashMap;

public class FoodValidation extends Food {
    private static HashMap<String, String> foodErrors;

    public FoodValidation(String namefood, String description, double price, String thumbnail) {
        super(namefood,description,price,thumbnail);
        foodErrors = new HashMap<>();
    }

    public static HashMap<String, String> getFoodErrors() {
        return foodErrors;
    }

    public boolean isValid() {
        return this.checkValid();
    }

    public boolean checkValid() {
        if(getNamefood() == null || getNamefood() == "") {
            foodErrors.put(ValidationConstant.FOOD_ERROR_KEY_NAMEFOOD, ValidationConstant.FOOD_ERROR_MESSAGE_NAME_REQUIRED);
        }
        if(getPrice() == 0) {
            foodErrors.put(ValidationConstant.FOOD_ERROR_KEY_PRICE, ValidationConstant.FOOD_ERROR_MESSAGE_PRICE_REQUIRED);
        }
        if(getThumbnail() == "" || getThumbnail() == null) {
            foodErrors.put(ValidationConstant.FOOD_ERROR_KEY_THUMBNAIL, ValidationConstant.FOOD_ERROR_MESSAGE_THUMBNAIL_REQUIRED);
        }
        if(getDescription() == "" || getDescription() == null) {
            foodErrors.put(ValidationConstant.FOOD_ERROR_KEY_DESCRIPTION, ValidationConstant.FOOD_ERROR_MESSAGE_DESCRIPTION_REQUIRED);
        }
        return foodErrors.size() == 0;
    }
}
