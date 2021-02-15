package creational.abstractfactory.second_example;

public class ModernTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Modern Table Legs");
    }

    @Override
    public void putOn() {
        System.out.println("Put on modern Char");
    }
}
