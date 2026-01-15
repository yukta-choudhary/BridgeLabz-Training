package com.day3.parceltracker;



public class Parcel {
    String parcelId;
    StageNode head; // start of linked list

    public Parcel(String parcelId) {
        this.parcelId = parcelId;
        this.head = null;
    }

    // Add stage at end
    public void addStage(String stageName) {
        StageNode newNode = new StageNode(stageName);
        if (head == null) {
            head = newNode;
        } else {
            StageNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Stage '" + stageName + "' added.");
    }

    // Add stage after a specific stage
    public void addStageAfter(String prevStage, String stageName) {
        StageNode temp = head;
        while (temp != null && !temp.stageName.equals(prevStage)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Previous stage not found!");
            return;
        }
        StageNode newNode = new StageNode(stageName);
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Stage '" + stageName + "' added after '" + prevStage + "'.");
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("No stages available for this parcel!");
            return;
        }
        System.out.println("Tracking Parcel: " + parcelId);
        StageNode temp = head;
        while (temp != null) {
            System.out.println("→ " + temp.stageName);
            temp = temp.next;
        }
    }
}
