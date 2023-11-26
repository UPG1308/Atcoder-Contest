import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  		int t = 1;//sc.nextInt();
  		while(t-- > 0){
  		  int n = sc.nextInt();
  		  int l = sc.nextInt();
  		  int count = 0;
  		  for(int i = 0; i < n;i++){
  		    int marks = sc.nextInt();
  		    if(marks >= l)count++;
  		  }
  		  System.out.println(count);
  		}
  }
}
