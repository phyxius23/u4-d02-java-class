public class Cart {

  // attributi di istanza
  String associatedCustomer;
  Product[] listProducts;
  double totalCostProducts;

  // costruttori
  public Cart(String ac, Product[] lp, double tcp) {
    this.associatedCustomer = ac;
    this.listProducts = lp;
    this.totalCostProducts = tcp;
  }
}
