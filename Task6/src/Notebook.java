import java.util.Scanner;

public class Notebook {
    Scanner input = new Scanner(System.in);
    int size;
    NotebookEntry[] notebookEntries=new NotebookEntry[size];

public void addEntry(Notebook this, String text, int line){

    NotebookEntry[] newNotebookEntries;

    if (line>size+1||line<1) {
        System.out.print("This line can't exist");
    }
    else{
        size++;
        newNotebookEntries=new NotebookEntry[size];
        System.arraycopy(this.notebookEntries, 0, newNotebookEntries, 0, line-1 );
        newNotebookEntries[line-1] = new NotebookEntry(text);
        System.arraycopy(this.notebookEntries, line-1, newNotebookEntries, line, size-line);
        this.notebookEntries=newNotebookEntries;
    }
}

public void deleteEntry(Notebook this, int line){
    NotebookEntry[] newNotebookEntries;

    if (line>size+1||line<1) {
        System.out.print("This line doesn't exist");
    }
    else{
        newNotebookEntries= new NotebookEntry[size-1];
        System.arraycopy(this.notebookEntries, 0, newNotebookEntries, 0, line-1 );
        System.arraycopy(this.notebookEntries, line, newNotebookEntries, line-1, size-line);
        this.notebookEntries=newNotebookEntries;
        size--;
    }
}

public void changeEntry(Notebook this, int line, String newtext){
    this.deleteEntry(line);
    this.addEntry(newtext, line);
}

public void showAllEntries(Notebook this){
    for(int i=0; i<size; i++)
    {
      System.out.format("%d: %s\n", i+1, this.notebookEntries[i].Entry);
    }
}
}
