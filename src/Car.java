public class Car {
    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static void startElectricity() {
        // Логіка запуску електричної системи
        System.out.println("Starting the electrical system...");
    }

    private static void startCommand() {
        // Логіка запуску системи керування
        System.out.println("Starting the command system...");
    }

    private static void startFuelSystem() {
        // Логіка запуску пального системи
        System.out.println("Starting the fuel system...");
    }
}
