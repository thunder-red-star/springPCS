import java.util.ArrayList;

public class ALHeapMin implements Heap {
  private ArrayList<Integer> heap;
  private int size;

  public ALHeapMin() {
    heap = new ArrayList<Integer>();
    size = 0;
  }

  public void add(int x) {
    heap.add(x);
    size++;
    int i = size - 1;
    while (i > 0 && heap.get(parent(i)) > heap.get(i)) {
      swap(i, parent(i));
      i = parent(i);
    }
    minHeapify(i);
  }

  public int remove() {
    int result = heap.get(0);
    heap.set(0, heap.get(size - 1));
    heap.remove(size - 1);
    size--;
    minHeapify(0);
    return result;
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

  private void minHeapify(int i) {
    int l = left(i);
    int r = right(i);
    int smallest = i;
    if (l < size && heap.get(l) < heap.get(i)) {
      smallest = l;
    }
    if (r < size && heap.get(r) < heap.get(smallest)) {
      smallest = r;
    }
    if (smallest != i) {
      swap(i, smallest);
      minHeapify(smallest);
    }
  }

  private void swap(int i, int j) {
    int temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
  }

  private int parent(int i) {
    return (i - 1) / 2;
  }

  private int left(int i) {
    return 2 * i + 1;
  }

  private int right(int i) {
    return 2 * i + 2;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.print(heap.get(i) + " ");
    }
    System.out.println();
  }

  public String toString() {
    String result = "";
    for (int i = 0; i < size; i++) {
      result += heap.get(i) + " ";
    }
    return result;
  }

  public static void main(String[] args) {
    ALHeapMin heap = new ALHeapMin();
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
