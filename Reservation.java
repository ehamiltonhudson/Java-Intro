public class Reservation {
  String reservationName;
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  public Reservation(String name, int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("!! INVALID RESERVATION!");
    }
    reservationName = name;
    guestCount = count;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
  }

  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
      isConfirmed = false;
    }
  }

  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }

  public static void main(String[] args) {
    // Create instances here
    Reservation forHudson = new Reservation("Hudson", 8, 50, true);
    System.out.print(forHudson);
    forHudson.confirmReservation();
    forHudson.informUser();
    System.out.println("---");

    Reservation forTalmadge = new Reservation("Talmadge", 2, 45, false);
    System.out.print(forTalmadge);
    forTalmadge.confirmReservation();
    forTalmadge.informUser();
    System.out.println("---");

    Reservation forMcClary = new Reservation("McClary", 46, 45, true);
    System.out.print(forMcClary);
    forMcClary.confirmReservation();
    forMcClary.informUser();
    System.out.println("---");

    Reservation forKanzow = new Reservation("Kanzow", 0, 100, true);
    System.out.println(forKanzow);
    forKanzow.confirmReservation();
    forKanzow.informUser();
    System.out.println("---");

    Reservation forHargrave = new Reservation("Hargrave", 9, 75, false);
    System.out.println(forHargrave);
    forHargrave.confirmReservation();
    forHargrave.informUser();
    System.out.println("---");
  }

  public String toString() {
    return "Reservation status for the "+ reservationName +" party: ";
  }
}
