package creational.factorymethod;

public class EuropianTeaShop extends TeaShop{

    @Override
    protected Tea createTea(TeaType type) {
        Tea tea = null;

        switch (type){
            case GREAN_TEA -> tea = new EuropianGreenTea();
            case BLACK_TEA -> tea = new EuropianBlackTea();
        }

        return tea;
    }
}
