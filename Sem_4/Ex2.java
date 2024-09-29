package Sem_4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
    /*
     * создайте коллецию женских и мужских имен с помощью интерфейса Лист
     * Получите уникальный список Сет на основании Лист
     * определите наименьший элемент по алфавиту
     * наибольший элемент по количеству букв
     * удалите все элементы содержащие букву А
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Иван", "Сергей", "Александр", "Ирина", "Светлана", "Сергей", "Александр", "Ирина"));
        Set<String> nameSet = convertListToSet(names);
        System.out.println(shortName(nameSet));

        System.out.println(minAndMaxLength(nameSet));
        
        removeByChar(nameSet, "А");
        System.out.println(nameSet);
    }


    public static Set<String> convertListToSet (List<String> list){
        return new HashSet<>(list);
        // return result;
    }

    public static String shortName (Set<String> nameS){
        return nameS.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static List<String> minAndMaxLength(Set<String> names){
        List<String> resultNames = new ArrayList<>();
        resultNames.add(names.stream().min(Comparator.comparing(String::length)).orElse(null));
        resultNames.add(names.stream().max(Comparator.comparing(String::length)).orElse(null));
        return resultNames;
    }

    public static void removeByChar (Set<String> names, String symbol){
        names.removeIf(name->name.contains(symbol));
    }

    
}
