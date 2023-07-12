import java.util.Scanner;

public class CountArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(CountArrayElement(array,n));
    }

    static int CountArrayElement(int array[], int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        int count=0;
        for(int i=0;i<n;i++) {
            if (max == array[i]) {
                count++;
            }
        }
        return n-count;


    }
}
