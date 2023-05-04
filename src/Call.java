public class Call {

  // attributi di istanza
  double length = 0.00;
  String calledNumber = "0000000000";

  // costruttori
  public Call(double length, String number) {
    this.length = length;
    this.calledNumber = number;
  }

  @Override
  public String toString() {
    return "Durata chiamata: " + this.length + ", Numero Chiamato: " + this.calledNumber;
  }
}
