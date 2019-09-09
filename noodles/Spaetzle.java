class Spaetzle extends Noodle {

  Spaetzle() {
    super(3.0, 1.5, "irregular", "eggs, flour, salt", "German");
    this.texture = "lumpy and liquid";
  }

  @Override
  public void cook () {
    System.out.println("Grinding or scraping dough.");
    System.out.println("Boiling.");
    this.texture = "cooked";
  }

  public String toString() {
    return "Späetzle";
  }

}
