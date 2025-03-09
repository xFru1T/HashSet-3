import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Character> s1 = new HashSet<>();
        System.out.print("Print string: ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[а-яА-Яa-zA-Z0-9]+", "");
        for (char c : newStr.toCharArray()) {
            s1.add(c);
        }
        System.out.println("Print char symbol: " + s1);
    }
}
