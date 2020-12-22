//import java.util.*;
public class Sorts{

  public static void bubbleSort(int[] data){
    for (int i = 1; i < data.length; i++) {
      int swaps = 0;
      for (int j = 0; j < data.length - i; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
          swaps++;
        }
      }
      if (swaps == 0) {
        i = data.length;
      }
    }
  }


  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++) {
      int minIndex = i;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[minIndex]) {
          minIndex = j;
        }
      }
      int temp = data[i];
      data[i] = data[minIndex];
      data[minIndex] = temp;
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++) {
      int x = data[i];
      int j = i - 1; 
      while (j >= 0 && data[j] > x) {
        data[j + 1] = data[j];
        j--;
      }
      data[j + 1] = x;
    }
  }

}
