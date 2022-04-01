import java.util.*;
class Solution{
    public static int answer(String s){
        int count=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='>'){
                right++;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='<'){
                        count++;
                    }
                }
            }
            if(s.charAt(i)=='<' && right>0){
                count=count+(right);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}
