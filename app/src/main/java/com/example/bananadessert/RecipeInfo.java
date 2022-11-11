package com.example.bananadessert;

public class RecipeInfo {
    private String foodName;
    private String foodIntro;
    private String foodIngredients;
    private String foddInstruction;
    private int foodImage;

    public RecipeInfo(String foodName, String foodIntro, String foodIngredients, String foddInstruction, int foodImage) {
        this.foodName = foodName;
        this.foodIntro = foodIntro;
        this.foodIngredients = foodIngredients;
        this.foddInstruction = foddInstruction;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodIntro() {
        return foodIntro;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public String getFoddInstruction() {
        return foddInstruction;
    }

    public int getFoodImage() {
        return foodImage;
    }

}
