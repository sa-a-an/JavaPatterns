package creational.factory.second_example;

public class TeaFactory {

    public Tea createTea(TeaType type){
        Tea tea = null;

        switch (type){
            case BLACK_TEA -> tea = new BlackTea();
            case GREAN_TEA -> tea = new GreenTea();
        }

        return tea;
    }

}
