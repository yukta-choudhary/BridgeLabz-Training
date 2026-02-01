package com.day2.utility;

import java.util.Optional;

public class UtilityOptionalDemo {

    public static void main(String[] args) {

        // 1. Config value
        String config = null;
        Optional<String> configOpt =
                Optional.ofNullable(config);
        System.out.println("Config: " +
                configOpt.orElse("default-config"));

        // 2. Environment variable
        Optional<String> env =
                Optional.ofNullable(System.getenv("JAVA_HOME"));
        System.out.println("JAVA_HOME: " +
                env.orElse("Not Set"));

        // 3. Default file path
        Optional<String> filePath =
                Optional.ofNullable(null);
        System.out.println("File Path: " +
                filePath.orElse("/home/default"));

        // 4. API response
        Optional<String> apiResponse =
                Optional.ofNullable(null);
        System.out.println("API Response: " +
                apiResponse.orElse("No Response"));

        // 5. User preferences
        Optional<String> preference =
                Optional.ofNullable("Dark Mode");
        preference.ifPresent(p ->
                System.out.println("Preference: " + p));
    }
}
