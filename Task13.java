public class Task13 {
    public static void main(String[] args) {
        Car  car1 = new Car("TOYOTA", "Camry", 2022,4);
      //  Vehicle  car2 = new Car("Python Basics", "Jane Doe", 2020);
       // Vehicle  car3 = new Car("C++ Essentials", "Michael Johnson", 2019);

        System.out.println("Car Details: \n"+car1.toDisplay());
       // System.out.println("Book2:\n"+car2.toDisplay());
       // System.out.println("Book3:\n"+car3.toDisplay());
    }
}

class Vehicle {
    String make ;
    String model ;
    int year ;
}


    class Car extends Vehicle {
        int numberOfDoors;
        
         public Car (String make,String model, int year, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
       
         }

        public String toDisplay(){
        return String.format("Make: %s\nModel: %s\nYear: %d\nNumber of Door: %d\n",
        make,model,year,numberOfDoors);
         }
    }

