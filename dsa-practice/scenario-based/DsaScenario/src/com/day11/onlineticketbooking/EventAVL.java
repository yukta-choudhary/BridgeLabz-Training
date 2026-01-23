package com.day11.onlineticketbooking;
class EventAVL {

    int height(EventNode n) {
        return n == null ? 0 : n.height;
    }

    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        y.left = x.right;
        x.right = y;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(EventNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    EventNode insert(EventNode node, int time, String event) {
        if (node == null)
            return new EventNode(time, event);

        if (time < node.time)
            node.left = insert(node.left, time, event);
        else
            node.right = insert(node.right, time, event);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = getBalance(node);

        if (bal > 1 && time < node.left.time)
            return rightRotate(node);

        if (bal < -1 && time > node.right.time)
            return leftRotate(node);

        return node;
    }

    void inorder(EventNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.time + " - " + root.event);
            inorder(root.right);
        }
    }
}

