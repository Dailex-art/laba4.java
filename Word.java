import java.util.Objects;
/**
 * Клас, що представляє слово. Складається з масиву літер.
 */
public class Word implements SentenceElement, Comparable<Word> {
    private final Letter[] letters;
    /**
     * Конструктор, який розбиває рядок на масив об'єктів Letter.
     * @param word рядок слова
     */
    public Word(String word) {
        this.letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            this.letters[i] = new Letter(word.charAt(i)); //створюється масив та кожен символ рядка перетворюється в об’єкт
        }
    }
    @Override
    public String getAsString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getCharacter());//використовує StringBuilder для того щоб повернути слово назад у рядок
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return getAsString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return this.getAsString().equalsIgnoreCase(word.getAsString());//порівнюємо слова не враховуючи регістр
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getAsString().toLowerCase());//використовуємо нижній регістр
    }
    @Override
    public int compareTo(Word other) {
        return this.getAsString().toLowerCase().compareTo(other.getAsString().toLowerCase());
    }
}
