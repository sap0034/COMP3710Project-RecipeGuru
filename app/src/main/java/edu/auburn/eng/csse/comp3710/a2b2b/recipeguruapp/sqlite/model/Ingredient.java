package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.sqlite.model;

public class Ingredient {
    int IngredientID;
    int RecipeID;
    int MeasurementID;
    int isArchived;
    int IngredientAmount;
    String IngredientText;


public Ingredient() {}

//getters and setters

    public void setIngredientID(int IngredientID) {this.IngredientID = IngredientID;}
    public int getIngredientID() {return this.IngredientID;}

    public void setRecipeID(int RecipeID) {this.RecipeID = RecipeID;}
    public int getRecipeID() {return this.RecipeID;}

    public void setMeasurementID(int MeasurementID) {this.MeasurementID = MeasurementID;}
    public int getMeasurementID() {return this.MeasurementID;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}

    public void setIngredientText(String IngredientText) {this.IngredientText = IngredientText;}
    public String getIngredientText() { return this.IngredientText;}

    public void setIngredientAmount(int IngredientAmount) {this.IngredientAmount = IngredientAmount;}
    public int getIngredientAmount() {return this.IngredientAmount;}
}
