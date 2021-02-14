package creational.factory.first_example;

public class PyhonDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
