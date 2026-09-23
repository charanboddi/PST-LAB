import java.util.*;
import java.util.stream.*;

public class Stream {
    static class Reading {
        String id;
        double temp;

        Reading(String id, double temp) {
            this.id = id;
            this.temp = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Reading> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Reading(sc.next(), sc.nextDouble()));
        }

        list.stream()
            .filter(r -> r.temp > 50)
            .collect(Collectors.groupingBy(
                r -> r.id,
                Collectors.averagingDouble(r -> r.temp)
            ))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(e -> System.out.printf("%s %.2f%n", e.getKey(), e.getValue()));
    }
}