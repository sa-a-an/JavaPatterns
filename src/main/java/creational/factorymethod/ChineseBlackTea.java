package creational.factorymethod;

public class ChineseBlackTea implements Tea{

    @Override
    public void makeTea() {
        System.out.println("Make Chinese Black Tea");
    }

    @Override
    public void pourTeaInCup() {
        System.out.println("Pour Chinese Black Tea");
    }
}
