public class ExerciseOne {

	public static void main(String[] args) {

    // istanzio gli oggetti
    Rectangle rectangleOne = new Rectangle(32, 24);
    Rectangle rectangleTwo = new Rectangle(29, 13);

    printTwoRectangles(rectangleOne, rectangleTwo);
	}

  public static void printRectangle(Rectangle objRectangle) {
    System.out.println("Il perimetro del rettangolo misura " + objRectangle.perimeter() + " mentre l'area misura " + objRectangle.area());
  }

  public static void printTwoRectangles(Rectangle objRectangleOne, Rectangle objRectangleTwo){
    printRectangle(objRectangleOne);
    printRectangle(objRectangleTwo);

    double sumPerimeter = objRectangleOne.perimeter() + objRectangleTwo.perimeter();
    double sumArea = objRectangleOne.area() + objRectangleTwo.area();

    System.out.println("La somma dei perimetri è di " + sumPerimeter);
    System.out.println("La somma delle aree è di " + sumArea);
  }

}
