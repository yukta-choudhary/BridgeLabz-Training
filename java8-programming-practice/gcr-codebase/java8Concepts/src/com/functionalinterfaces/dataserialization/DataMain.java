package com.functionalinterfaces.dataserialization;

public class DataMain {

    public static void main(String[] args) {

        BackupService service = new BackupService();

        UserData user = new UserData("John", "john@email.com");
        TempSessionData temp = new TempSessionData("S12345");

        service.backup(user);
        service.backup(temp);
    }
}
