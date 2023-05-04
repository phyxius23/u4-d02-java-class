import java.util.Date;

public class Customer {

  // attributi di istanza
  int codeCustomer;
  String nameCustomer;
  String emailCustomer;
  Date registrationDate;

  // costruttori
  public Customer(int cc, String nc, String ec, Date rd) {
    this.codeCustomer = cc;
    this.nameCustomer = nc;
    this.emailCustomer = ec;
    this.registrationDate = rd;
  }
}
