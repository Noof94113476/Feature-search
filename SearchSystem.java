import java.util.Scanner;

public class SearchSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = {"Sales", "Finance", "HR", "IT", "Marketing"};

        System.out.println("Enter the department name:");
        String input = scanner.nextLine();

        boolean found = false;

        for (String dept : data) {
            switch (dept.toLowerCase()) {
                case "sales":
                case "finance":
                case "hr":
                case "it":
                case "marketing":
                    if (dept.equalsIgnoreCase(input)) {
                        System.out.println("Department found: " + dept);
                        found = true;
                        break;
                    }
                    break;
                default:
                    break;
            }
        }

        if (!found) {
            System.out.println("Department not found.");
        }

        scanner.close();
    }
}
