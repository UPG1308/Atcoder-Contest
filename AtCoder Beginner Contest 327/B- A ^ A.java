import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long B = sc.nextLong();
      for(int A = 1; A <= 15; A++){
        long x = 1;
        for(int i = 0; i < A; i++) x *= A;
        if(x == B){
          System.out.println(A);
          return;
        }
      }
      System.out.println("-1");
  }
}
