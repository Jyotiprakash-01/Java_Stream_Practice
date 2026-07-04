import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q1 {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,34,56,78,87,67,3,5,7,6,4,2));

        //Filter even numbers from a list
        List<Integer> evenList = integerList.stream().filter(n -> n%2==0).toList();
        System.out.println(evenList);

    }
}
