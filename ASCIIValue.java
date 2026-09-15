public class ASCIIValue {
    public static void main(String[] args) {
        System.out.println("Uppercase Letters:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
        System.out.println("Lowercase Letters:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}

