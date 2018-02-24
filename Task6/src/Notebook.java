import java.util.ArrayList;

/**
 * Выполнять операции с записями блокнота.
 */
public class Notebook {
    ArrayList<NotebookEntry> notebookEntries = new ArrayList<NotebookEntry>();
    int size = notebookEntries.size();

    /**
     * Добавить запись к записям блокнота.
     *
     * @param text Содержимое записи
     * @param line Номер записи в блокноте
     */
    public void addEntry(Notebook this, String text, int line) {

        if (line > size + 1 || line < 1) {
            System.out.print("This line can't exist");
        } else {
            NotebookEntry newNotebookEntry = new NotebookEntry(text);
            notebookEntries.add(line - 1, newNotebookEntry);
            size++;
        }
    }

    /**
     * Удалить запись из блокнота
     *
     * @param line Номер записи в блокноте
     */
    public void deleteEntry(Notebook this, int line) {
        NotebookEntry[] newNotebookEntries;

        if (line > size + 1 || line < 1) {
            System.out.print("This line doesn't exist");
        } else {
            notebookEntries.remove(line - 1);
            size--;
        }
    }

    /**
     * Изменить запись в блокноте
     *
     * @param line    Номер записи
     * @param newtext Текст, измененной записи
     */
    public void changeEntry(Notebook this, int line, String newtext) {
        if (line > size + 1 || line < 1) {
            System.out.print("This line doesn't exist");
        } else {
            this.notebookEntries.get(line - 1).setEntry(newtext);
        }
    }

    /**
     * Вывести все записи блокнота
     */
    public void showAllEntries(Notebook this) {
        for (int i = 0; i < size; i++) {
            System.out.format("%d: %s\n", i + 1, this.notebookEntries.get(i).getEntry());
        }
    }
}
