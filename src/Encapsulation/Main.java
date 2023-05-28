package Encapsulation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(" ");
            Person person = new Person(details[0],details[1],Integer.parseInt(details[2]),Double.parseDouble(details[3]));
            persons.add(person);
        }
        Team team = new Team("Black Eagles");
        for (Person person : persons) {
            team.addPlayer(person);
        }


        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getSecondTeam().size()+ " players");
    }
}
