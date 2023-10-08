public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Prasun kr Mondal";
        String newStr = str.replaceAll(" ","");
        System.out.println("New string after space removal : "+newStr);
    }
}
