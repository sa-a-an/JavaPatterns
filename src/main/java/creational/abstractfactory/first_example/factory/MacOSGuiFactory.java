package creational.abstractfactory.first_example.factory;

import creational.abstractfactory.first_example.macosgui.MacOSInputField;
import creational.abstractfactory.first_example.macosgui.MacOSTextField;
import creational.abstractfactory.first_example.windowsgui.WindowsButton;
import creational.abstractfactory.first_example.guielement.Button;
import creational.abstractfactory.first_example.guielement.InputField;
import creational.abstractfactory.first_example.guielement.TextField;

public class MacOSGuiFactory implements GUIFactory{

    public MacOSGuiFactory(){
        System.out.println("MacOS");
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }

    @Override
    public InputField createInputField() {
        return new MacOSInputField();
    }
}
