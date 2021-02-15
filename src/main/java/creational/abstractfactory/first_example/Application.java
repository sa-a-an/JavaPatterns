package creational.abstractfactory.first_example;

import creational.abstractfactory.first_example.factory.GUIFactory;
import creational.abstractfactory.first_example.factory.MacOSGuiFactory;
import creational.abstractfactory.first_example.factory.WindowsGuiFactory;

public class Application {
    private OrderForm orderForm;

    public void drawOrderForm(){
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")){
            guiFactory = new WindowsGuiFactory();
        }else if (osName.startsWith("mac")){
            guiFactory = new MacOSGuiFactory();
        }else {
            throw new RuntimeException(osName + "not supported");
        }
        orderForm = new OrderForm(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderForm();
    }
}
