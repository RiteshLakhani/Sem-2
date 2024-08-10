class A
{
void op(int r)
{ 
System.out.println(3.14*r*r);
}

void op(double h,double b)
{
System.out.println(0.5*b*h);
}
void op(float l)
{
System.out.println(l*l);
}

public static void main(String args[])
{
A obj=new A();
obj.op(15);
obj.op(20.5,12.5);
obj.op(18.78f);
}
}