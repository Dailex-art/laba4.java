import java.util.ArrayList;
import java.util.List;
/**
 * Клас, що представляє речення. Складається з масиву слів та розділових знаків.
 */
public class Sentence {
    private final SentenceElement[] elements;//речення зберігається як масив елементів
    /**
     * Конструктор речення. Роздліляє рядок на слова та розділові знаки.
     * @param sentenceString рядок речення
     */
    public Sentence(String sentenceString) {
        List<SentenceElement> parsedElements = new ArrayList<>();//parsedElements — тимчасовий список елементів,currentWord — накопичує символи слова
        StringBuilder currentWord = new StringBuilder();
        for (char c : sentenceString.toCharArray()) {
            if (Character.isLetter(c)) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    parsedElements.add(new Word(currentWord.toString()));
                    currentWord.setLength(0);
                }
                if (!Character.isWhitespace(c)) {
                    parsedElements.add(new PunctuationMark(c));//якщо не пробіл-то пунктуаційний символ
                }
            }
        }
        if (currentWord.length() > 0) {
            parsedElements.add(new Word(currentWord.toString()));
        }
        this.elements = parsedElements.toArray(new SentenceElement[0]);
    }
    public SentenceElement[] getElements() {
        return elements;
    }
}
