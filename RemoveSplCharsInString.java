public class RemoveSplChars {

public static void main(String[]  args)
{
    String str= "This#string%contains^special*characters&.";
    str = str.replaceAll("[^a-zA-Z0-9]", " ");
    System.out.println(str);
}
}

//    public static void main(String[] args) {
//        String str = "P/ra-su^n#k:r@M<O>;nd?al";
//        String spl = "[^a-zA-Z0-9]";
//
//        String newStr = str.replaceAll(spl, "");
//
//        System.out.println("The new string without special characters is: " + newStr);
//    }
