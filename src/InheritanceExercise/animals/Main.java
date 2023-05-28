//import java.util.ArrayList;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Animal> animals=new ArrayList<>();
//        String command= scanner.nextLine();
//
//            while (!command.equals("Beast!")) {
//                try {
//                if (command.equals("Cat")) {
//                    String[] properties = scanner.nextLine().split(" ");
//                    Cat cat = new Cat(properties[0], Integer.parseInt(properties[1]), properties[2]);
//                    animals.add(cat);
//                } else if (command.equals("Dog")) {
//                    String[] properties = scanner.nextLine().split(" ");
//                    Dog dog = new Dog(properties[0], Integer.parseInt(properties[1]), properties[2]);
//                    animals.add(dog);
//                } else if (command.equals("Frog")) {
//                    String[] properties = scanner.nextLine().split(" ");
//                    Frog frog = new Frog(properties[0], Integer.parseInt(properties[1]), properties[2]);
//                    animals.add(frog);
//                } else if (command.equals("Kitten")) {
//                    String[] properties = scanner.nextLine().split(" ");
//                    Kitten kittens = new Kitten(properties[0], Integer.parseInt(properties[1]), properties[2]);
//                    animals.add(kittens);
//                } else if (command.equals("Tomcat")) {
//                    String[] properties = scanner.nextLine().split(" ");
//                    Tomcat tomcat = new Tomcat(properties[0], Integer.parseInt(properties[1]), properties[2]);
//                    animals.add(tomcat);
//                }}catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
//
//                command = scanner.nextLine();
//            }
//
//        for (Animal animal : animals) {
//            System.out.println(animal.getClass().getSimpleName().toString());
//            System.out.printf("%s %d %s%n",animal.name,animal.age,animal.gender);
//            System.out.println(animal.produceSound());
//        }
//
//    }
//    }

