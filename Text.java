import java.util.Set;
import java.util.TreeSet;
/**
 * Клас, що представляє текст. Складається з масиву речень.
 */
public class Text {
    private final Sentence[] sentences;//текст складається з масиву речень
    /**
     * Конструктор тексту. Виконує нормалізацію пробілів та розбиття на речення.
     * @param textString вхідний текст
     */
    public Text(String textString) {
        String normalizedText = textString.replaceAll("[\\t\\s]+", " ");//Замінюємо таби та пробіли на один пробіл
        String[] sentenceStrings = normalizedText.split("(?<=[.!?])\\s*");
        this.sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            this.sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }
    /**
     * збирає всі унікальні слова з тексту
     * та сортує їх за алфавітом.
     * * @return відсортована множина унікальних слів
     */
    public Set<Word> getUniqueSortedWords() {
        Set<Word> uniqueWords = new TreeSet<>();//Set-прибирає дублікати TreeSet-сортирує
        for (Sentence sentence : sentences) {
            for (SentenceElement element : sentence.getElements()) {
                if (element instanceof Word) {
                    uniqueWords.add((Word) element);//перевіряє тип даних
                }
            }
        }
        return uniqueWords;
    }
}
