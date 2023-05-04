public class ExerciseTwo {

  public static void main(String[] args) {

    Call callOne = new Call(3.20, "3280586729");
    Call callTwo = new Call(8.20, "320019364");
    Call callThree = new Call(2.30, "320927364");
    Call callFour = new Call(0.28, "3470395729");
    Call callFive = new Call(32.05, "3920609382");

    Call[] listCall = { callOne, callTwo, callThree, callFour, callFive };

    Sim simOne = new Sim("3280586729", 20.45, listCall);

    simOne.printSim();
  }
}
