package Sem_4;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Telefon {
    /*
     * создайте телефонный справочник с помощью Мэп
     * телефон - ключ, имя - значение
     * найти человека с самым маленоьким номером телефона
     * найти номер телефона, чье имя самое большое в алфавитном порядке
     */
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("79009009090", "Иван");
        phoneBook.put("78009009090", "Ася");
        phoneBook.put("79009909090", "Сергей");
        phoneBook.put("79009099090", "Мансур");
        phoneBook.put("78008009090", "Инна");
        System.out.println(compareMinPhone(phoneBook));
        System.out.println(findMaxAiphName(phoneBook));
    }

    public static String compareMinPhone (Map<String, String> phones){
        Set<Long> numbers = phones.keySet().stream().map(el->Long.valueOf(el)).collect(Collectors.toSet());
        long number = numbers.stream().min(Comparator.naturalOrder()).get();
        return String.format("Наименьший номер: %s, владелец, %s", number, phones.get(String.valueOf(number)));
    }

    public static String findMaxAiphName (Map<String, String> phones){
        Set<Map.Entry<String, String>> elements=phones.entrySet();
        Map.Entry<String, String> name = elements.stream().max((entry1, entry2)->entry1.getValue().compareTo(entry2.getValue())).get();
        return String.format("Самое большое имя в алфавитном порядке %s, %s", name.getValue(), name.getKey());
    }
    
}
