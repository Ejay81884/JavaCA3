class Thred extends Thread{
public void run(){
System.out.println("This is a thread!");
}
}
class Stop{
public static void main(String []args)
{
Thred see1=new Thred();
Thred see2=new Thred();
Thred see3=new Thred();
see1.start();
see2.start();
see3.start();
}
}