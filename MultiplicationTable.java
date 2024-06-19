import java.io.*;



public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=1;i<=10;i++){
            int res=N*i;
            System.out.println(N+" x "+i+" = "+res);
        }
    }
}
