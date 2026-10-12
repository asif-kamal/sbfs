package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserDetails());

        UserDataProvider webService = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webService);
        System.out.println(userManagerWithWS.getUserDetails());

    }
}
