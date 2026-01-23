package com.day10.musicapp;
//Node class for song
class SongNode {
 int trackId;
 String title;
 String artist;
 SongNode left, right;

 // Constructor
 SongNode(int trackId, String title, String artist) {
     this.trackId = trackId;
     this.title = title;
     this.artist = artist;
     left = right = null;
 }
}
