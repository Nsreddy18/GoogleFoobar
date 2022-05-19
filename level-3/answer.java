import java.util.*;
class temp{
    public static long solve(long m,long f,long m1,long f1,long count){
        if(m1==m && f1==f)
            return count;
        if(m1<m && f1==f)
            return solve(m,f,m1+f1,f1,count+1);
        if(m1==m && f1<f)
            return solve(m,f,m1,f1+m1,count+1);
        if(m1<m && f1<f)
            return Math.min(solve(m,f,m1+f1,f1,count+1),solve(m,f,m1,f1+m1,count+1));
        return Long.MAX_VALUE;
    }
    public static String solution(long m,long f){
        long count=solve(m, f, 1, 1, 0);
        if(count==Long.MAX_VALUE)
            return "impossible";
        return count+"";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m=sc.nextLong();
        long f=sc.nextLong();
        System.out.println(solution(m,f));
        sc.close();
    }
}

/*The above solution is very slow and might not run for a few test cases*/
