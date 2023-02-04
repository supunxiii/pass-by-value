public class passbyVal{
  public static void changeContent(int[] arr) {

   // If we change the content of array.
   arr[0] = 10;  //This will change the content of array in main method.
}

 static void changeRef(int[] arr) {
   // If we change the "Reference"
   arr = new int[2]; //This will not change the array in main method
   arr[0] = 15;
}

public static void main(String[] args) {
    int [] arr = new int[2];
    arr[0] = 4;
    arr[1] = 5;

    changeContent(arr);

    System.out.println(arr[0]);  //This will print 10

    changeRef(arr);

    System.out.println(arr[0]);  //Still print 10
                                 // Changing the reference doesn't reflect change here..
}
}
