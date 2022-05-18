import java.util.ArrayList;

public class ALHeapMax implements Heap {
  private ArrayList<Integer> heap;
  private int size;

  public ALHeapMax() {
    heap = new ArrayList<Integer>();
    size = 0;
  }

  public void add(int value) {
    heap.add(value);
    size++;
    int index = size - 1;
    while (index > 0 && heap.get(index) > heap.get(parent(index))) {
      swap(index, parent(index));
      index = parent(index);
    }
  }

  public int remove() {
    int max = heap.get(0);
    swap(0, size - 1);
    heap.remove(size - 1);
    size--;
    int index = 0;
    maxHeapify(0);
    return max;
  }

  public int peek() {
    return heap.get(0);
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void maxHeapify(int index) {
    int left = left(index);
    int right = right(index);
    int largest = index;
    if (left < size && heap.get(left) > heap.get(index)) {
      largest = left;
    }
    if (right < size && heap.get(right) > heap.get(largest)) {
      largest = right;
    }
    if (largest != index) {
      swap(index, largest);
      maxHeapify(largest);
    }
  }

  public void swap(int i, int j) {
    int temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
  }

  public int parent(int i) {
    return (i - 1) / 2;
  }

  public int left(int i) {
    return 2 * i + 1;
  }

  public int right(int i) {
    return 2 * i + 2;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.print(heap.get(i) + " ");
    }
    System.out.println();
  }

  public static void main ( String[] args ) {
    ALHeapMax heap = new ALHeapMax();
    heap.add(5);
    heap.add(3);
    heap.add(7);
    heap.add(2);
    heap.add(4);
    heap.add(6);
    heap.add(8);
    heap.add(1);
    while (!heap.isEmpty()) {
      System.out.println(heap.remove());
    }
  }
}
