package com.tight.coupling;

public class UserDatabase {

    public String getUserDetails() {
        //Directly access db from here
        return "User details from DB";
    }
}
