public class RunMed {
  private ALHeapMin minHeap;
  private ALHeapMax maxHeap;

  public RunMed() {
    minHeap = new ALHeapMin();
    maxHeap = new ALHeapMax();
  }

  public void add(Integer newVal) {
    if (minHeap.size() == 0) {
      minHeap.add(newVal);
      maxHeap.add(newVal);
    } else {
      if (newVal < minHeap.peek()) {
        minHeap.add(newVal);
      } else {
        maxHeap.add(newVal);
      }
      if (minHeap.size() - maxHeap.size() > 1) {
        maxHeap.add(minHeap.remove());
      } else if (maxHeap.size() - minHeap.size() > 1) {
        minHeap.add(maxHeap.remove());
      }
    }
  }

  public int getMedian() {
    if (minHeap.size() == maxHeap.size()) {
      return (minHeap.peek() + maxHeap.peek()) / 2;
    } else if (minHeap.size() > maxHeap.size()) {
      return minHeap.peek();
    } else {
      return maxHeap.peek();
    }
  }

  public static void main (String[] args) {
    RunMed runMed = new RunMed();
    for (int i = 0; i < 15; i++) {
      runMed.add(i);
      System.out.println(runMed.getMedian());
    }
    
  }
}
