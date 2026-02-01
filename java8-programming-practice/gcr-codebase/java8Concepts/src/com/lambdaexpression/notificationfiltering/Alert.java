package com.lambdaexpression.notificationfiltering;

class Alert {
    String message;
    String type;
    int severity;

    Alert(String message, String type, int severity) {
        this.message = message;
        this.type = type;
        this.severity = severity;
    }

    public String toString() {
        return type + " | Severity: " + severity + " | " + message;
    }
}
