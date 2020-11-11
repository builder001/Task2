package ua.profitsoft.tereshchenko.task2;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDemoTest {
    @Test
    public void compareTwoListsTest1() {
        List<String> list1 = Arrays.asList("c", "b", "a");
        List<String> list2 = Arrays.asList("a", "c", "b");
        assertEquals(true, ListDemo.compareTwoLists(list1, list2));
    }
    @Test
    public void compareTwoListsTest2() {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("b", "b", "c");
        assertEquals(false, ListDemo.compareTwoLists(list1, list2));
    }
}
