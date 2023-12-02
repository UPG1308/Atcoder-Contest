import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int M = sc.nextInt();
      int D = sc.nextInt();
      int y = sc.nextInt();
      int m = sc.nextInt();
      int d = sc.nextInt();
      int fd = d, fm = m, fy = y;
      if(d < D) fd++;
      else {
        fd = 1;
        if(m < M) fm++;
        else {
          fm = 1;
          fy++;
        }
      }
      System.out.println(fy+" "+fm+" "+fd);
  }
}
