public class Main {
    public static void main(String[] args){
        Notebook n=new Notebook();
        n.addEntry("Hello World!", 1);
        n.showAllEntries();
        n.addEntry("How are u?", 2);
        n.showAllEntries();
        n.addEntry("What's up?", 3);
        n.showAllEntries();
        n.deleteEntry(1);
        n.showAllEntries();
        n.changeEntry(1, "Hey you");
        n.showAllEntries();
    }
}
