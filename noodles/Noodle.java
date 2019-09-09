public class Noodle {

  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  protected String ingredients;
  protected String cuisineOrigin;
  protected String texture = "brittle";

  Noodle(double lenInCent, double wthInCent, String shp, String ingr, String origin) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    this.cuisineOrigin = origin;

  }

  final public boolean isTasty() {
    return true;
  }

  public void cook() {
    this.texture = "cooked";
  }

  public String getCookPrep() {
    return "Boil for 7 minutes and add sauce.";
  }

  public static void main(String[] args) {

    Noodle ramen, pho, spaghetti, somyeon, meiFun, spaetzle;

    ramen = new Ramen();
    pho = new Pho();
    spaghetti = new Spaghetti();
    somyeon = new Somyeon();
    meiFun = new MeiFun();
    spaetzle = new Spaetzle();

    Noodle[] allTheNoodles = {ramen, pho, spaghetti, somyeon, meiFun, spaetzle};

    for (Noodle noodle : allTheNoodles) {
      System.out.println(noodle + ": " + noodle.getCookPrep());
    }

  }

}
