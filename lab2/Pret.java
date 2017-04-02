public class Pret extends punktmaterialny{  //Klasa pochodna
    private int promien, dlugosc;

    public Pret() {
        super();
        promien = 1;
        dlugosc = 5;
    }

    public Pret(int masa, int promien, int dlugosc) {
        super(masa);
        this.promien = promien;
        this.dlugosc = dlugosc;
    }
    public int inert() {		//przeciazenie metody inert()
        return (getMasa() * promien * promien) / 12;
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

    public void setDlugosc(int dlugosc) {
        if (promien > 0)
            this.dlugosc = dlugosc;
        else
            System.out.println("Dlugosc musi byc dodatnia!");
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public String description() { 		//przeciazenie metody description()
        return "Pret";
    }

}
