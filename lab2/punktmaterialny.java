public class punktmaterialny {
    private int m; //masa
    public punktmaterialny(){ //konstruktor domyślny
        this.m=1; //parametr niejawny
    }
    public punktmaterialny(int a){ //konstruktor z parametrem
        if(a>0){
            this.m=a;
        }
        else{
            System.out.println("Masa musi byc dodatnia!");
        }
    }
    public int getMasa(){ //akcesor
        return this.m;
    }
    public int zmienMase(int c){ //akcesor
        this.m = c;
        return this.m;
    }
    public int moment(){ //obliczanie momentu bezwładności, zwraca "i"
        int i=0;
        return i;
    }
    public int twsteinera(int d){ //obliczanie momentu bezwładości z twierdzenia Steinera
        int MB;
        MB=moment()+this.m*d*d;
        return MB;
    }
    public void nazwa(){ //klasa zwracająca nazwe
        System.out.println("Punkt materialny");
    }
}
