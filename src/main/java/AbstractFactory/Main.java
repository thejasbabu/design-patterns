package main.java.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid arguments passed, required one arg. Either dark or light");
            System.exit(1);
        }
        String themeType = args[0].toLowerCase();
        switch (themeType) {
            case "dark":
                DarkThemeFactory darkThemefactory = new DarkThemeFactory();
                Theme darkTheme = new Theme(darkThemefactory);
                darkTheme.display();
                break;
            case "light":
                LightThemeFactory lightThemeFactory = new LightThemeFactory();
                Theme lightTheme = new Theme(lightThemeFactory);
                lightTheme.display();
                break;
            default:
                throw new IllegalArgumentException("Invalid theme type, should be either Dark or Light, but given: " + themeType);
        }

    }
}
