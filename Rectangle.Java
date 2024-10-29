/**
 * The Rectangle class represents a rectangle shape
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Constructs a new Rectangle with specified width and length.
     *
     * @param width  The width of the rectangle.
     * @param area
     * @param length
     * @param height The height of the rectangle.
     */ 
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of the rectangle.
     * gets the width and length of the rectangle
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the rectangle.
     *
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param height The new height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return The perimeter of the square.
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    /**
     * Main method for testing the Rectangle class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

