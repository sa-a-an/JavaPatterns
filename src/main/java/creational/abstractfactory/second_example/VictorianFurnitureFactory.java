package creational.abstractfactory.second_example;

public class VictorianFurnitureFactory implements FurnitureFactory{
    public VictorianFurnitureFactory(){
        System.out.println("Victorian Furniture Created");
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
