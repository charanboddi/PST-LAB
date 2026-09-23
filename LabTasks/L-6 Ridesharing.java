import java.util.Scanner;

class Vehicle {
    int fare(int distance) {
        return 0;
    }
}

class Bike extends Vehicle {
    int fare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    int fare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    int fare(int distance) {
        return distance * 12;
    }
}

public class Ridesharing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            try {
                Vehicle vehicle;

                if (type.equalsIgnoreCase("Bike")) {
                    vehicle = new Bike();
                } else if (type.equalsIgnoreCase("Auto")) {
                    vehicle = new Auto();
                } else if (type.equalsIgnoreCase("Cab")) {
                    vehicle = new Cab();
                } else {
                    throw new Exception();
                }

                if (distance <= 0) {
                    throw new Exception();
                }

                System.out.println(vehicle.fare(distance));

            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }

        sc.close();
    }
}