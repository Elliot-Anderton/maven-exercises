import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        String input = scan.nextLine();

        if (StringUtils.isNumeric(input)) {
            System.out.println("This is a number");
        } else {
            System.out.println(StringUtils.swapCase(input));
            System.out.println(StringUtils.reverse(input));
        }
    }
}
