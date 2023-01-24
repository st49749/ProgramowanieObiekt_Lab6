package GUI02;

public class Zadanie {
    public static void WykonajZadania() {
        Zad1();
        Zad2();
    }

    private static void Zad1() {
        var mainWind = new Zad1Panel();
        mainWind.setVisible(true);
    }

    private static void Zad2() {
        var mainWind = new Zad2Demo();
        mainWind.setVisible(true);
    }
}