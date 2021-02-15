package creational.abstractfactory.second_example;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair Legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on modern Char");
    }
}
