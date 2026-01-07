package com.day6.parkease;

//ParkingSlot class
public class ParkingSlot {

 private int slotId;
 private boolean isOccupied;           // encapsulated
 private String vehicleTypeAllowed;

 // Constructor
 public ParkingSlot(int slotId, String vehicleTypeAllowed) {
     this.slotId = slotId;
     this.vehicleTypeAllowed = vehicleTypeAllowed;
     isOccupied = false;
 }

 // Book slot internally
 public void occupySlot() {
     isOccupied = true;
 }

 // Free slot internally
 public void freeSlot() {
     isOccupied = false;
 }

 // Check availability
 public boolean isAvailable() {
     return !isOccupied;
 }

 public String getVehicleTypeAllowed() {
     return vehicleTypeAllowed;
 }

 public int getSlotId() {
     return slotId;
 }
}
