package Models;

public class RecipeInstructionStep {
    int RecipeInstructionStepID;
    int RecipeID;
    String RecipeInstructionText;
    int isArchived;
    int RecipeInstructionOrderNumber;


    public RecipeInstructionStep() {}

    public void setRecipeInstructionStepID(int RecipeInstructionStepID) {this.RecipeInstructionStepID = RecipeInstructionStepID;}
    public int getRecipeInstructionStepID() {return this.RecipeInstructionStepID;}

    public void setRecipeID(int RecipeID) {this.RecipeID = RecipeID;}
    public int getRecipeID() {return this.RecipeID;}

    public void setRecipeInstructionText(String RecipeInstructionText) {this.RecipeInstructionText = RecipeInstructionText;}
    public String getRecipeInstructionText() {return this.RecipeInstructionText;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}

    public void setRecipeInstructionOrderNumber(int RecipeInstructionOrderNumber) {this.RecipeInstructionOrderNumber = RecipeInstructionOrderNumber;}
    public int getRecipeInstructionOrderNumber() {return this.RecipeInstructionOrderNumber;}

}