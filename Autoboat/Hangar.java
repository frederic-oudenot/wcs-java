public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 120000);
        Boat titanic = new Boat("Titanic", 120000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());

    }
}
