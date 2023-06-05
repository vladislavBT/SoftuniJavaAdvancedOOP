//package PolymorphismExercise.Vehicles;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] carProperties= scanner.nextLine().split("\\s+");
//        Car car = new Car(Double.parseDouble(carProperties[1]),Double.parseDouble(carProperties[2]),Double.parseDouble(carProperties[3]));
//
//        String[] truckProperties= scanner.nextLine().split("\\s+");
//        Truck truck = new Truck(Double.parseDouble(truckProperties[1]),Double.parseDouble(truckProperties[2]),Double.parseDouble(carProperties[3]));
//
//        String[] busProperties= scanner.nextLine().split("\\s+");
//        Bus bus = new Bus(Double.parseDouble(busProperties[1]),Double.parseDouble(busProperties[2]),Double.parseDouble(busProperties[3]));
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            String[] command = scanner.nextLine().split("\\s+");
//            if(command[0].equals("Drive")&& command[1].equals("Car")){
//                System.out.println(car.driveCar(Double.parseDouble(command[2])));
//            }else if(command[0].equals("Drive")&& command[1].equals("Truck")){
//                System.out.println(truck.driveTruck(Double.parseDouble(command[2])));
//            }else if(command[0].equals("Refuel")&& command[1].equals("Car")){
//                car.refuelCar(Double.parseDouble(command[2]));
//            }else if(command[0].equals("Refuel")&& command[1].equals("Truck")){
//                truck.refuelTruck(Double.parseDouble(command[2]));
//            }else if(command[0].equals("DriveEmpty")&& command[1].equals("Bus")){
//                System.out.println(bus.driveEmptyBus(Double.parseDouble(command[2])));
//            }else if(command[0].equals("Drive")&& command[1].equals("Bus")){
//                System.out.println(bus.driveBus(Double.parseDouble(command[2])));
//            }else if(command[0].equals("Refuel")&& command[1].equals("Bus")){
//                bus.refuelBus(Double.parseDouble(command[2]));
//            }
//        }
//
//
//
//        System.out.println(String.format("Car: %.2f",car.getFuelQuantity()));
//        System.out.println(String.format("Truck: %.2f",truck.getFuelQuantity()));
//        System.out.println(String.format("Bus: %.2f",bus.getFuelQuantity()));
//    }
//}
