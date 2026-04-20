package abstractizare;

public abstract class Shape {
    abstract int calculateArea(int a, int b);

    public String draw(){
        return "Deseneaza figura";
    }
}
