package com.day2.medinventory;

class Item {
    String id;
    String name;
    int qty;
    String expiry;

    Item(String id, String name, int qty, String expiry) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.expiry = expiry;
    }

    // Used for removing duplicates
    public boolean equals(Object o) {
        Item i = (Item) o;
        return this.id.equals(i.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

