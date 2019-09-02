public class Order {
  String itemName;
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order(String item, boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    itemName = item;
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }

    double shippingCost = calculateShipping();

    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }

  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50;
    }
    return shippingCost;
  }

  public static void main(String[] args) {
    // create instances and call methods here!
    Order boots = new Order("thigh high black boots", false, 25.00, "Regular");
    System.out.println(boots);
    boots.ship();
    Order bag = new Order("Fjallraven backpack", true, 30.00, "Express");
    System.out.println(bag);
    bag.ship();
    Order catFood = new Order("Merrick wet cat food cans", true, 15.00, "");
    String catFoodShipment = bag.itemName + " shipment details:";
    System.out.println(catFood);
    catFood.ship();
  }

  public String toString() {
    return "shipping details for " + itemName.toUpperCase() + ":";
  }
}
