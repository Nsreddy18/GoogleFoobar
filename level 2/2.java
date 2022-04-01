get the parent node of a node in a binary tree arranged in a postorder form


import java.util.*;
public class Solution1 {
    public static int[] answer(int h,int[] arr){
        int[] answer=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i]=solution(h, arr[i]);
        }
        return answer;
    }
    public static int solution(int h,int x){
        int start=1;
        int end=1;
        for(int i=h;i!=0;i--){
            end=end*2;
        }
        end--;
        if(end==x){
            return -1;
        }
        while(start<end){
            end=end-1;
            int mid=start+(end-start)/2;
            if(mid==x || end==x){
                return end+1;
            }
            else if(mid>x){
                end=mid;
            }
            else{
                start=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(h,arr)));
        sc.close();
    }
}
