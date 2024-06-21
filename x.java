import java.util.Scanner;
public class x {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr1 = {2,5,6};
        merge(arr,6,arr1,3);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m+n];
        int p=0;
        int q=0;
        int i=0;
        int c=0;
        int a=0;
        while(p<m && q<n){
            if(nums1[p]>=nums2[q]){
                ans[i] = nums2[q];
                i++;
                q++;
            }
            if(nums1[p]==0)
            {
                c+=1;
                break;

            }
            if(nums2[q]==0)
            {
                a+=1;
                break;

            }
            else{
                ans[i] = nums1[p];
                i++;
                p++;
            }
        }
        while(p<m  && c==0){
            ans[i]=nums1[p];
            i++;
            p++;

        }
        while(q<n && a==0){
            ans[i]=nums2[q];
            i++;
            q++;
        }
        for(int j=0 ;j<m+n;j++){
           if(ans[j] != 0) System.out.print(ans[j]);
        }


    }
}
