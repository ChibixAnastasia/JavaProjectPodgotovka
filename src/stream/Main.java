package stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


         int[] mass = new int[50];
        Random random = new Random();
        IntStream.range(0,50).forEach(i -> mass[i] = random.nextInt(100));
        System.out.println(Arrays.toString(mass));
        Arrays.stream(mass);


        new Thread(() -> System.out.println(66)).start();
        new Thread(() -> System.out.println(88)).start();


        List<Integer> list =  new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);
        List<String> str = list.stream().filter(n -> n % 2 == 0).map(n -> ("Number: " + n))
                .filter(s -> s.endsWith("0")).map(s -> s + " !")
                .collect(Collectors.toList());
        System.out.println(str);

        List<User> users = new ArrayList<>();
        users.add(new User("Inna", 30));
        users.add(new User("Nina",55));
        users.add(new User("Dasha",14));
        users.add(new User("Dir",24));
         boolean count =  users.stream().noneMatch(user -> user.getAge() > 18);
        System.out.println(count);
        users.stream().sorted(Comparator.comparing(User::getName).thenComparing(User::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
