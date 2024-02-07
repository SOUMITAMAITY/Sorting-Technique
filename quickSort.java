public class quickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                arr[i]=arr[j];
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
        
    }
    public static void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        
        int pi=partition(arr, low, high);
        quicksort(arr, low, pi-1);
        quicksort(arr, pi+1, high);
    }

    // Time Complexity=O(nlogn)--> for best or average case
    // Time Complexity=O(n^2) -->for worst case
    
    public static void main(String []args){
       int arr[]={2,1,9,5,0};
       int n=arr.length;
       quicksort(arr, 0, n-1);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
