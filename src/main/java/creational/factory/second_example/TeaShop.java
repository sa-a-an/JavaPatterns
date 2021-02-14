package creational.factory.second_example;

public class TeaShop {
    TeaFactory teaFactory;

    TeaShop(TeaFactory teaFactory){
        this.teaFactory = teaFactory;
    }

    public Tea orderTea(TeaType type){
        Tea tea = teaFactory.createTea(type);

        tea.pourTea();
        tea.pourWaterIntoTea();
        tea.pourTeaIntoCup();

        return tea;
    }
}
