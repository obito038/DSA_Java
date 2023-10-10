public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Prasun kr Mondal";
        String vowels = "[aeiouAEIOU]";
        String newStr = str.replaceAll(vowels,"");
        System.out.println(newStr);
    }
}


//Approach2//
// import java.util.Scanner;
// public class vowelremove {
//     public static void main(String[] args) {
// //        String str = "Prasun kr modal";
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str= sc.nextLine();
//         System.out.println("You have entered: "+str);
//         System.out.print("After removing vowels: " + vremove(str));
//     }
//     static String vremove(String str){
//         str = str.replaceAll("([aeiouAEIOU])", "");
//         return str;
//     }
// }
