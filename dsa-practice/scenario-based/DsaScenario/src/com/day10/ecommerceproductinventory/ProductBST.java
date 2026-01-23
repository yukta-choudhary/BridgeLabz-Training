package com.day10.ecommerceproductinventory;

//BST operations class
class ProductBST {
 ProductNode root;

 // Insert product
 ProductNode insert(ProductNode root, int sku, String name, double price) {
     if (root == null) {
         return new ProductNode(sku, name, price);
     }

     if (sku < root.sku) {
         root.left = insert(root.left, sku, name, price);
     } else if (sku > root.sku) {
         root.right = insert(root.right, sku, name, price);
     }

     return root;
 }

 // Search product by SKU
 void search(ProductNode root, int sku) {
     if (root == null) {
         System.out.println("Product not found");
         return;
     }

     if (sku == root.sku) {
         System.out.println("Found: " + root.sku + " " + root.name + " ₹" + root.price);
     } else if (sku < root.sku) {
         search(root.left, sku);
     } else {
         search(root.right, sku);
     }
 }

 // Update product price
 void updatePrice(ProductNode root, int sku, double newPrice) {
     if (root == null) {
         System.out.println("Product not found");
         return;
     }

     if (sku == root.sku) {
         root.price = newPrice;
         System.out.println("Price updated");
     } else if (sku < root.sku) {
         updatePrice(root.left, sku, newPrice);
     } else {
         updatePrice(root.right, sku, newPrice);
     }
 }

 // Inorder traversal (sorted SKU)
 void inorder(ProductNode root) {
     if (root != null) {
         inorder(root.left);
         System.out.println(root.sku + " " + root.name + " ₹" + root.price);
         inorder(root.right);
     }
 }
}
