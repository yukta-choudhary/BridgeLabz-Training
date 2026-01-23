package com.day11.hospitalqueuemanagement;

class HospitalAVL {

    int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        y.left = x.right;
        x.right = y;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PatientNode insert(PatientNode node, int time, String name) {
        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = getBalance(node);

        if (bal > 1 && time < node.left.time)
            return rightRotate(node);

        if (bal < -1 && time > node.right.time)
            return leftRotate(node);

        return node;
    }

    void display(PatientNode root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.time + " - " + root.name);
            display(root.right);
        }
    }
}
