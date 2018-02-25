import java.util.ArrayList;
import java.util.Arrays;

/**
 * Выполнять операции с записями блокнота.
 */
public class Notebook {
    NotebookEntry[] notebookEntries = new NotebookEntry[2];
    int size = 0;

    /**
     * Добавить запись к записям блокнота.
     *
     * @param text Содержимое записи
     * @param line Номер записи в блокноте
     */
    public void addEntry(String text, int line) {

        if (line > size + 1 || line < 1) {
            System.out.print("This line can't exist");
        } else {
            if (size == notebookEntries.length) {
                notebookEntries = Arrays.copyOf(notebookEntries, 2 * notebookEntries.length);
            }
            System.arraycopy(notebookEntries, line - 1, notebookEntries, line, size - line+1);
            notebookEntries[line-1]=new NotebookEntry(text);
            size++;
        }
    }

    /**
     * Удалить запись из блокнота
     *
     * @param line Номер записи в блокноте
     */
    public void deleteEntry(int line) {
        NotebookEntry[] newNotebookEntries;

        if (line > size + 1 || line < 1) {
            System.out.print("This line doesn't exist");
        } else {
            System.arraycopy(notebookEntries, line, notebookEntries, line - 1, size - line);
            size--;
            if (size == notebookEntries.length / 2)
                notebookEntries=Arrays.copyOf(notebookEntries, notebookEntries.length/2);
        }
    }

    /**
     * Изменить запись в блокноте
     *
     * @param line    Номер записи
     * @param newtext Текст, измененной записи
     */
    public void changeEntry(int line, String newtext) {
        if (line > size + 1 || line < 1) {
            System.out.print("This line doesn't exist");
        } else {
            notebookEntries[line-1].setEntry(newtext);
        }
    }

    /**
     * Вывести все записи блокнота
     */
    public void showAllEntries() {
        for (int i = 0; i < size; i++) {
            System.out.format("%d: %s\n", i + 1, notebookEntries[i].getEntry());
        }
    }
}
