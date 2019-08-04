package main.java.Singleton;

class LegacyConnector {
    private static LegacyConnector connector = new LegacyConnector();

    private LegacyConnector() {
    }

    static LegacyConnector getConnector() {
        return connector;
    }
}
