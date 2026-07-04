import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String args[]){
        //Find maximum number from a list of integers
        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,34,56,78,87,67,3,5,7,6,4,2));

        int maximumNo1 = integerList.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(maximumNo1);

        int maximumNo2 = integerList.stream().max(Integer::compare).orElse(0);
        System.out.println(maximumNo2);
    }
}
