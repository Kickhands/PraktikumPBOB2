    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2

public class Square {
    private double side;

    // Constructor to initialize the side length of the square
    public Square(double side) {
        this.side = side;
    }

    // Method to get the side length of the square
    public double getSide() {
        return side;
    }

    // Method to calculate the area of the square
    public double calculateArea() {
        return side * side;
    }
}
