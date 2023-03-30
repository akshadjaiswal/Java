class MissingNumber {

  public static void main(String[] args) {
    int[] arr = { 4, 0, 2, 1 };
    System.out.println(Cyclic(arr));
  }

  public static int Cyclic(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    //find missing number
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;
      }
    }
    return arr.length;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
