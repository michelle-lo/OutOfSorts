import java.util.*;

public class Tester {
  public static void main (String[] args) {
    System.out.println("***\nbubbleSort\n***");
    int[] a1 = {5, 1, 12, -5, 16};
    Sorts.bubbleSort(a1);
    print(Arrays.toString(a1), "[-5, 1, 5, 12, 16]");

    int[] b1 = {6, 1, 2, 3, 4 ,5};
    Sorts.bubbleSort(b1);
    print(Arrays.toString(b1), "[1, 2, 3, 4, 5, 6]");

    int[] c1 = {2, 3, 4, 5, 1};
    Sorts.bubbleSort(c1);
    print(Arrays.toString(c1), "[1, 2, 3, 4, 5]");

    int[] zeroSize1 = {};
    Sorts.bubbleSort(zeroSize1);
    print(Arrays.toString(zeroSize1), "[]");

    int[] repeats1 = {1, 1, 1, -1, -1 , 4, 1, 2};
    Sorts.bubbleSort(repeats1);
    print(Arrays.toString(repeats1), "[-1, -1, 1, 1, 1, 1, 2, 4]");

    int[] reverse1 = {10, 8, 6, 4, 2, 0, -2};
    Sorts.bubbleSort(reverse1);
    print(Arrays.toString(reverse1), "[-2, 0, 2, 4, 6, 8, 10]");

    Random rand = new Random(100); //[-466, -796, 749, -319, -713]
    int[] randArr1 = new int[5];
    for (int i = 0; i < randArr1.length; i++) {
      randArr1[i] = rand.nextInt() % 1000;
    }
    System.out.println("original: " + Arrays.toString(randArr1));
    Sorts.bubbleSort(randArr1);
    print(Arrays.toString(randArr1), "[-796, -713, -466, -319, 749]");

    int[] sorted1 = {1, 2, 3, 4, 5};
    Sorts.bubbleSort(sorted1);
    print(Arrays.toString(sorted1), "[1, 2, 3, 4, 5]");

    System.out.println("***\nselectionSort\n***");
    int[] a2 = {5, 1, 12, -5, 16, 2, 12, 14};
    Sorts.selectionSort(a2);
    print(Arrays.toString(a2), "[-5, 1, 2, 5, 12, 12, 14, 16]");

    int[] b2 = {64, 25, 12, 22, 11};
    Sorts.selectionSort(b2);
    print(Arrays.toString(b2), "[11, 12, 22, 25, 64]");

    int[] zeroSize2 = {};
    Sorts.selectionSort(zeroSize2);
    print(Arrays.toString(zeroSize2), "[]");

    int[] repeats2 = {1, 3, 2, 4, 2, 1, 2, 3, 1, 1};
    Sorts.selectionSort(repeats2);
    print(Arrays.toString(repeats2), "[1, 1, 1, 1, 2, 2, 2, 3, 3, 4]");

    int[] reverse2 = {99, 98, 97, 96, 95, 94};
    Sorts.selectionSort(reverse2);
    print(Arrays.toString(reverse2), "[94, 95, 96, 97, 98, 99]");

    
  }

  public static void print (Object actual, Object expected) {
    String str = "";
    str += "Actual: " + actual + "\n";
    str += "Expected: " + expected + "\n";
    if (actual.equals(expected)) {
      str += "Success! :)\n";
    } else {
      str += "Fail! :(\n";
    }
    System.out.println(str);
  }
}
