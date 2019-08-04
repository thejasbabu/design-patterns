package main.java.Singleton;

public class Main {
    public static void main(String[] args) {
        LegacyConnector firstConnector = LegacyConnector.getConnector();
        System.out.printf("First Connector object %s",firstConnector.hashCode());
        LegacyConnector secondConnector = LegacyConnector.getConnector();
        System.out.printf("Second connector object %s", secondConnector.hashCode());
        if(firstConnector.equals(secondConnector)) {
            System.out.println("Both connectors are the same");
            System.exit(0);
        }
        System.exit(1);
    }
}
