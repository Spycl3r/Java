package com.exmaple.vehicle;

class TestDrive {
    public static void main(String[] args) {

        // Truck
        System.out.println("This is a truck");
        Truck tr = new Truck("Silver",4, 4);
        System.out.println("Truck color: "+tr.getColor());
        System.out.println("Truck HP: "+tr.getEngine());
        System.out.println("Truck have window(s): "+tr.getWindow());
        System.out.println("Truck have door(s): "+tr.getDoor());

        System.out.println("Window is: "+tr.winState());
        System.out.println("Door is: "+tr.doorState());
        tr.openWindow();
        tr.openDoor();
        System.out.println("Window is: "+tr.winState());
        System.out.println("Door is: "+tr.doorState());

        tr.closeWindow();
        tr.closeDoor();
        System.out.println("Window is: "+tr.winState());
        System.out.println("Door is: "+tr.doorState());
        System.out.println("");

        // Sport / Race car
        System.out.println("This is a sport/race car");
        Car sc = new Car("Red",2, 2);
        sc.setColor("Hot Pink");
        sc.setEngine(9000);
        sc.setDoor(0);
        sc.setWindow(0);
        System.out.println("Car color: "+sc.getColor());
        System.out.println("Car HP: "+sc.getEngine());
        System.out.println("Car have window(s): "+sc.getWindow());
        System.out.println("Car have door(s): "+sc.getDoor());

        System.out.println("Car window is: "+sc.winState());
        System.out.println("Car door is: "+sc.doorState());
        sc.openWindow();
        sc.openDoor();
        System.out.println("Car window is: "+sc.winState());
        System.out.println("Car door is: "+sc.doorState());
        sc.closeWindow();
        sc.closeDoor();
        System.out.println("Car window is: "+sc.winState());
        System.out.println("Car door is: "+sc.doorState());
    }
}
