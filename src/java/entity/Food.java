/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nguye
 */
public class Food{
    private int foodId;
    private String foodName;
    private String foodImage;
    private double foodPrice;
    private String foodTile;
    private String foodDesctiption;
    private String categoryID;
    private int foodAvailability;
    private double foodWeight;
    private String foodImage2;
    private String foodImage3;
    private String foodImage4;
    private int SellID;
    
    public Food() {
    }

    public void setFoodImage2(String foodImage2) {
        this.foodImage2 = foodImage2;
    }

    public void setFoodImage3(String foodImage3) {
        this.foodImage3 = foodImage3;
    }

    public void setFoodImage4(String foodImage4) {
        this.foodImage4 = foodImage4;
    }

    public void setSellID(int SellID) {
        this.SellID = SellID;
    }

    public String getFoodImage2() {
        return foodImage2;
    }

    public String getFoodImage3() {
        return foodImage3;
    }

    public String getFoodImage4() {
        return foodImage4;
    }

    public int getSellID() {
        return SellID;
    }

    public Food(int foodId, String foodName, String foodImage, double foodPrice, String foodTile, String foodDesctiption, String categoryID, int foodAvailability, double foodWeight, String foodImage2, String foodImage3, String foodImage4, int SellID) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.foodTile = foodTile;
        this.foodDesctiption = foodDesctiption;
        this.categoryID = categoryID;
        this.foodAvailability = foodAvailability;
        this.foodWeight = foodWeight;
        this.foodImage2 = foodImage2;
        this.foodImage3 = foodImage3;
        this.foodImage4 = foodImage4;
        this.SellID = SellID;
    }

    public Food(int foodId, String foodName, String foodImage, double foodPrice, String foodTile, String foodDesctiption) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.foodTile = foodTile;
        this.foodDesctiption = foodDesctiption;
    }

    public Food(int foodId, String foodName, String foodImage, double foodPrice, String foodTile, String foodDesctiption, String categoryID, int foodAvailability, double foodWeight, String foodImage2, String foodImage3, String foodImage4) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.foodTile = foodTile;
        this.foodDesctiption = foodDesctiption;
        this.categoryID = categoryID;
        this.foodAvailability = foodAvailability;
        this.foodWeight = foodWeight;
        this.foodImage2 = foodImage2;
        this.foodImage3 = foodImage3;
        this.foodImage4 = foodImage4;
    }

    public Food(int foodId, String foodName, String foodImage, double foodPrice, String foodTile, String foodDesctiption, String CategoryID, int FoodAvailability, double FoodWeight) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodImage = foodImage;
        this.foodPrice = foodPrice;
        this.foodTile = foodTile;
        this.foodDesctiption = foodDesctiption;
        this.categoryID = CategoryID;
        this.foodAvailability = FoodAvailability;
        this.foodWeight = FoodWeight;
    }

    public void setCategoryID(String CategoryID) {
        this.categoryID = CategoryID;
    }

    public void setFoodAvailability(int FoodAvailability) {
        this.foodAvailability = FoodAvailability;
    }

    public void setFoodWeight(double FoodWeight) {
        this.foodWeight = FoodWeight;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public int getFoodAvailability() {
        return foodAvailability;
    }

    public double getFoodWeight() {
        return foodWeight;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodTile() {
        return foodTile;
    }

    public String getFoodDesctiption() {
        return foodDesctiption;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodTile(String foodTile) {
        this.foodTile = foodTile;
    }

    public void setFoodDesctiption(String foodDesctiption) {
        this.foodDesctiption = foodDesctiption;
    }

    @Override
    public String toString() {
        return "Food{" + "foodId=" + foodId + ", foodName=" + foodName + ", foodImage=" + foodImage + ", foodPrice=" + foodPrice + ", foodTile=" + foodTile + ", foodDesctiption=" + foodDesctiption + '}';
    }

    
}
