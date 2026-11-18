class Parent extends Thread{
public void run(){
System.out.println("This is a thread");
}
}
class Student extends Parent{
@Override

public void run(){
System.out.println("Now Student is running!");
}
}
class Teacher extends Parent{
@Override
public void run(){
System.out.println("Teacher is also running");
}
}
class Me{
public static void main(String []args)
{
Parent parent=new Parent();
Student student=new Student();
Teacher teacher=new Teacher();

parent.start();
student.start();
teacher.start();
}
}

