package creational.abstractfactory.second_example;

public class Assamble {
    MakeOrder makeOrder;

    public void chooseFurniture(FurnitureType type){

        FurnitureFactory furnitureFactory;

        switch (type){
            case MODERN -> furnitureFactory = new ModernFurnitureFactory();
            case VICTORIAN -> furnitureFactory = new VictorianFurnitureFactory();
            default -> throw new RuntimeException("No Such Furniture");
        }

        makeOrder = new MakeOrder(furnitureFactory);
    }

    public static void main(String[] args) {
        Assamble assamble = new Assamble();
        assamble.chooseFurniture(FurnitureType.VICTORIAN);
    }
}
