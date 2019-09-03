public class Cat {
  // string methods practice/review

  public static void main(String[] args) {
    String catName = "Athena (official proper given name)";
    String myCatsName = "My cat is ".concat(catName);
    String catNickname = "goes by 'Theeny'";
    String myCatsNickname = ", and she ".concat(catNickname);
    System.out.println(myCatsName.concat(myCatsNickname));

    String myCat = myCatsName.concat(myCatsNickname);
    System.out.println("(String myCat: length) " + myCat.length());

    // System.out.println("name starts at index " + myCat.indexOf("Athena") );
    // System.out.println("nickname starts at index " + myCat.indexOf("Theeny"));
    // System.out.println("my cat's actual name starts with " + myCat.charAt(10));
    // System.out.println("but her nickname starts with " + myCat.charAt(64));

    System.out.println("my cat's actual name starts at index " + myCat.indexOf("Athena") + " and begins with " + myCat.charAt(10));
    System.out.println("but her nickname starts at index " + myCat.indexOf("Theeny") + " and begins with " + myCat.charAt(64));

    System.out.println(myCat.substring(10, 17));
    String theenyFirstName = myCat.substring(10, 17);
    String theenyNickname = myCat.substring(63).toUpperCase();
    System.out.println(theenyNickname);
    String catNames = theenyFirstName.concat(theenyNickname);
    String theenyFullName = catNames.concat(" Hudson");
    String namesake = "SHE IS NAMED AFTER MY FAVORITE GREEK GODDESS WHO GOVERNED WISDOM, THE ARTS, AND BATTLE STATEGY";
    System.out.println("(String namesake: length) " + namesake.length());

    System.out.println("My precious adorable cat " + namesake.substring(4).toLowerCase() + ". Her full name: " + theenyFullName + "!");
  }

}
