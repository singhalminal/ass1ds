import java.util.Scanner;
class que3
{
static int fun(int n)
{
if(n==0||n==1)
{
return n;
}

return fun(n-1)+fun(n-2);

}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=fun(n);
System.out.print(a);
}
}