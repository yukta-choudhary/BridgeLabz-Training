package com.day2.traincompanion;

/*
Doubly Linked List for train compartments
*/

class TrainRoute {

    Node head = null;
    Node tail = null;

    // Add compartment at end
    void addCompartment(String name) {

        Node newNode = new Node(name);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove a compartment
    void removeCompartment(String name) {

        Node temp = head;

        while (temp != null) {

            if (temp.name.equals(name)) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null)
                        head.prev = null;
                } 
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    // Traverse forward
    void forward() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    void backward() {

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    void showAdjacent(String name) {

        Node temp = head;

        while (temp != null) {

            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    System.out.println("Previous: " + temp.prev.name);
                else
                    System.out.println("Previous: None");

                if (temp.next != null)
                    System.out.println("Next: " + temp.next.name);
                else
                    System.out.println("Next: None");

                return;
            }
            temp = temp.next;
        }
    }
}

