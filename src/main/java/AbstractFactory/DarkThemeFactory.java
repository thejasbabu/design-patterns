package main.java.AbstractFactory;

class DarkThemeFactory extends  ThemeFactory{
    ToolBar createToolBar() {
        return new DarkToolBar();
    }

    public Dialog createDialog() {
        return new DarkDialog();
    }
}
