import java.util.ArrayList;
import java.util.Arrays;

class Playground {

  public static void main(String[] args) {

    int minutesLeft = 30;
    System.out.println(minutesLeft + " MINUTES LEFT ON THE PLAYGROUND!");
    String currentActivity = "";

    ArrayList<String> activities = new ArrayList<String>();
    activities.add("jungle gym");
    activities.add("monkey bars");
    activities.add("sandbox");
    activities.add("slide");
    activities.add("igloo");
    activities.add("fireman's pole");
    activities.add("climbing rope");
    activities.add("hopscotch");

    ArrayList<Integer> activityTimes = new ArrayList<Integer>();
    activityTimes.add(2);
    activityTimes.add(7);
    activityTimes.add(5);
    activityTimes.add(1);
    activityTimes.add(4);
    activityTimes.add(1);
    activityTimes.add(3);
    activityTimes.add(5);

    for (int i = 0; i < activityTimes.size(); i++) {
      minutesLeft -= activityTimes.get(i);
      System.out.println("currently playing on " + activities.get(i));
      System.out.println(minutesLeft + " mins left");
    }

    for (int activityTime : activityTimes) {
      if (activityTime < minutesLeft && minutesLeft > 0) {
        int finalActivity = activityTimes.indexOf(activityTime);
        minutesLeft -= activityTime;
        System.out.println(minutesLeft + " min left for: " + activities.get(finalActivity));
      }
    }

     System.out.println("NO MORE TIME");

  }
}
