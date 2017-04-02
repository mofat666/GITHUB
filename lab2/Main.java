public class Main {

    public static void main(String[] args) {

        Walec walec = new Walec(10, 5, 15);
        Kula kula = new Kula(14, 43);
        Pret pret = new Pret(23, 11, 32);

        System.out.println(walec.description() + ", masa: "+ walec.getMasa() + ", promien: " + walec.getPromien() + ", wysokosc: " + walec.getWysokosc() +", moment bezwladnosci: " + walec.inert() + ", wzgledem wybranej osi: " + walec.twsteinera(2));

        System.out.println(kula.description() + ", masa: "+ kula.getMasa() + ", promien: " + kula.getPromien() + ", moment bezwladnosci: " + kula.inert() + ", wzgledem wybranej osi: " + kula.twsteinera(12));

        System.out.println(pret.description() + ", masa: "+ pret.getMasa() + ", promien: " + pret.getPromien() + ", dlugosc: " + pret.getDlugosc() +", moment bezwladnosci: " + pret.inert() + ", wzgledem wybranej osi: " + pret.twsteinera(31));

        System.out.println("\n");

        //tablice obiektow
        Walec[] walce = new Walec[8];
        Kula[] kulki = new Kula[8];
        Pret[] prety = new Pret[8];

        //inicjalizacja parametrow
        for (int i=0; i<walce.length; i++) {
            walce[i]= new Walec(i, i+10, i * 2);
            kulki[i]= new Kula(i + 4,i * 2);
            prety[i]= new Pret(i, i+10, i * 2);
        }

        for(int i=0; i<walce.length; i++) {
            System.out.println(walce[i].description() + i + ", masa: "+ walce[i].getMasa() + ", promien: " + walce[i].getPromien() + ", wysokosc: " + walce[i].getWysokosc() +", moment bezwladnosci: " + walce[i].inert());
            System.out.println(kulki[i].description() + i + ", masa: "+ kulki[i].getMasa() + ", promien: " + kulki[i].getPromien() + ", moment bezwladnosci: " + kulki[i].inert());
            System.out.println(prety[i].description() + i + ", masa: "+ prety[i].getMasa() + ", promien: " + prety[i].getPromien() + ", dlugosc: " + prety[i].getDlugosc() +", moment bezwladnosci: " + prety[i].inert());
            System.out.println("\n");
        }

        //wyswietlenie momentow bezwladnosci wzgledem osi
        for(int i=0; i<walce.length; i++) {
            System.out.println(walce[i].description() + " moment bezwladnosci wzgledem osi oddalonej o 10: " + walce[i].twsteinera(10));
            System.out.println(kulki[i].description() + " moment bezwladnosci wzgledem osi oddalonej o 10: " + kulki[i].twsteinera(10));
            System.out.println(prety[i].description() + " moment bezwladnosci wzgledem osi oddalonej o 10: " + prety[i].twsteinera(10));
        }
    }
}


