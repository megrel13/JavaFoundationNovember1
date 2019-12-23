package collectionIndiv;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionFinder {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String input = console.readLine();

            while (!input.equals("конец")) {
                namesList.add(input);
                input = console.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String nameToFind = "Гоша";
        if (namesList.contains(nameToFind)) {
            for (int i = 0; i < namesList.size(); i++) {
                if (namesList.get(i).equals(nameToFind)) {
                    System.out.println("Искомый индекс: " + (i + 1));
                    break;
                }
            }
        }
        else {
            System.out.println("Имени: " + nameToFind + " в списке нет.");
        }
        String longestString = Collections.max(namesList, Comparator.comparing(s -> s.length()));
        System.out.println("Самая длинная строка: " + longestString);
        Collections.reverse(namesList);
        System.out.println("Вывод строк в обратном порядке: " + namesList);
        Collections.sort(namesList);
        System.out.println("Сортировка по лексико-графическому порядку: " + namesList);
        System.out.println("Вывод строк через пробел:");
        namesList.forEach(num -> System.out.print(num + " "));



        }
    }

/*HW:
1. Проверка, что Гоши в списке нет
2. Вводим строки до момента пока не введена строка "конец"
   а. Все строки выводим в опратном строки
   б. Выводим самую длинну строку
   в. Выводим все строки через пробел
   г. Сортировка всех строк и вывод (лексико графический порядок)
 */