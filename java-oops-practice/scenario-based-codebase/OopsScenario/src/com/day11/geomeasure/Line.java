package com.day11.geomeasure;

//Represents a line segment

public class Line {

 // Encapsulated data
 private int x1, y1, x2, y2;

 // Constructor
 Line(int x1, int y1, int x2, int y2) {
     this.x1 = x1;
     this.y1 = y1;
     this.x2 = x2;
     this.y2 = y2;
 }

 // Calculate length of line
 double getLength() {
     int dx = x2 - x1;
     int dy = y2 - y1;
     return Math.sqrt(dx * dx + dy * dy);
 }
}

