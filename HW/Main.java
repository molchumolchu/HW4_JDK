package HW;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    //     Создать справочник сотрудников
    // Необходимо:
    // Создать класс справочник сотрудников, который содержит внутри
    // коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    // Табельный номер
    // Номер телефона
    // Имя
    // Стаж
    // Добавить метод, который ищет сотрудника по стажу (может быть список)
    // Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    // Добавить метод, который ищет сотрудника по табельному номеру
    // Добавить метод добавления нового сотрудника в справочник
    
    
    public static void main(String[] args) {
        List<List<String>> guide = new ArrayList<>();
        guide.add(addNewEmpl("00001", "8812111", "Masha", "5"));
        System.out.println(guide.get(0).get(0));
        guide.add(addNewEmpl("00002", "8812112", "Sergey", "4"));
        guide.add(addNewEmpl("00003", "8812113", "Inna", "3"));
        guide.add(addNewEmpl("00004", "8812114", "Mikhail", "4"));
        guide.add(addNewEmpl("00005", "8812115", "Mikhail", "7"));

        System.out.println(guide);

        System.out.println(searchByStage2(guide, "4"));

        System.out.println(searchTelByName(guide, "Mikhail"));

        System.out.println(searchByTanNum(guide, "00004"));
        
    }

    // Добавить метод добавления нового сотрудника в справочник
    public static ArrayList addNewEmpl (String tabNum, String telNum, String name, String stage){
        ArrayList<String> employes = new ArrayList<>();
        employes.add(tabNum);
        employes.add(telNum);
        employes.add(name);
        employes.add(stage);
        System.out.println("Новый сотрудник: "+tabNum+"; "+telNum+"; "+name+"; "+stage);
        return employes;
    }

    // Добавить метод, который ищет сотрудника по стажу (может быть список)
    public static boolean searchByStage (List<String> employes, String stage){
        if (employes.get(3).equals(stage)) {
            return true;
        }
        else return false;
    }

    public static List searchByStage2 (List<List<String>> guide, String stage){
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < guide.size(); i++) {
            if (searchByStage(guide.get(i), stage)==true) {
                result.add(guide.get(i));
            }
        }
        return result;
    }

    // Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    public static List searchTelByName(List<List<String>> guide, String name){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < guide.size(); i++) {
            if (guide.get(i).get(2).equals(name)){
                result.add(guide.get(i).get(1));
            }
        }
        return result;
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public static List searchByTanNum(List<List<String>> guide, String tabNum){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < guide.size(); i++) {
            if (guide.get(i).get(0).equals(tabNum)){
                result.addAll(guide.get(i));
            }
        }
        return result;
    }


    
}
