package creational.factorymethod;

public class ChineseTeaShop extends TeaShop{

    @Override
    protected Tea createTea(TeaType type) {
        Tea tea = null;

        switch (type){
            case GREAN_TEA -> tea = new ChineseGreenTea();
            case BLACK_TEA -> tea = new ChineseBlackTea();
        }

        return tea;
    }
}
