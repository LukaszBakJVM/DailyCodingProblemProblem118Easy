import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer>integers=List.of(-9, -2, 0, 2, 3);
    public static void main(String[] args) {
        List<Integer> list = list(integers);

        System.out.println(list);
    }
  private static   List<Integer>list(List<Integer>integers){
        List<Integer>sort=new ArrayList<>();
        for (Integer i:integers) {
            sort.add(i*i);

        }
        return sort.stream().sorted().toList();
    }
}