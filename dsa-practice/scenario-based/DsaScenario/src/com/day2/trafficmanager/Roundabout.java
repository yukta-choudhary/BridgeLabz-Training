package com.day2.trafficmanager;

/*
Circular Linked List for roundabout
*/

class Roundabout {

    Node head = null;

    // Add car to roundabout
    void addCar(String car) {

        Node newNode = new Node(car);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove car from roundabout
    void removeCar(String car) {

        if (head == null)
            return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.car.equals(car)) {

                if (curr == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Display roundabout
    void display() {

        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.car + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.car + ")");
    }
}
