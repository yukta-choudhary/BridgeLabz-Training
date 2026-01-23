package com.day11.gamingapp;
//AVL Tree operations
class LeaderboardAVL {

 int height(PlayerNode n) {
     return n == null ? 0 : n.height;
 }

 int getBalance(PlayerNode n) {
     return n == null ? 0 : height(n.left) - height(n.right);
 }

 PlayerNode rightRotate(PlayerNode y) {
     PlayerNode x = y.left;
     y.left = x.right;
     x.right = y;

     y.height = Math.max(height(y.left), height(y.right)) + 1;
     x.height = Math.max(height(x.left), height(x.right)) + 1;

     return x;
 }

 PlayerNode leftRotate(PlayerNode x) {
     PlayerNode y = x.right;
     x.right = y.left;
     y.left = x;

     x.height = Math.max(height(x.left), height(x.right)) + 1;
     y.height = Math.max(height(y.left), height(y.right)) + 1;

     return y;
 }

 // Insert or update player by score
 PlayerNode insert(PlayerNode node, String name, int score) {
     if (node == null)
         return new PlayerNode(name, score);

     if (score > node.score)
         node.right = insert(node.right, name, score);
     else if (score < node.score)
         node.left = insert(node.left, name, score);
     else
         return node;

     node.height = 1 + Math.max(height(node.left), height(node.right));
     int balance = getBalance(node);

     if (balance > 1 && score < node.left.score)
         return rightRotate(node);

     if (balance < -1 && score > node.right.score)
         return leftRotate(node);

     if (balance > 1 && score > node.left.score) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     if (balance < -1 && score < node.right.score) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // Reverse inorder = highest score first
 void showTopPlayers(PlayerNode root) {
     if (root != null) {
         showTopPlayers(root.right);
         System.out.println(root.name + " : " + root.score);
         showTopPlayers(root.left);
     }
 }
}
