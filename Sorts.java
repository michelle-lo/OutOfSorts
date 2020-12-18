public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 1; i < data.length - 1; i++) {
      int noSwap = 0;
      for (int j = 0; j < data.length - i; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        } else {
          noSwap++;
        }

      }
      if (noSwap == data.length - i) {
        i = data.length;
      }
    }
  }
}
