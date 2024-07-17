
public class DemoTypeCasting2 {
    public static void main(String[] args) {
        byte h=127;
        int a=300;
        float al=12.222f;
        float g;
        short b=200;
        long c=999999;
        float e=353.23f;
        double f=345.45464634;
        g=(float)f;
        
        System.out.println("short g ="+ g);
        System.out.println("short c= "+c);
        System.out.println("long c="+c);
        System.out.println("float e="+e);
        System.out.println("double f="+f);
        
        System.out.println("short to byte "+(byte)b);
        
        System.out.println("int to byte "+(byte)a);
        System.out.println("int ot float "+(float)a);
        
        System.out.println("long to byte "+(byte)c);
        System.out.println("long to int "+(int)c);
         
        System.out.println("byte to int "+(int)h);
        
        System.out.println("double to long "+(long)f);
        System.out.println("double to int "+(int)f);
        System.out.println("double to byte "+(byte)f);
        System.out.println("double to short "+(short)f);
        System.out.println("double to float "+(float)f);
        
        System.out.println("float to int "+(int)e);
        System.out.println("float to byte "+(byte)e);
        System.out.println("float to short "+(short)e);
        System.out.println("float to long "+(long)e);
        System.out.println("float to double "+(double)e);
        
       
        
    }
}
