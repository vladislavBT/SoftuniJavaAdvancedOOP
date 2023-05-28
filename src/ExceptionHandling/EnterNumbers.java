package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int start=1;
        while (numbers.size()<10){
            try {
                int num=readNum(start,100, scanner);
                start = num;
                numbers.add(num);
                }
            catch (IllegalStateException e){
                System.out.println(e.getMessage());
            }

        }

        String line =numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(line);
    }

    private static int readNum(int start, int end, Scanner scanner) {
        int num;
        try {
            num  = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            throw new IllegalStateException("Invalid number!");
        }
        if(num<=start || num>=end){
            throw new IllegalStateException("Your number is not in range " + start+ " - 100!");
        }

        return num;
    }
}
