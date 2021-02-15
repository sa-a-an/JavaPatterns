package creational.abstractfactory.second_example;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa Legs");
    }

    @Override
    public void layOn() {
        System.out.println("Lay on modern Char");
    }
}
