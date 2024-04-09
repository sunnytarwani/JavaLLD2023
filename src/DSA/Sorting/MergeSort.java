package DSA.Sorting;

public class MergeSort {
   public void Sort(int [] A , int s , int e){
       if(s>=e){
           return;
       }
       int mid = (s+e)/2;
       Sort(A , s , mid);
       Sort(A , mid+1 , e );
       Merge(A , s , e , mid);
   }

   public void Merge(int [] A , int s , int e , int mid){
       int [] final_array = new int[e-s+1];
       int i = s;
       int j = mid+1;
       int k = 0;
       while(i <= mid && j <= e){
           if(A[i] <= A[j]){
               final_array[k++] = A[i++];
           }
           else {
               final_array[k++] = A[j++];
           }
       }

       while(i <= mid){
           final_array[k++] = A[i++];
       }

       while(j <= e){
           final_array[k++] = A[j++];
       }

       for(int a = s ; a <= e ; a++){
           A[a] = final_array[a-s];
       }
   }

   public void printArray(int [] A){
       for(int i = 0 ; i < A.length ; i++){
           System.out.print(A[i] + " ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
       int [] A = {2,6,8,5,3,1,4,9,7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.Sort(A , 0 , A.length-1);
        mergeSort.printArray(A);
    }
}
