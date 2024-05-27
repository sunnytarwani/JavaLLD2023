package DSA;

public class Test {
    public static int solve(int[] A) {
        return mergeSort(A,0,A.length-1);
    }
    //recurision part
    public static int mergeSort(int[] A,int s,int e){
        int invCount=0;
        int mod=1000000007;
        if(e>s){
            int m=(s+e)/2;
            invCount=(invCount+mergeSort(A,s,m))%mod;
            invCount=(invCount+mergeSort(A,m+1,e))%mod;
            invCount=(invCount+merge(A,s,m,e))%mod;
            return invCount;
        }
        return 0;
    }
    //merge the mergeSort function
    public static int merge(int[] A,int s,int m,int e){
        int count=0;
        int p1=s,p2=m+1,p3=0;
        int[] temp=new int[e-s+1];
        while(p1<=m && p2<=e){
            if(A[p1]<=A[p2]){
                temp[p3]=A[p1];
                p1++;
                p3++;
            }else{
                temp[p3]=A[p2];
                p2++;
                p3++;
                System.out.println(count + "  " + m  + "  " + p1 );
                count += (m-p1+1);
            }
        }
        //copy remaining elements from both p1 & p2
        while(p1<=m){
            temp[p3]=A[p1];
            p1++;
            p3++;
        }
        while(p2<=e){
            temp[p3]=A[p2];
            p2++;
            p3++;
        }
        //temp[] is created so copy the elements to A[].
        for(int i=s;i<=e;i++){
            A[i]=temp[i-s];
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
        int [] a = {3,4,1,2};
        System.out.println(solve(a));
    }
}
