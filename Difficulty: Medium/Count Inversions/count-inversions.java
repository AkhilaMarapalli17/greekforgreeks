class Solution {
    static int countAndMerge(int [] arr, int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] le=new int[n1];
        int [] ri=new int[n2];
        for(int i=0;i<n1;i++){
            le[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            ri[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k =l;
        int invC=0;
        while(i<n1 && j<n2){
            if(le[i]<=ri[j]){
                arr[k++]=le[i++];
            }
            else
            {
                arr[k++]=ri[j++];
                invC=invC+(n1-i);
            }
        }
        while(i<n1){
            arr[k++]=le[i++];
        }
        while(j<n2){
            arr[k++]=ri[j++];

        }
        return invC;
        
    }
    static int countInv(int [] arr,int l,int r){
        int res=0;
        if(l<r){
            int m=(l+r)/2;
            res=res+countInv(arr,l,m);
            res=res+countInv(arr,m+1,r);
            res=res+countAndMerge(arr,l,m,r);
        }
        return res;
    }
    static int inversionCount(int arr[]) {
        // Code
        int n=arr.length;
        int result=countInv(arr,0,n-1);
        return result;
        
    }
}