package techex;

public class Loops {
    public static void main(String[] args) {
        // while loop
        // print from 1 to 10

        int count = 1;
        while(count < 11){
            System.out.println(count);
            count++;
        }

        // do-while loop
        // print from 1 to 10
        int count2 = 1;
        do{
            System.out.println(count);
            count++;
        }while(count < 11);


        // for loop
        // print from 1 to 10
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // loop through array
        int[] arr = {1,2,3,4,5};

        for(int i : arr){
            System.out.println(i);
        }
    }
}
