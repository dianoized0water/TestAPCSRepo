public class Demo{
  public static void printLoop(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        if(args.length==0){
            printLoop(5);
        } else {
            printLoop(Integer.parseInt(args[0]));
        }
    }

    public static String arrToString(int[]arr){
      String newArr = "";
      for (int i=0; i<arr.length; i++) {
        newArr = newArr + arr[i];
        if (i<arr.length-1) {
          newArr = newArr + ", ";
        }
      }
      return (String) ("{" + newArr + "}");
    }

    public static String arrayDeepToString(int[][]arr){
      String new2DArr = "";
      for (int row=0; row<arr.length; row++){
        new2DArr = new2DArr + Demo.arrToString(arr[row]);
        if (row>0) {new2DArr = " " + new2DArr;}
        if (row<arr.length-1) {
          new2DArr = new2DArr + "\n";
        }
      }
      return (String) ("{" + new2DArr + "}");
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue){
      int[][] me = new int[rows][cols];
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
          me[i][j] = (int) (Math.random()*maxValue);
        }
      }
      return me;
    }

    public static int[][] create2DRandomizedArray(int rows, int cols, int maxValue){
      int[][] randoMe = new int[rows][];
      for(int i=0; i<cols; i++){
        randoMe[i] = new int[(int) (Math.random()*cols)];
        for(int j=0; j<randoMe[i].length; j++){
          randoMe[i][j] = (int) (Math.random()*maxValue);
        }
      }
      return randoMe;
    }
}
