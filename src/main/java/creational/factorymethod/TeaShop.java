package creational.factorymethod;

public abstract class TeaShop {

    public Tea orderTea(TeaType type){
        Tea tea = createTea(type);

        tea.makeTea();
        tea.pourTeaInCup();

        return tea;
    }

    protected abstract Tea createTea(TeaType type);
}
