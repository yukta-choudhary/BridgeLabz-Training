package com.day1.travellog;

import java.io.Serializable;

//Serializable Trip object
class Trip implements Serializable {
 String city;
 String country;
 int days;
 String notes;

 Trip(String city, String country, int days, String notes) {
     this.city = city;
     this.country = country;
     this.days = days;
     this.notes = notes;
 }
}
