import java.util.Scanner;


public class Homework4 {
    int gcd(int m, int n){
        if (n == 0){
            return m;
        }
        int Gcd = 0;
        if (m > n){
            int r = m % n;
            if (r == 0){
                Gcd = n;
            }
            else {
                m = n;
                n = r;
                return gcd(m, n);
            }
        }
        if (n > m) {
            int r = n % m;
            if (r == 0) {
                Gcd = m;
            } else {
                n = m;
                m = r;
                return gcd(m, n);
            }
        }
        return Gcd;
    }

    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        Homework4 gcd = new Homework4();
        int answer = gcd.gcd(sc.nextInt(), sc.nextInt());
        System.out.printf("두 수의 최대공약수는 %d입니다.", answer);
    }
}
