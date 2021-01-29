import java.util.Random;

public class Algorithms {
    public int tallestNumber (int[] arr){
        int tallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>tallest){
                tallest = arr[i];
            }
        }
        return tallest;
    }

    public double tallestNumber(double[] arr){
        double tallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>tallest){
                tallest = arr[i];
            }
        }
        return tallest;
    }
    
    public int sumArr (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public double sumArr (double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public void printFirstDiagonal(int [][] arr){
        System.out.println(arr[0][0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
               
        }
    }

    public static void main(String[] args) {
        
    }
}

