package com.annotations.usedeprecated;

//Test class
public class TestLegacy {
 public static void main(String[] args) {

     LegacyAPI api = new LegacyAPI();

     api.oldFeature();   // Warning shown
     api.newFeature();
 }
}
