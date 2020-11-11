package ua.profitsoft.tereshchenko.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static boolean compareTwoLists(List<String> listOne, List<String> listTwo) {
        Collections.sort(listOne);
        Collections.sort(listTwo);
        return listOne.equals(listTwo);
    }

    public static void main(String[] args) {
        List<String> listOne = Arrays.asList("b", "c", "a");
        List<String> listTwo = Arrays.asList("a", "c", "b");
        System.out.println(compareTwoLists(listOne, listTwo));
    }
}
