import java.util.Arrays;
import java.util.List;

public class StreamTest {


    public static void main(String[] args) {


        List<Integer> mylist= Arrays.asList(new Integer[] {2,1,5,9});


        mylist.stream().filter(x->x%2!=0).forEach(System.out::println);
    }
}
