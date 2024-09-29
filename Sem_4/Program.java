package Sem_4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    /*
     * создайте коллецию женских и мужских имен с помощью интерфейса Лист
     * отсортируйте коллецию в алфавитном порядке
     * отсортируйте коллекцию по количеству букв в слове
     * разверните коллекцию
     */
    public static List<String> names = new ArrayList<>(Arrays.asList("Иван", "Сергей", "Александр", "Ирина", "Светлана"));

    public static void sortByAlph(List<String> list){
        Collections.sort(list);
    }

    public static void sortByLength(List<String> list){
        list.sort(Comparator.comparing(String::length));
    }

    public static void sortByReverse(List<String> list){
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        sortByAlph(names);
        System.out.println(names);

        sortByLength(names);
        System.out.println(names);

        sortByReverse(names);
        System.out.println(names);
    }


}

