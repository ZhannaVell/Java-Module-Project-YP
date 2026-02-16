import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Добро пожаловать в гонку!");
        System.out.println("Введите данные для трех автомобилей");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля № " + (i + 1) + ":");
            String name = scanner.nextLine().trim();
            while (name.isEmpty()) {
                System.out.println("Введите название автомобиля № " + (i + 1) + ":");
                name = scanner.nextLine().trim();

            }
            int speed = 0;
            boolean validSpeed = false;
            while (!validSpeed) {
                System.out.println("Введите скорость автомобиля № " + (i + 1) + " (1-250 км/ч):");
                try {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        validSpeed = true;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 1 до 250 км/ч. Попробуйте еще раз.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введите целое число. Попробуйте еще раз.");
                    scanner.next();
                }
            }
            scanner.nextLine();
            Car newCar = new Car(name, speed);
            race.checkLeader(newCar);
        }
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
    }
}


