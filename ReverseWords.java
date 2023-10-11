public class ReverseWords {

        public static void main(String[] args) {
            String s = "alpha beta gama delta sigma";
            String[] sb = s.split(" ", 0); // splitting the string at "+"
            String[] result = s.reverse();
            
            for (String sub_string : result) {
                System.out.println(sub_string);
            }
        }
    }


