public class strings {
        public static void main(String[] args){
            String sentence = "We don't need no education\n" +
                    "We don't need no thought control";
            System.out.println(sentence);

            System.out.printf("We don't need no education%n We don't need no thought control");

            String escape = "\nCheck 'this' out!, \"s inside of \"s!";
            System.out.println(escape);

            String windows = "In windows, the main drive is usually C: \\";
            System.out.println(windows);

            String escapeHell = "I can do backslashes \\, double backslashes \\\\,\n and the amazing triple backslash \\\\\\!";
            System.out.println(escapeHell);


        }

}
