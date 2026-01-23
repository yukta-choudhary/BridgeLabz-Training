package com.day10.musicapp;
//BST operations class
class SongBST {
 SongNode root;

 // Insert song (sorted by title)
 SongNode insert(SongNode root, int id, String title, String artist) {
     if (root == null) {
         return new SongNode(id, title, artist);
     }

     if (title.compareToIgnoreCase(root.title) < 0) {
         root.left = insert(root.left, id, title, artist);
     } else {
         root.right = insert(root.right, id, title, artist);
     }

     return root;
 }

 // Search song by track ID
 void searchById(SongNode root, int id) {
     if (root == null) return;

     if (root.trackId == id) {
         System.out.println("Found: " + root.trackId + " " +
                            root.title + " - " + root.artist);
         return;
     }

     searchById(root.left, id);
     searchById(root.right, id);
 }

 // Inorder traversal (alphabetical order)
 void inorder(SongNode root) {
     if (root != null) {
         inorder(root.left);
         System.out.println(root.title + " (" + root.trackId +
                            ") - " + root.artist);
         inorder(root.right);
     }
 }
}
