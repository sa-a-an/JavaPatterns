package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        TeaShop euShop = new EuropianTeaShop();
        euShop.orderTea(TeaType.BLACK_TEA);

        TeaShop chineseShop = new ChineseTeaShop();
        chineseShop.orderTea(TeaType.BLACK_TEA);

    }
}
