
package algorithms.sort;

public interface Sortable {
    <T extends Comparable<T>> void sort(T[] values);
}
