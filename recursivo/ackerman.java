public class ackerman{
public static long ackermann(long m,long n){
    if(m == 0){
        return (n + 1);
    }else if(m > 0 && n == 0){
        return ackermann(m - 1, 1);
    }else{
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
public static void main(String[] args){
	System.out.println(ackermann(2,3));
	
	}
}
