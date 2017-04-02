public class Kula extends punktmaterialny {  //Klasa pochodna
    private int promien;

    public Kula() {
        super();
        promien = 1;
    }

    public Kula(int masa, int promien) {
        super(masa);
        this.promien = promien;
    }
    public int inert() {		//przeciazenie metody inert()
        return 2*(getMasa() * promien * promien)/5;
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

    public String description() { 		//przeciazenie metody description()
        return "Kula";
    }
}
