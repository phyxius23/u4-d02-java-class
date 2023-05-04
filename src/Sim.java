public class Sim {
  
  // attributi
  String numberPhone;
  double creditAvailable;
  Call[] callList = new Call[5];

  // costruttori
  public Sim(String number, double credit, Call[] list) {
    this.numberPhone = number;
    this.creditAvailable = credit;
    this.callList = list;
  }
  public Sim() {

  }
}
