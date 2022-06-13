package com.example.Assignment_WCD.constant;

public class SqlConstant {
    public static final String FOOD_INSERT = "INSERT INTO foods (namefood, categoryid, description, thumbnail, price," +
            "createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String FOOD_UPDATE = "UPDATE foods SET namefood = ?, categoryid = ?, description = ?, thumbnail = ?, price = ?" +
            "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?, status = ? WHERE id = ?;";
    public static final String FOOD_DELETE = "DELETE FROM foods WHERE id = ?;";
    public static final String FOOD_FIND_BY_ID = "SELECT * FROM foods WHERE id = ? AND status = ?;";
    public static final String FOOD_FIND_ALL = "SELECT * FROM foods WHERE status = ?;";
    public static final String FOOD_FIELD_STATUS = "status";
    public static final String FOOD_FIELD_ID = "id";
    public static final String FOOD_FIELD_NAME = "name";
    public static final String FOOD_FIELD_DESCRIPTION = "description";
    public static final String FOOD_FIELD_PRICE = "price";
    public static final String FOOD_FIELD_THUMBNAIL = "thumbnail";
    public static final String FOOD_FIELD_CREATED_AT = "createdAt";
    public static final String FOOD_FIELD_UPDATED_AT = "updatedAt";
    public static final String FOOD_FIELD_DELETED_AT = "deletedAt";
    public static final String FOOD_FIELD_CREATED_BY = "createdBy";
    public static final String FOOD_FIELD_UPDATED_BY = "updatedBy";
    public static final String FOOD_FIELD_DELETED_BY = "deletedBy";

    public static final String CATEGORY_INSERT = "INSERT INTO category ( name " +
            "createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String CATEGORY_UPDATE = "UPDATE category SET name = ? " +
            "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?, status = ? WHERE id = ?;";
    public static final String CATEGORY_DELETE = "DELETE FROM category WHERE id = ?;";
    public static final String CATEGORY_FIND_BY_ID = "SELECT * FROM category WHERE id = ? AND status = ?;";
    public static final String CATEGORY_FIND_ALL = "SELECT * FROM category WHERE status = ?;";
    public static final String CATEGORY_FIELD_STATUS = "status";
    public static final String CATEGORY_FIELD_ID = "id";
    public static final String CATEGORY_FIELD_NAME = "name";
    public static final String CATEGORY_FIELD_CREATED_AT = "createdAt";
    public static final String CATEGORY_FIELD_UPDATED_AT = "updatedAt";
    public static final String CATEGORY_FIELD_DELETED_AT = "deletedAt";
    public static final String CATEGORY_FIELD_CREATED_BY = "createdBy";
    public static final String CATEGORY_FIELD_UPDATED_BY = "updatedBy";
    public static final String CATEGORY_FIELD_DELETED_BY = "deletedBy";
}
