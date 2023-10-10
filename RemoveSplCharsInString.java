public class RemoveSplChars {

public static void main(String[]  args)
{
    String str= "This#string%contains^special*characters&.";
    str = str.replaceAll("[^a-zA-Z0-9]", " ");
    System.out.println(str);
}
}

// import java.util.Scanner;

// public class RemoveSplChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = sc.nextLine();
//         str = str.replaceAll("[^a-zA-z0-9]","");
//         System.out.println(str);
//     }
// }
