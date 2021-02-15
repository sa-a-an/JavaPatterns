package creational.abstractfactory.second_example;

public class VictorianTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Table Legs");
    }

    @Override
    public void putOn() {
        System.out.println("Put on Victorian Char");
    }
}
