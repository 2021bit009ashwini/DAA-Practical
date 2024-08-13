import java.util.*;
public class asrt {
    public static void even(int arr[],int i ,int n){
        if(i<=n){
            if(arr[i]%2 ==0){
                System.out.println(arr[i]);
            }
            even(arr,i+1,n);
        }
    }
    public static void odd(int arr[],int i ,int n){
        if(i<=n){
            if(arr[i]%2 !=0){
                System.out.println(arr[i]);
            }
            odd(arr,i+1,n);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Even integers:");
        even(arr, 0, n - 1);
        System.out.println("Odd integers:");
        odd(arr, 0, n - 1);
    }
}