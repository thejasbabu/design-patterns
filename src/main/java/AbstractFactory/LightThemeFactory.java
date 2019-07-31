package main.java.AbstractFactory;

class LightThemeFactory extends ThemeFactory {
    ToolBar createToolBar() {
        return new LightToolBar();
    }

    Dialog createDialog() {
        return new LightDialog();
    }
}
