import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if (n == 1 || n == 0)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

}