public class Swap27{
  static void swapFloats(float[] x, int a,int b){
    float temp= x[a];
    x[a]=x[b];
    x[b]=temp;
    System.out.println(x[a]+ ","+x[b]);
  }
  public static void main(String[] args){
    float[] x={1,3};
    swapFloats(x,0,1);
  }
}