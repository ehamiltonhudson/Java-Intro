class Pho extends Noodle {

  Pho() {
    super(30.0, 0.64, "flat", "rice flour", "Vietnamese");
  }

  @Override
  public String getCookPrep() {
    return "Soak pho for 1 hour, then boil for 1 minute in broth. Serve w/ hoisin sauce, bean sprouts, and jalapeno. Add slice of lime and garnish with cilantro.";
  }

  public String toString() {
    return "Pho";
  }

}
