package com.example.Assignment_WCD.entity.statusEnum;

public enum FoodStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINE(2);

    private int value;

    FoodStatus(int value){this.value = value;}

    public int getValue() {
        return value;
    }

    public static FoodStatus of (int value){
        for (FoodStatus foodStatus : FoodStatus.values()){
            if(foodStatus.getValue() == value){
                return foodStatus;
            }
        }
        return FoodStatus.UNDEFINE;
    }
}
