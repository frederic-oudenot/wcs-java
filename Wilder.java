public class Wilder {
  String firstname;
  boolean aware;

  public Wilder(String firstname, boolean aware) {
      this.firstname = firstname;
      this.aware = aware;
  }

  public String getFirtname() {
      return this.firstname;
  }

  public String getAware() {
      return this.aware ? "je suis aware." : "je ne suis aware.";
  }

  public String whoIAm(){
      return "Je m'appelle " + this.getFirtname() + " et "+this.getAware();
  }
}