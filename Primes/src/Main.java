import java.util.*;

public class Main {

    private static ArrayList<Integer> primes;
    private static ArrayList<Boolean> isPrime;
    private static ArrayList<Integer> nearlyPrimes;

    public static void main(String[] args) {
        isPrime = new ArrayList<>();
        primes = new ArrayList<>();
        nearlyPrimes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Meddig szeretnél \"iker-majdnem-prímek\"-et keresni?");
        int input = 0;
        try {
            input = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Helytelen számformátum");
            return;
        }

        if (input < 10) {
            System.out.println("Nincs ilyen számpár");
        } else {
            searchForPrimes(input);
            printTwinNearlyPrimes();
        }
    }

    private static void printTwinNearlyPrimes() {
        System.out.println("Az \"iker-majdnem-prímek:\":");
        int db = 0;
        for (int i = 1; i < nearlyPrimes.size(); i++) {
            if (nearlyPrimes.get(i - 1) + 1 == nearlyPrimes.get(i)) {
                System.out.print(nearlyPrimes.get(i - 1));
                System.out.print(" ");
                System.out.println(nearlyPrimes.get(i));
                db++;
            }
        }
        System.out.println("Összesen " + db + " darab van.");
    }

    private static void searchForPrimes(int n) {
        isPrime.add(false);
        for (int i = 2; i <= n; i++) {
            int div = divider(i);
            if (div == 1) {
                primes.add(i);
                isPrime.add(true);
            } else {
                isPrime.add(false);
                int rest = (i + 1) / div;
                if (isPrime.get(rest - 1)) {
                    nearlyPrimes.add(i);
                }
            }
        }
    }

    private static int divider(int n) {
        int i = 0;
        while (i < primes.size() && primes.get(i) <= Math.sqrt(n)) {
            if (n % primes.get(i) == 0) return primes.get(i);
            i++;
        }
        return 1;
    }

}
