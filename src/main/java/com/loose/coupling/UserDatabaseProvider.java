package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        //Directly access db from here
        return "User details from DB";
    }
}
