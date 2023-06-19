import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку для списка A: ");
            String line = scanner.nextLine();
            listA.add(line);

        }
        System.out.println("Список A: " + listA);
        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку для списка Б: ");
            String line = scanner.nextLine();
            listB.add(line);

        }
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список C: " + listC);
        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C:");
        for (String item : listC)
            System.out.println(item);


        }

    }


