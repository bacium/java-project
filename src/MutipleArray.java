public class MutipleArray {
  public static void main(String[] args) {
//    二维数组遍历
    int[][] ns = {
        { 1, 2, 3, 4 },
        { 5, 6 },
        { 7, 8, 9 }
    };
      for (int[] n : ns) {
          for (int i : n) {
              System.out.println(i);
          }
      }
      System.out.println("----------------------");
      for(int[] it:ns) {
          for (int num:it) {
              System.out.println(num);
          }
      }
  }
}

