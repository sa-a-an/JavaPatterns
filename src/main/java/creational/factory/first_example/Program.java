package creational.factory.first_example;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperByLanguage("java");
        Developer developer = developerFactory.createDeveloper();
    }

    static DeveloperFactory createDeveloperByLanguage(String language) {
        if (language.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }else if (language.equalsIgnoreCase("python")) {
            return new PyhonDeveloperFactory();
        } else {
            throw new RuntimeException(language + "is unknown");
        }
    }
}
