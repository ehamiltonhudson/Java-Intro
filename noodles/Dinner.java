class Dinner {

  private void makeNoodles(Noodle noodle, String sauce) {

    System.out.println(noodle + " dinner instructions:");
    noodle.cook();

    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");

  }

  public static void main(String[] args) {

    Dinner meiFunnDinner = new Dinner();
    Noodle meiFunNoodle = new MeiFun();
    meiFunnDinner.makeNoodles(meiFunNoodle, "soy sauce and chili oil");

    Dinner spaetzleDinner = new Dinner();
    Noodle spaetzleNoodle = new Spaetzle();
    spaetzleDinner.makeNoodles(spaetzleNoodle, "cream, grated cheese, and garnish");

  }

}
