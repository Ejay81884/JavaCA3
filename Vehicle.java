public class Vehicle {
public void init()
{
int no=10000;
System.out.println("The price is"+no);
}
public Vehicle(float brand)
{
    brand=12;
    System.out.println("THE BRAND IS"+brand);
}

class Car extends Vehicle{
    public void init(){
        no=12000;
        System.out.println("The price is"+no);
    }
}
}
int main()
{
    Car car = new Car();
    car.init();
}
