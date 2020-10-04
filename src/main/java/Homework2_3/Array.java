package Homework2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array {
    public static void main(String[] args) {

        String text = "Изгиб Хофмайстера, клинья Джуджаро, плечи Хорбери, горбик Порше, решетка де Сильвы, кокпит Брака, " +
                "тигриный нос Шрайера и задница Бэнгла — великий дизайнер всегда оставляет в истории часть самого себя. " +
                "И когда весной 2020 года компания BMW выкатила купе четвертой серии с новой фальшрадиаторной решеткой, " +
                "у многих возник вопрос — а чьи это ноздри? Кто их придумал? Отличный повод разобраться в персоналиях дизайна BMW";

        String arrText[] = text.split(" ");

        HashMap<String, Integer> hm = new HashMap<>();
        for (String key : arrText)
            hm.merge(key, 1, (currValue, value) -> currValue + value);


        hm.forEach((item, count) -> System.out.println(item + "(" + count + ")"));

        Phones addrbook = new Phones();
        addrbook.add("Ivanov", "+79781234567");
        addrbook.add("Petrov", "+79782345678");
        addrbook.add("Petrov", "+79783456789");
        addrbook.add("Petrov", "+79784567890");

        System.out.println("Sidorov = " + addrbook.get("Sidorov"));
        System.out.println("Ivanov  = " + addrbook.get("Ivanov"));
        System.out.println("Petrov  = " + addrbook.get("Petrov"));
    }
}

class Phones {
    private Map<String, ArrayList<String>> storage = new HashMap<>();

    public void add(String family, String phone) {
        ArrayList<String> phoneList = storage.computeIfAbsent(family, s -> new ArrayList<>());
        phoneList.add(phone);
    }

    public ArrayList<String> get(String family) {
        return storage.get(family);
    }
}

