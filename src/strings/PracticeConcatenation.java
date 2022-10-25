package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        System.out.println("-------Task1------\n");
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";
        String fullWord = wordPart1 + wordPart2 + wordPart3;

        System.out.println(fullWord); //learning

        System.out.println("\n------Task2------");

        String sentencePart1 = "I can";
        String sentencePart2 = "learn java";
        String sentence = sentencePart1.concat(" ").concat(sentencePart2);

        System.out.println(sentence); //I can learn java
    }
}
