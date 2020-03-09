class Bird{
void fly()
{
System.out.println("Birds can fly");
}
}
class Parrot extends Bird {
void nest()
{
System.out.println("parrot keeps nest");
}
}
class Pegion extends Parrot {
void stable()
{
System.out.println("pegion flies stable");
}
}
class Inheritance {
public static void main(String[] args)
{
Pegion p=new Pegion();
p.stable();
p.nest();
p.fly();
}
}
