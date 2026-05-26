import java.util.*;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args){
        //Q1 : Sum of all elements in a list

        List<Integer> integerList = new ArrayList<>(Arrays.asList(149,5,6,7,35,45,67,23,12,56,78,90));

        int sumOfList1 = integerList.stream().reduce(0,(a,b)->a+b);

        int sumOfList2 = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : "+sumOfList1+" "+sumOfList2);

        //Q2 : Product of all elements in a list
        int product1 = integerList.stream().reduce(1,(a,b)->a*b);
        System.out.println(product1);

        //Q3 : Calculate average of numbers present in the list

        double average1 = integerList.stream().collect(Collectors.averagingDouble(n->n));
        System.out.println(average1);

        OptionalDouble average2 = integerList.stream().mapToInt(Integer::intValue).average();
        System.out.println(average2.getAsDouble());

        double average3 = integerList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();

        System.out.println(average3);

        //Q4 : Maximum Elements in a list
        int max1 = integerList.stream().max(Comparator.comparingInt(n->n)).orElse(0);
        int max2 = integerList.stream().max(Integer::compare).orElse(0);
        int max3 = integerList.stream().collect(Collectors.maxBy(Integer::compare)).orElse(0);

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

        //Q5 : Find the minimum element in a list
        int min1 = integerList.stream().min(Integer::compare).orElse(0);
        int min2 = integerList.stream().min(Comparator.comparingInt(n->n)).orElse(0);
        int min3 = integerList.stream().collect(Collectors.minBy(Comparator.comparingInt(n-> (int) n))).orElse(0);

        System.out.println(min1+" "+min2+" "+min3);






    }
}
