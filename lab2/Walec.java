public class Walec extends punktmaterialny{   //Klasa pochodna

    private int promien, wysokosc;

    public Walec() {
        super();		//super konstruktor domyslny
        promien = 1;
        wysokosc = 5;
        }

public Walec(int masa, int promien, int wysokosc) {
        super(masa);	//super konstruktor z parametrem
        this.promien = promien;
        this.wysokosc = wysokosc;
        }
public int inert() {		//przeciazenie metody inert()
        return (getMasa() * promien * promien) / 2;
        }


public void setPromien(int promien) {
        if (promien > 0)
        this.promien = promien;
        else
        System.out.println("Promien musi byc dodatni!");
        }

public int getPromien() {
        return promien;
        }

public void setWysokosc(int wysokosc) {
        if (wysokosc > 0)
        this.wysokosc = wysokosc;
        else
        System.out.println("Wysokosc musi byc dodatnia!");
        }

public int getWysokosc() {
        return wysokosc;
        }

public String description() { 		//przeciazenie metody description()
        return "Walec";
        }
        }

