package banat1.tect_10__17.hw;

public class Box {
    private final double size;  // Size is final, cannot be changed after creation
    private String color;
    private boolean isOpen;      // To track if the box is open or closed
    private String item;         // To hold an item if placed in the box

    // Constructor to initialize size and color
    public Box(double size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = false;      // Box is closed by default
        this.item = null;         // No item initially in the box
    }

    // Method to open the box
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The box is now open.");
        } else {
            System.out.println("The box is already open.");
        }
    }

    // Method to close the box
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The box is now closed.");
        } else {
            System.out.println("The box is already closed.");
        }
    }

    // Method to change the color of the box
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("The box color has been changed to " + newColor + ".");
    }

    // Method to put an item into the box
    public void putItem(String item) {
        if (isOpen) {
            if (this.item == null) {
                this.item = item;
                System.out.println("Item \"" + item + "\" has been placed in the box.");
            } else {
                System.out.println("The box already contains an item: \"" + this.item + "\".");
            }
        } else {
            System.out.println("You must open the box before placing an item in it.");
        }
    }

    // Method to take an item from the box
    public void takeItem() {
        if (isOpen) {
            if (this.item != null) {
                System.out.println("You have taken the item: \"" + this.item + "\" from the box.");
                this.item = null;  // Remove the item from the box
            } else {
                System.out.println("The box is empty. There is no item to take.");
            }
        } else {
            System.out.println("You must open the box before taking an item from it.");
        }
    }

    // Method to print information about the box
    public void printInfo() {
        System.out.println("Box Info:");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Is Open: " + (isOpen ? "Yes" : "No"));
        System.out.println("Current Item: " + (item != null ? item : "No item in the box"));
    }
}