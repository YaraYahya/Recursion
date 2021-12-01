public class recursion{

public static void main(String []args){
	int result=fact(10);
	System.out.println(result);

}



public static int fact(int n){
	if(n!=0)
	return (n+fact(n-1));
	else
	return n;

}
}