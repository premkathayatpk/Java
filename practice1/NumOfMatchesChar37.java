public class NumOfMatchesChar37 {
  static int numberOfMatches(String a, String b) {
    int count = 0;
    int i = 0;
    while (i < a.length() && i < b.length()) {
      if (a.charAt(i) == b.charAt(i))
        count++;
      i++;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(numberOfMatches("Bookclub", "Bookcase"));

  }

}
