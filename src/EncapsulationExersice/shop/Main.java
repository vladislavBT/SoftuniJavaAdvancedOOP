package EncapsulationExersice.shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] person= scanner.nextLine().split(";");
        List <Person> persons = new ArrayList<>();
        for (int i = 0; i < person.length; i++) {
            String[] details=person[i].split("=");
            Person person1 = new Person(details[0],Integer.parseInt(details[1]));
            persons.add(person1);
        }

        String[] product= scanner.nextLine().split(";");
        List <Product> products = new ArrayList<>();
        for (int i = 0; i < product.length; i++) {
            String[] details=product[i].split("=");
            Product products1 = new Product(details[0],Integer.parseInt(details[1]));
            products.add(products1);
        }

        String command = scanner.nextLine();
        while (!command.equals("END")){
            try {
                String[] arr = command.split(" ");
                for (int i = 0; i < person.length; i++) {
                    if(persons.get(i).getName().equals(arr[0])){
                        for (int j = 0; j < product.length; j++) {
                            if(products.get(j).getName().equals(arr[1])){
                                persons.get(i).buyProduct(products.get(j));
                            }
                        }
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Person p : persons) {
            if(p.getProducts().isEmpty()){
                System.out.printf("%s - Nothing bought%n",p.getName());
            } else {
                StringBuilder sb= new StringBuilder();
                sb.append(String.format("%s - ",p.getName()));
                for (Product pProduct : p.getProducts()) {
                    sb.append(String.format("%s, ",pProduct.getName()));
                }
                sb.replace(sb.length()-2, sb.length(),"");
                System.out.println(sb.toString());

            }
        }

    }
}
