package com.exmaple.vehicle;

class Vehicle {
    private String color;
    private int door;
    private int window;
    private boolean isWinOpen = false;
    private boolean isDoorOpen = false;

    public Vehicle(String col, int dor, int win) {
        color = col;
        door = dor;
        window = win;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void openWindow() {
        if (window == 0) {
            System.out.println("No window to open!");
        }
        else {
            this.isWinOpen = true;
        }
    }

    public void closeWindow() {
        if (window == 0) {
            System.out.println("No window to close!");
        }
        else {
            this.isWinOpen = false;
        }
    }

    public String winState() {
        if (window == 0) {
            return "no window";
        }
        else {
            return isWinOpen ? "open" : "closed";
        }
    }

    public void openDoor() {
        if (door == 0) {
            System.out.println("No door to open!");
        }
        else {
            this.isDoorOpen = true;
        }
    }

    public void closeDoor() {
        if (door == 0) {
            System.out.println("No door to close!");
        }
        else {
            this.isDoorOpen = false;
        }
    }

    public String doorState() {
        if (door == 0) {
            return "no door";
        }
        else {
            return isDoorOpen ? "open" : "closed";
        }
    }

}

class Truck extends Vehicle {
    private int engine = 600;

    public Truck(String col, int dor, int win) {
        super(col, dor, win);
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}

class Car extends Vehicle {
    private int engine = 450;

    public Car(String col, int dor, int win) {
        super(col, dor, win);
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}

