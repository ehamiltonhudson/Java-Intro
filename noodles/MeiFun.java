class MeiFun extends Noodle {

  MeiFun() {
    super(33.5, 0.635, "round", "wheat flour, egg salt, water", "Chinese");
    this.texture = "crispy and dry";
  }

  @Override
  public void cook () {
    System.out.println("Pre-soak until tender");
    System.out.println("Boiling.");
    this.texture = "cooked";
  }

  @Override
  public String getCookPrep() {
    return "Afer pre-soaking, boil 2-3 minutes if fresh, 5-6 minutes if dry. Stir-fry vegetables with terriyaki, hoisin, or soy sauce and add noodles toward the end of cooking.";
  }

  public String toString() {
    return "Mei Fun";
  }

}
