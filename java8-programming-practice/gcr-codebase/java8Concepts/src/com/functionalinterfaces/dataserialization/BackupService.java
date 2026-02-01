package com.functionalinterfaces.dataserialization;

public class BackupService {

    public void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj);
        } else {
            System.out.println("Object not eligible for backup.");
        }
    }
}
