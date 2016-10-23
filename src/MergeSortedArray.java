/**
 * Created by Nikhil on 10/22/16.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 ={1,0};
        int[] nums2 ={2};
        new MergeSortedArray().merge(nums1,1,nums2,1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null ||nums2==null)return;
        int index1= m-1;
        int index2 = n-1;
        int combinedIndex = m+n-1;

        while(index1>=0 || index2>=0){
            if(index1>=0&&index2>=0){
                if(nums1[index1]>nums2[index2]){
                    nums1[combinedIndex] = nums1[index1];
                    combinedIndex--;
                    index1--;

                }else{
                    nums1[combinedIndex] = nums2[index2];
                    combinedIndex--;
                    index2--;
                }
                continue;
            }

            if(index1>=0){
                nums1[combinedIndex]= nums1[index1];
                combinedIndex--;
                index1--;
                continue;
            }

            if(index2>=0){
                nums1[combinedIndex]= nums2[index2];
                combinedIndex--;
                index2--;
                continue;

            }
        }

    }
}
