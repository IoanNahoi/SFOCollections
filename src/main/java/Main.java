import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------1-------");
        List<Integer> listaEX1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaEX1.add(i);
        }
        for (Integer integer : listaEX1) {
            if (integer % 2 == 0)
                System.out.println(integer);
        }

        System.out.println("---------2--------");
        Set<Integer> setEX2 = new HashSet<>();
        setEX2.add(10);
        setEX2.add(15);
        setEX2.add(1321);
        setEX2.add(1543);
        setEX2.add(156);
        setEX2.add(156);
        setEX2.add(46);
        setEX2.add(46);
        setEX2.add(46);
        for (Integer integer : setEX2) {
            System.out.println(integer);
        }
        System.out.println("Nu exista duplicate");

        System.out.println("----------3---------");
        Map<String, Integer> mapEX3 = new HashMap<>();
        mapEX3.put("Ionut", 85);
        mapEX3.put("Andrei", 1);
        mapEX3.put("Cotut", 84);
        mapEX3.put("John", 43);
        for (Integer value : mapEX3.values()) {
            if (value > 20)
                System.out.println(value);
        }
        System.out.println("----------4----------");
        List<Integer> listaEX4 = Arrays.asList(7, 4, 5, 2, 1, 2, 4, 1);
        listaEX4 = listaEX4.stream().distinct().collect(Collectors.toList());
        System.out.println(listaEX4);
        Collections.sort(listaEX4, Collections.reverseOrder());
        System.out.println("Lista ordonata descrescator\n" + listaEX4);
        Set<String> setEX4 = new LinkedHashSet<>(listaEX4.stream().map(Object::toString).collect(Collectors.toList()));
        System.out.println("Set:\n" + setEX4);
        Map<String, Integer> mapEX4 = new HashMap<>();
        int i = 0;
        for (String s : setEX4) {
            mapEX4.put(s, listaEX4.get(i));
            i++;
        }
        System.out.println("\nMAP ");
        for (Map.Entry<String, Integer> stringIntegerEntry : mapEX4.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }

    }
}
