package InterfaceAndAbstractClassesExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums= scanner.nextLine().split("\\s+");
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }
        String[] urlsString= scanner.nextLine().split("\\s+");
        List<String> urls = new ArrayList<>();
        for (int i = 0; i < urlsString.length; i++) {
            urls.add(urlsString[i]);
        }
        Smartphone smartphone = new Smartphone(numbers,urls);

        System.out.print(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
