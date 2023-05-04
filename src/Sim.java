import java.util.Arrays;

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

  // funzione che stampa i dati della SIM
  public void printSim() {
    String arrListCalls = Arrays.toString(this.callList);

    System.out.println("Numero di telefono: " + this.numberPhone + "\nCredito disponibile: " + this.creditAvailable
        + "\nLista delle chiamate: " + arrListCalls);
  }
}
