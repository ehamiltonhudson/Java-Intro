import java.util.Arrays;

public class Classroom {

  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;
    mathScores[1] = 85.0;
    mathScores[2] = 76.8;
    mathScores[3] = 90.75;
    String numOfStudents = "The number of students in the class is "+students.length;
    System.out.println(numOfStudents);
    String sade = students[0] + "'s math score: " + mathScores[0];
    String alexus = students[1] + "'s math score: " + mathScores[1];
    String sam = students[2] + "'s math score: " + mathScores[2];
    String koma = students[3] + "'s math score: " + mathScores[3];
    System.out.println(sade);
    System.out.println(alexus);
    System.out.println(sam);
    System.out.println(koma);
  }
}
