package birds;

public class BirdManagementDemo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();
        Bird ostrich = new Ostrich();
        Bird genericBird = new Bird();

        demonstrateFlying(sparrow);
        demonstrateFlying(penguin);
        demonstrateFlying(ostrich);
        demonstrateFlying(genericBird);
    }

    public static void demonstrateFlying(Bird bird) {
        try {
            bird.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
