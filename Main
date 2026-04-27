import java.util.Set;
/**
 * Головний клас для запуску програми.
 */
public class Main {
    public static void main(String[] args) {
        String myText = "Текст для    перевірки\t\t,   А Я Б  текст!";
        System.out.println("Початковий текст:\n" + myText);
        Text parsedText = new Text(myText);
        Set<Word> result = parsedText.getUniqueSortedWords();
        System.out.println("\nТекст відсортований в алфавітному порядку та без повторень:");
        for (Word word : result) { //result — це набір Set об’єктів Word
            System.out.print(word.getAsString().toLowerCase() + " ");
        }
    }
}
