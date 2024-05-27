package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> list = List.of(300, 400,500,200,100,600,350);

        Long count =  list.stream().filter((Integer a) -> a>300).count();
        System.out.println(count);
    }
}
