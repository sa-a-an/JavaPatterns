package creational.abstractfactory.second_example;

public class VictorianChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair Legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Victorian Char");
    }
}
