package creational.abstractfactory.second_example;

public class MakeOrder {
    private Table table;
    private Sofa sofa;
    private Chair chair;

    public MakeOrder(FurnitureFactory furnitureFactory){
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
        this.table = furnitureFactory.createTable();
    }
}
