
class rectangle{
    int l;
    int b;
     public rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
    public int area(){
         return l*b;
    }
    public int perimeter(){
         return 2*(l+b);
    }
}
class box extends rectangle{
    int d;
    public box(int l,int b,int d){
        super(l,b);
        this.d=d;
    }
    public int volume(){
        return  l*b*d;
    }
}
public class AreaAndPerimeter6 {

    public static void main(String[] args) {
    rectangle r=new rectangle(4,5);
        System.out.println("Area of rectangle is "+r.area());
        System.out.println("Perimeter of ractangle is "+r.perimeter());

        box b=new box(4,5,6);
        System.out.println("Volume of box is "+b.volume());

    }
}
