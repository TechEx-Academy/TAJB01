package techex;

public class Arrays {
    public static void main(String[] args) {
        // Create array of 5 elements
        int[] arr = new int[5];

        // insert elements into the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;


        // Create array with values
        int[] arr2 = new int[]{1,2,3,4,5};

        int[] arr3 = {1,2,3,4,5};


        // Find the maximum element of a array
        int[] array = {5,3,2,7,9,5};

        int high = arr[0];
        for(int i : arr){
            if(i > high){
                high = i;
            }
        }

        System.out.println(high);


        // Find the minimum values of an array
        int[] array2 = {3,6,2,4,8,9,0};

        int low = arr[0];
        for(int i : arr){
            if(i < low){
                low = i;
            }
        }

        System.out.println(low);
    }
}
