import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] symbols = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        int n = ((int) (Math.random() * (words.length + 1))); // умножаю на words.length + 1, чтобы включить последнее слово внутри массива words
        String hiddenword = words[n]; // загадал слово
        System.out.println(hiddenword);
        Scanner scanner = new Scanner(System.in);
        char[] hiddensymbols = hiddenword.toCharArray(); // создал массив состоящий из символов строки hiddenword
        do {
            System.out.println("Угадайте слово");
            String answer = scanner.nextLine(); // случай, если пользователь угадал слово
            if (hiddenword.equals(answer)) {
                System.out.println("Вы угадали");
                break;
            } else if (answer != hiddenword) {
                char[] answersymbols = answer.toCharArray();
                for (int i = 0; i < hiddenword.length(); i++) {
                    if (i >= answersymbols.length) break;
                    if (hiddenword.charAt(i) != answersymbols[i]) {
                        answersymbols[i] = '#'; // символы, которые были угаданы неверно "закрашиваются решеткой"
                    }
                    System.out.print(answersymbols[i]);
                }
                for (int j =0; j < symbols.length-answersymbols.length; j++) {
                    System.out.print(symbols[j]);
                }
            }

        }while (true) ;
    }
}
