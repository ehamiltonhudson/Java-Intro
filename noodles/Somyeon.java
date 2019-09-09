class Somyeon extends Noodle {

  Somyeon() {
    super(65.0, 0.35, "thin round", "wheat flour, salt, water", "Korea");
  }

  @Override
  public String getCookPrep() {
    return "Boil in water for 3 minutes, then put them in a bowl of hot flavored broth. Add raw vegetables, sauces, speaces and seasoning.";
  }

  public String toString() {
    String somyeonDetails = "Can be eaten in hot or cold dishes. They cook quickly and should be kept long.";
    return "Somyeon" + " (" + somyeonDetails + ")";
  }

}
