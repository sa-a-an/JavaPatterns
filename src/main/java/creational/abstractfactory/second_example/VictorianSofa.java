package creational.abstractfactory.second_example;

public class VictorianSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa Legs");
    }

    @Override
    public void layOn() {
        System.out.println("Lay on Victorian Char");
    }
}
