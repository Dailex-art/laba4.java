/**
 * Клас, що представляє розділовий знак.
 */
public class PunctuationMark implements SentenceElement {
    private final char mark;
    /**
     * Конструктор розділового знака.
     * @param mark символ розділового знака
     */
    public PunctuationMark(char mark) {
        this.mark = mark;
    }
    @Override
    public String getAsString() {
        return String.valueOf(mark);//повертаємо символ як рядок(правило інтерфейсу)
    }
    @Override
    public String toString() {
        return getAsString(); //щоб при виводі усе працювало однаково
    }
}
