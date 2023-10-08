public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Prasun kr Mondal";
        String vowels = "[aeiouAEIOU]";
        String newStr = str.replaceAll(vowels,"");
        System.out.println(newStr);
    }
}
