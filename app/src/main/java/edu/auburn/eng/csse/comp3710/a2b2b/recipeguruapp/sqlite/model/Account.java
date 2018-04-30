package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.sqlite.model;

/**
 * Created by sap00 on 4/29/2018.
 */

public class Account {
    int AccountID;
    String FirstName;
    String LastName;
    String EmailAddress;
    String AccountCreatedDatetime;
    int isArchived;
    String Password;


    //constructor
    public Account() {

    }

    public Account(String FirstName, String Lastname, String EmailAddress, String Password) {
        this.FirstName = FirstName;
        this.LastName = Lastname;
        this.EmailAddress = EmailAddress;
        this.Password = Password;
    }
    public Account(int AccountID, String FirstName, String Lastname, String EmailAddress, String Password) {
        this.AccountID = AccountID;
        this.FirstName = FirstName;
        this.LastName = Lastname;
        this.EmailAddress = EmailAddress;
        this.Password = Password;
    }

    //getters and setters
    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }
    public int getAccountID() {
        return this.AccountID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getFirstName() {return this.FirstName; }

    public void setLastName(String LastName) {this.LastName = LastName;}
    public String getLastName() {return this.LastName;}

    public void setEmailAddress(String EmailAddress) {this.EmailAddress = EmailAddress;}
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    public void setAccountCreatedDatetime(String AccountCreatedDatetime) {this.AccountCreatedDatetime = AccountCreatedDatetime;}
    public String getAccountCreatedDatetime() {return this.AccountCreatedDatetime;}

    public void setIsArchived(int isArchived) {this.isArchived = isArchived;}
    public int getIsArchived() {return this.isArchived;}

    public void setPassword(String Password) {this.Password = Password;}
    public String getPassword() {return this.Password;}

}
