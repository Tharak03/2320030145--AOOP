package workersystem;

public class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("The human is working.");
    }

    @Override
    public void eat() {
        System.out.println("The human is eating.");
    }
}
