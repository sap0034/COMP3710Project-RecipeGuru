package Models;

public class Recipe {
    int RecipeID;
    String RecipeName;
    String CookTime;
    String PrepTime;
    String TotalTime;
    int Servings;
    int isFavorite;
    int isArchived;
    int AccountID;

    //constructor
    public Recipe() {}

    public Recipe(String RecipeName, String CookTime, String PrepTime, String TotalTime, int Servings) {
        this.RecipeName = RecipeName;
        this.CookTime = CookTime;
        this.PrepTime = PrepTime;
        this.TotalTime = TotalTime;
        this.Servings = Servings;
    }

    public Recipe(int RecipeID, int AccountID, String RecipeName, String CookTime, String PrepTime, String TotalTime, int Servings) {
        this.RecipeID = RecipeID;
        this.RecipeName = RecipeName;
        this.CookTime = CookTime;
        this.PrepTime = PrepTime;
        this.TotalTime = TotalTime;
        this.Servings = Servings;
        this.AccountID = AccountID;
    }

    public Recipe(int RecipeID, int AccountID, String RecipeName, String CookTime, String PrepTime, String TotalTime, int Servings, int isFavorite) {
        this.RecipeID = RecipeID;
        this.RecipeName = RecipeName;
        this.CookTime = CookTime;
        this.PrepTime = PrepTime;
        this.TotalTime = TotalTime;
        this.Servings = Servings;
        this.isFavorite = isFavorite;
        this.AccountID = AccountID;
    }

    //getters and setters
    public void setRecipeID(int RecipeID) {this.RecipeID = RecipeID;}
    public int getRecipeID() {return this.RecipeID;}

    public void setRecipeName(String RecipeName) {this.RecipeName = RecipeName;}
    public String getRecipeName() {return this.RecipeName;}

    public void setCookTime(String CookTime) {this.CookTime = CookTime;}
    public String getCookTime() {return this.CookTime;}

    public void setPrepTime(String PrepTime) {this.PrepTime = PrepTime;}
    public String getPrepTime() {return this.PrepTime;}

    public void setTotalTime(String TotalTime) {this.TotalTime = TotalTime;}
    public String getTotalTime() {return this.TotalTime;}

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }
    public int getAccountID() {
        return this.AccountID;
    }

    public void setServings(int Servings) {this.Servings = Servings;}
    public int getServings(){return this.Servings;}

    public void setIsFavorite(int isFavorite) {this.isFavorite = isFavorite;}
    public int getIsFavorite() {return this.isFavorite;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}


}
