/**
 * Created by Banskyy on 2017-03-22.
 */
public class Punkt {
    private int masa;
    private int x;
    private int y;

    Punkt(int masa, int x, int y){
        this.masa = masa;
        this.x = x;
        this.y = y;
    }

    public int pobierzMase(){
        return masa;
    }

    public int pobierzX(){
        return x;
    }

    public int pobierzY(){
        return y;
    }

}
