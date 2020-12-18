import java.util.*;

public class Tester {
  public static void main (String[] args) {
    int[] a = {5, 1, 12, -5, 16};
    Sorts.bubbleSort(a);
    print(Arrays.toString(a), "[-5, 1, 5, 12, 16]");

    int[] b = {6, 1, 2, 3, 4 ,5};
    Sorts.bubbleSort(b);
    print(Arrays.toString(b), "[1, 2, 3, 4, 5, 6]");

    int[] c = {2, 3, 4, 5, 1};
    Sorts.bubbleSort(c);
    print(Arrays.toString(c), "[1, 2, 3, 4, 5]");

    int[] zeroSize = {};
    Sorts.bubbleSort(zeroSize);
    print(Arrays.toString(zeroSize), "[]");

    int[] repeats = {1, 1, 1, -1, -1 , 4, 1, 2};
    Sorts.bubbleSort(repeats);
    print(Arrays.toString(repeats), "[-1, -1, 1, 1, 1, 1, 2, 4]");

    int[] reverse = {10, 8, 6, 4, 2, 0, -2};
    Sorts.bubbleSort(reverse);
    print(Arrays.toString(reverse), "[-2, 0, 2, 4, 6, 8, 10]");

    Random rand = new Random(100); //[-466, -796, 749, -319, -713]
    int[] randArr = new int[5];
    for (int i = 0; i < randArr.length; i++) {
      randArr[i] = rand.nextInt() % 1000;
    }
    System.out.println("original: " + Arrays.toString(randArr));
    Sorts.bubbleSort(randArr);
    print(Arrays.toString(randArr), "[-796, -713, -466, -319, 749]");

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
