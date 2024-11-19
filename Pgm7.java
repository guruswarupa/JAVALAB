import java.util.Scanner;
// Interface Resizable
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
// Class Rectangle implementing Resizable
class Rectangle implements Resizable {
    private int width;
    private int height;
    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // Method to resize the width
    @Override
    public void resizeWidth(int newWidth) {
        this.width = newWidth;
        System.out.println("New width: " + width);
    }
    // Method to resize the height
    @Override
    public void resizeHeight(int newHeight) {
        this.height = newHeight;
        System.out.println("New height: " + height);
    }
    // Method to display the current dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Current dimensions: " + width + " x " + height);
    }
}
// Main class to test the program
public class Pgm7{
    public static void main(String[] args) {
        // Create a rectangle with width 10 and height 5
        Scanner sc=new Scanner(System.in);

        Rectangle rectangle = new Rectangle(10,5) ;
        rectangle.displayDimensions();
        // Resize the rectangle's width and height
        System.out.println("Enter the new width and height");
        int w=sc.nextInt();
        int h=sc.nextInt();
        rectangle.resizeWidth(w);
        rectangle.resizeHeight(h);
        rectangle.displayDimensions();
    }
}