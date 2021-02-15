package creational.abstractfactory.first_example.factory;

import creational.abstractfactory.first_example.guielement.Button;
import creational.abstractfactory.first_example.guielement.InputField;
import creational.abstractfactory.first_example.guielement.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    InputField createInputField();
}
