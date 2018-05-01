package Models;

public class RecipeImage {
    int RecipeImageID;
    String RecipeImagePath;
    int isArchived;
    int RecipeID;

    public RecipeImage() {}

    public RecipeImage(String RecipeImagePath, int RecipeID) {
        this.RecipeImagePath = RecipeImagePath;
        this.RecipeID = RecipeID;
    }

    public RecipeImage(int RecipeImageID, String RecipeImagePath, int RecipeID) {
        this.RecipeImageID = RecipeImageID;
        this.RecipeImagePath = RecipeImagePath;
        this.RecipeID = RecipeID;
    }


    public void setRecipeImageID(int RecipeImageID) {this.RecipeImageID = RecipeImageID;}
    public int getRecipeImageID() {return RecipeImageID;}

    public void setRecipeImagePath(String RecipeImagePath) {this.RecipeImagePath = RecipeImagePath;}
    public String getRecipeImagePath() {return RecipeImagePath;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}

    public void setRecipeID(int RecipeID) {this.RecipeID = RecipeID;}
    public int getRecipeID() {return this.RecipeID;}

}
