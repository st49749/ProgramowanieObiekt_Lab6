package GUI01;

public class Zadanie {
    public static void WykonajZadania() {
        Zad1();
        Zad2();
    }

    private static void Zad1() {
        KonwerterTemp mainWind = new KonwerterTemp();
        mainWind.setVisible(true);
    }

    private static void Zad2() {
        Zad2Demo mainWind = new Zad2Demo();
        mainWind.setVisible(true);
    }
}
