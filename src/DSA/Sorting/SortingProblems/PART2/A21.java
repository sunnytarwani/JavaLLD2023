package DSA.Sorting.SortingProblems.PART2;

public class A21 {
    public static void main(String[] args) {
        int [] A = {3,4,1,2};
        System.out.println(mergeSort(A , 0 , A.length-1));
    }
    public static int mergeSort(int [] A , int s , int e){
        int count = 0;
        if(e>s){
            int mid = (s+e)/2;
            count += mergeSort(A , s , mid );
            count += mergeSort(A , mid+1 , e);
            count += merge(A , s , mid , e);

            return count;
        }
        return 0;
    }
    public static int merge(int [] A ,int s , int mid , int e){
        int p1 = s;
        int p2 = mid+1;
        int p3 = 0;
        int [] arrayTemp = new int [e-s+1];
        int count = 0;

        while(p1<= mid && p2 <= e){
            if(A[p1] < A[p2]){
                arrayTemp[p3++] = A[p1++];
            }
            else{
                arrayTemp[p3++] = A[p2++];
                System.out.println(mid + " --> " + p1 + " --> " + count);
                count += (mid - p1 + 1);
            }
        }

        while(p1<= mid){
            arrayTemp[p3++] = A[p1++];
        }
        while(p2 <= e){
            arrayTemp[p3++] = A[p2++];
        }

        for(int i = s ; i < e ; i++){
            A[i] = arrayTemp[i-s];
        }

        return count;
    }
}
