public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  boolean isARescue;
  String rescuedBy;

  public Dog(String dogBreed, boolean dogOwned, int dogYears, boolean isRescueDog, String nameOfRescuer) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
    isARescue = isRescueDog;
    rescuedBy = nameOfRescuer;
  }

  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4, true, "Heath");
    Dog nunzio = new Dog("shiba inu", true, 12, true, "Mia");
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    boolean areBothDogsRescues = nunzio.isARescue == fido.isARescue;
    boolean haveSameOwners = fido.rescuedBy == nunzio.rescuedBy;
    System.out.println("It is " + areBothDogsRescues + " that Nunzio and Fido are both rescues");
    System.out.println("It is " + haveSameOwners + " that Nunzio and Fido have the same owners");
    String namesOfOwners = "Nunzio is owned by " + nunzio.rescuedBy + " and Fido is owned by " + fido.rescuedBy;
    System.out.println(namesOfOwners);
    System.out.println(" ");
    System.out.println("Main method finished");
  }
}
