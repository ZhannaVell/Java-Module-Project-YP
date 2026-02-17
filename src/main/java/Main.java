import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int MIN_SPEED = 1;
    private static final int MAX_SPEED = 250;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Добро пожаловать в гонку!");
        System.out.println("Введите данные для трех автомобилей");
        for (int i = 0; i < 3; i++) {
            String name = readCarName(scanner, i + 1);
            int speed = readCarSpeed(scanner, i + 1);
            Car newCar = new Car(name, speed);
            race.checkLeader(newCar);
        }
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
    }
    private static String readCarName(Scanner scanner, int carNumber) {
        while (true) {
            System.out.println("Введите название автомобиля № " + carNumber + ":");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Ошибка: Название не может быть пустым. Попробуйте еще раз.");
        }
    }
    private static int readCarSpeed(Scanner scanner, int carNumber){
        while (true){
            System.out.println("Введите скорость автомобиля № " + carNumber + " (" + MIN_SPEED + "-" + MAX_SPEED + "км/ч):");
            try{
            int speed = scanner.nextInt();
            scanner.nextLine();
                    if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                        return speed;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от " + MIN_SPEED + " до " + MAX_SPEED + " км/ч. Попробуйте еще раз.");
                    }
                } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число. Попробуйте еще раз.");
                scanner.next();
            }
            }
        }

}


