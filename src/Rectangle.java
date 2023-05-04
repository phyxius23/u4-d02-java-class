
public class Rectangle {

  // attributi di istanza
	double width;
	double height;

  // costruttori
  public Rectangle(double width, double height) {
    this.height = height;
    this.width = width;
  }

  // metodi
  public double area() {
    return this.width * this.height;
  }

  public double perimeter() {
    return 2 * (this.width + this.height);
  }
}
