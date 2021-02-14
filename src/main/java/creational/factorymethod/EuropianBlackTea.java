package creational.factorymethod;

public class EuropianBlackTea implements Tea {
    @Override
    public void makeTea() {
        System.out.println("Make EU black Tea");
    }

    @Override
    public void pourTeaInCup() {
        System.out.println("Pour Eu black tea");
    }
}
