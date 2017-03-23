import java.util.ArrayList;

public class BrylaSztywna {

    private ArrayList<Punkt> punkty;
    private int xSrodkaMasy;
    private int ySrodkaMasy;

    BrylaSztywna(){

        punkty = new ArrayList<>(0);
    }

    public void dodajPunkt(Punkt punkt){
        punkty.add(punkt);
    }

    public void obliczSrodekMasy(){

        int licznik=0;
        int mianownik=0;

        for (int i=0;i<punkty.size();i++){
            licznik = licznik + punkty.get(i).pobierzMase()*punkty.get(i).pobierzX();
            mianownik = mianownik + punkty.get(i).pobierzMase();
        }

        xSrodkaMasy = licznik/mianownik;
        licznik = 0;

        for (int i=0;i<punkty.size();i++){
            licznik = licznik +punkty.get(i).pobierzMase()*punkty.get(i).pobierzY();
        }

        ySrodkaMasy = licznik/mianownik;

    }

    public double obliczMomentBezwladnosciWzgledemSrodkaMasy(){

        double wynik = 0;

        for (int i=0; i < punkty.size();i++) {
            wynik = wynik + (punkty.get(i).pobierzMase() * (Math.sqrt(Math.abs(punkty.get(i).pobierzX()-xSrodkaMasy) * Math.abs(punkty.get(i).pobierzX()-xSrodkaMasy) + Math.abs(punkty.get(i).pobierzY() - ySrodkaMasy) * Math.abs(punkty.get(i).pobierzY()-ySrodkaMasy))));
        }


        return wynik;
    }

    public double obliczMomentBezwladnosciZTwierdzeniaSteinera(int odlegloscOsi){

        int masaUkladu = 0;

        for (int i=0; i<punkty.size();i++){
            masaUkladu = masaUkladu + punkty.get(i).pobierzMase();
        }

        return masaUkladu * odlegloscOsi * odlegloscOsi + obliczMomentBezwladnosciWzgledemSrodkaMasy();

    }

    public static void main(String[] args) {

        BrylaSztywna brylaSztywna = new BrylaSztywna();

        Punkt punkt1 = new Punkt(10,2,4);
        Punkt punkt2 = new Punkt(15,1,1);
        Punkt punkt3 = new Punkt(20,7,1);

        brylaSztywna.dodajPunkt(punkt1);
        brylaSztywna.dodajPunkt(punkt2);
        brylaSztywna.dodajPunkt(punkt3);

        brylaSztywna.obliczSrodekMasy();

        System.out.println("Moment bezwładności względem środka masy: " + brylaSztywna.obliczMomentBezwladnosciWzgledemSrodkaMasy());

        System.out.println("Współrzędna X środka masy: " + brylaSztywna.xSrodkaMasy);
        System.out.println("Współrzędna Y środka masy: " + brylaSztywna.ySrodkaMasy);

        System.out.println("Moment bezwładności względem nowej osi: " + brylaSztywna.obliczMomentBezwladnosciZTwierdzeniaSteinera(5));


    }
}
