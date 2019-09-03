import java.util.ArrayList;

class List {

  public static void main(String[] args) {
    ArrayList<String> dreamConcerts = new ArrayList<String>();

    String artist1 = "Yeah Yeah Yeahs";
    String artist2 = "The Rolling Stones";
    String artist3 = "Lizzo";
    String artist4 = "Flume";
    String artist5 = "Lykke Li";
    String artist6 = "Jack White";
    String artist7 = "Banks";
    String artist8 = "Metric";

    dreamConcerts.add(artist1);
    dreamConcerts.add(artist2);
    dreamConcerts.add(artist3);
    dreamConcerts.add(artist4);
    dreamConcerts.add(artist5);
    dreamConcerts.add(artist6);
    dreamConcerts.add(artist7);
    dreamConcerts.add(artist8);

    System.out.println("number of dream artists to see live in concert: " + dreamConcerts.size() + " " + dreamConcerts);

    System.out.println("the top artist listed is: " + dreamConcerts.get(0));

    dreamConcerts.set(5, "Janelle Monáe");
    System.out.println("changed Jack White to Janelle Monáe: " + dreamConcerts);

    System.out.println("Flume is listed at position #" + dreamConcerts.indexOf("Flume"));

    dreamConcerts.remove("Metric");
    System.out.println("removed Metric, new number of dream concerts: " + dreamConcerts.size() + " " + dreamConcerts);
  }

}
