public class Test {
    public static void main(String[] args) {
       String word = "let's go ";
        System.out.println(word.length());
       StringBuilder wordBuilder = new StringBuilder(word);

       wordBuilder.append(" with you!");
        System.out.println(wordBuilder);
    }
}
