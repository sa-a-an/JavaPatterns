package creational.abstractfactory.first_example.factory;

import creational.abstractfactory.first_example.windowsgui.WindowsButton;
import creational.abstractfactory.first_example.windowsgui.WindowsInputField;
import creational.abstractfactory.first_example.windowsgui.WindowsTextField;
import creational.abstractfactory.first_example.guielement.Button;
import creational.abstractfactory.first_example.guielement.InputField;
import creational.abstractfactory.first_example.guielement.TextField;

public class WindowsGuiFactory implements GUIFactory{

    public WindowsGuiFactory(){
        System.out.println("Windows");
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

    @Override
    public InputField createInputField() {
        return new WindowsInputField();
    }
}
