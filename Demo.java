public class Demo{
  public static void main(String[] args){
    System.out.println(Demo.printLoop());
    System.out.println(Demo.printLoop(3));
  }
  public static String printLoop(int n){
    String x = "";
    for (int i=1; i<n+1; i++){
      for (int j=i; j<n+1; j++){
        x = x + i;
      }
      x = x + "\n";
    }
    return x;
  }
  public static String printLoop(){
    String x = "";
    for (int i=1; i<5+1; i++){
      for (int j=i; j<5+1; j++){
        x = x + i;
      }
      x = x + "\n";
    }
    return x;
  }
}
