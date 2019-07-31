package main.java.AbstractFactory;

class Theme {
    private Dialog dialog;
    private ToolBar toolBar;

    public Theme(ThemeFactory factory) {
        this.toolBar = factory.createToolBar();
        this.dialog = factory.createDialog();
    }

    void display() {
        System.out.printf("Toolbar: %s, Dialog: %s" , this.toolBar.show(), this.dialog.show());
    }
}
