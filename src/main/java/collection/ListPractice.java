package collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Гоша");
        stringList.add("Виталик");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(i + " " + stringList.get(i));
        }

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("Гоша")) {
                System.out.println("index: " + i);
                break;
            }
        }
        Game warcraft = new Game("Warcraft", true);
        Game sonic = new Game("Sonic", false);

        List<Game> gamesList = new ArrayList<>();
        gamesList.add(warcraft);
        gamesList.add(sonic);
        gamesList.add(new Game("Mario", true));

    }
}
