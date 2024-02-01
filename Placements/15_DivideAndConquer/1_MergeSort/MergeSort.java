public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        
        //Dividing
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);//left side
        mergeSort(arr, mid + 1, ei);//right side

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        
        int i = si;// iterator for the left
        int j = mid+1;// iterator for the right 
        int k = 0;// iterator for the temp

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for elements left on the left side
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for elements left on the right side
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copying temp to orignal arr.
        for(k=0, i=si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }    
}
