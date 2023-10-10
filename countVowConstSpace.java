public class countVowConstSpace {
    public static void main(String[] args) {
        String str = "Prasun kr Mondal";
        int length  = str.length();
        count(str,length);
    }

    static void count(String str, int length){
        int vow = 0;
        int constant = 0;
        int space = 0;
        str = str.toLowerCase();

        for(int i=0; i<length; i++) {
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                vow++;

            } else if (ch >= 'a' && ch <= 'z' ) {
                constant++;

            } else if (ch == ' ') {
                space ++;
            }

        }
        System.out.println("no. of vowels: " + vow);
        System.out.println("no. of constants: " + constant);
        System.out.println("no. of spaces: " + space);

    }
}
