public class maxminarr {
    public void maxmin(int[] arr,int size){

        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<size;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        maxminarr A = new maxminarr();
        int[] a = {1,30,4,6,20,98,100};
        A.maxmin(a,a.length);
    }
    
}