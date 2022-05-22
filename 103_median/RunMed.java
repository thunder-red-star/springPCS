public class RunMed {
  private ALHeapMin minHeap;
  private ALHeapMax maxHeap;

  public RunMed() {
    minHeap = new ALHeapMin();
    maxHeap = new ALHeapMax();
  }

  public void add(Integer newVal) {
    // Algorithm:
    // 1. If newVal is greater than the median, add it to the minHeap
    // 2. If newVal is less than the median, add it to the maxHeap
    // 3. If newVal is equal to the median, add it to the minHeap
    // 4. If the minHeap and maxHeap are of different sizes, balance them

    if (newVal > getMedian()) {
      minHeap.add(newVal);
    }

    else if (newVal < getMedian()) {
      maxHeap.add(newVal);
    }

    else {
      minHeap.add(newVal);
    }

    if (minHeap.size() > maxHeap.size() + 1) {
      maxHeap.add(minHeap.remove());
    } else if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.add(maxHeap.remove());
    }
  }

  public int getMedian() {

    if (minHeap.size() == maxHeap.size()) {
      if (minHeap.size() == 0) {
        if (maxHeap.size() == 0) {
          return 0;
        } else {
          return maxHeap.peek();
        }
      }
      return (minHeap.peek() + maxHeap.peek()) / 2;
    } else if (minHeap.size() > maxHeap.size()) {
      return minHeap.peek();
    } else {
      return maxHeap.peek();
    }
  }

  public static void main (String[] args) {
    RunMed runMed = new RunMed();
    for (int i = 1; i < 15; i++) {
      runMed.add(i);
      System.out.println("Item added: " + i);
      System.out.println("Min Heap: " + runMed.minHeap.toString());
      System.out.println("Max Heap: " + runMed.maxHeap.toString());
      System.out.println("Median: " + runMed.getMedian());
      System.out.println("==========================");
    }
  }
}
