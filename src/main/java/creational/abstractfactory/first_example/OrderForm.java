package creational.abstractfactory.first_example;

import creational.abstractfactory.first_example.factory.GUIFactory;
import creational.abstractfactory.first_example.guielement.Button;
import creational.abstractfactory.first_example.guielement.InputField;
import creational.abstractfactory.first_example.guielement.TextField;

public class OrderForm {
    private final TextField textField;
    private final InputField inputField;
    private final Button button;

    public OrderForm(GUIFactory guiFactory){
        textField = guiFactory.createTextField();
        inputField = guiFactory.createInputField();
        button = guiFactory.createButton();    }
}
