public class ClassRoom {
  public static void main(String[] args) {
      Wilder jc = new Wilder("Jean-Claude", true);
      Wilder henri = new Wilder("Henri", false);

      System.out.println(jc.whoIAm());
      System.out.println(henri.whoIAm());

  }
}