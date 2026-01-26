package com.annotations.usedeprecated;

//Legacy API class
public class LegacyAPI {

 // Old method
 @Deprecated
 public void oldFeature() {
     System.out.println("Old feature");
 }

 // New method
 public void newFeature() {
     System.out.println("New feature");
 }
}
