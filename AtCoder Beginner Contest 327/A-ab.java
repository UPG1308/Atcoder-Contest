import java.util.*;
import java.io.*;


class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	
	
    public static void main(String[] args) {
      try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = 1;//in.nextInt();
            while(testCases-- > 0){
                solve(in , out);
            }
            out.close();
        } 
      catch (Exception e) {
          return;
      }
    }
    public static void charMatrixInput(FastReader in, FastWriter out){
      int n = 4;
      int m = 4;
      
      char grid[][] = new char[n][m];
      for(int i = 0; i < n; i++){
        String[] s = in.nextLine().trim().split("");
        for(int j = 0; j < m; j++){
          grid[i][j] = s[j].charAt(0); //Integer.parseInt(s[j]);
        }
      }
    }
    public static long ncr(int n, int r){
        long sum = 1;

        // Calculate the value of n choose r using the
        // binomial coefficient formula
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }
        return sum;
    }
    public static int power(int x, int n, int p) {
        
        for(int i = 0;i < n; i++){
          x = (x * 2) % p;
        }
        return x % p;
    }
    public static boolean primeFactors(int n) 
    { 
      int oddPrimeMax = -1;
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            n /= 2; 
        } 
          
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                if(i > oddPrimeMax) oddPrimeMax = i;
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case when 
        // n is a prime number greater than 2 
        if (n > 2 && n > oddPrimeMax) oddPrimeMax = n;
        
        if(n == 1 && oddPrimeMax == -1) return false;
        if((n / oddPrimeMax) % 2 == 0) return false;
        return true;
 
    }
    public static void solve(FastReader in, FastWriter out) throws IOException {
      // 	charMatrixInput(in, out);
        int n = in.nextInt();
        String str = in.next();
        for(int i = 1; i < n; i++){
          if(str.charAt(i) == 'a' && str.charAt(i - 1) == 'b' || str.charAt(i) == 'b' && str.charAt(i - 1) == 'a')
          {
            out.println("Yes");
            return;
          }
        }
        out.println("No");
    }
}
