public class prima {

    public static void main(String[] args) {
        //4

        int count = 0;
        int n = 2;
        int sum = 0;
        while (count < 6) {
            if (isPrime(n)) {
                count++;
                sum = sum + n;
            }
            n++;
        }
        System.out.println(isPrime(4));
        System.out.println(sum);

        //  \u000a System.out.println("dd");
    }


    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


}
