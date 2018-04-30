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

    public void getFirstName() {
        this.FirstName = FirstName;
    }
















}
