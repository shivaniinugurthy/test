class Evilnum2
{
public static void main(String[] args)
{
  int num=45,rem=0,sum=0;
   int square=num*num;
    while(square!=0)
    {
   rem=square%10;
    square=square/10;
   sum=sum+rem;
}
if(sum==num)
{
System.out.println("evil num");
}
else
{
System.out.println("not an evil num");
}
}
}

   
      