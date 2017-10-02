
package algorithms.sort;
import java.util.Arrays;

public class BubbleSort implements Sortable {
    public <T extends Comparable<T>> void sort(T[] values) {
        Arrays.sort(values);
    }
    public BubbleSort(){}
}
