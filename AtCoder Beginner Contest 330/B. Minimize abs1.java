import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  		int t = 1;//sc.nextInt();
  		while(t-- > 0){
  		  int n = sc.nextInt();
  		  int l = sc.nextInt();
  		  int r = sc.nextInt();
  		  for(int i = 0; i < n;i++){
  		    int num = sc.nextInt();
  		    if(num >= l && num <= r)System.out.print(num +" ");
  		    else if(num < l) System.out.print(l+" ");
  		    else System.out.print(r+" ");
  		  }
  		  System.out.println();
  		}
  }
}
