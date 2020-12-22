import java.util.*;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
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

/*
For each index i of the array, starting with the first index:
a Find the smallest element located at index i or any of the higher indices.
b Swap that value into index i.
c Increase i
d repeat a,b,c until the last index.

OR:

repeat (numOfElements - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
*/
  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length - 1; i++) {
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
}
