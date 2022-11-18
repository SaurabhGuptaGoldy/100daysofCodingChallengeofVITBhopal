class Myroom {
    final int l, b;
    Myroom(int x, int y){
        l = x;
        b = y;
    }
    void area(){
        System.out.println("Area = "+l*b);
    }
}
public class Bedroom extends Myroom{
    int h;
    Bedroom(int x, int y, int z){
        super(x, y);
        h = z;
    }
    int vol(){
        return l*b*h;
    }
    public static void main(String[] args) {
        Myroom r1 = new Myroom(10, 15);
        Bedroom b1 = new Bedroom(10, 15, 20);
        r1.area();
        int z = b1.vol();
        System.out.println("Volume = "+z);
    }
}
