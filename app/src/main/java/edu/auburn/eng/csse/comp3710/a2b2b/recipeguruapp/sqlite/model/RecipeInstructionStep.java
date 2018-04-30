package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.sqlite.model;

public class RecipeInstructionStep {
    int RecipeInstructionStepID;
    int RecipeID;
    String RecipeInstructionText;
    int isArchived;


    public RecipeInstructionStep() {}

    public void setRecipeInstructionStepID(int RecipeInstructionStepID) {this.RecipeInstructionStepID = RecipeInstructionStepID;}
    public int getRecipeInstructionStepID() {return this.RecipeInstructionStepID;}

    public void setRecipeID(int RecipeID) {this.RecipeID = RecipeID;}
    public int getRecipeID() {return this.RecipeID;}

    public void setRecipeInstructionText(String RecipeInstructionText) {this.RecipeInstructionText = RecipeInstructionText;}
    public String getRecipeInstructionText() {return this.RecipeInstructionText;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}

}
