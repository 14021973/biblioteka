package pl.biblioteka.app;

import pl.biblioteka.io.DataReader;
import pl.biblioteka.model.Book;
import pl.biblioteka.model.Library;
import pl.biblioteka.model.Magazine;

public class LibraryControl {

    private static final int EXIT=0;
    private static final int ADDBOOK=1;
    private static final int ADDMAGAZINE=3;
    private static final int PRINTBOOK=2;
    private static final int PRINTMAGAZINE=4;
    private DataReader datareader=new DataReader();
    private Library library=new Library();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option=datareader.getInt();

            switch(option)
            {
                case ADDBOOK:
                    addBook();
                    break;
                case PRINTBOOK:
                    printBooks();
                    break;

                case ADDMAGAZINE:
                    addMagazine();
                    break;
                case PRINTMAGAZINE:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Cos jest nie tak.");


            }
    } while ( option !=EXIT);
    }

    private void exit() {
        System.out.println("Good bye !!!!");
        datareader.close();
    }

    private void printBooks() {

        library.printBooks();
    }

    private void addBook() {

        Book book=datareader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {

        Magazine magazine=datareader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {

        library.printMagazines();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(EXIT+" - wyjscie");
        System.out.println(ADDBOOK+"- dodanie nowej ksiazki");
        System.out.println(PRINTBOOK+" - wyswietlenie info o ksiazkach");
        System.out.println(PRINTMAGAZINE+" - wyswietlenie info o magazynach");
        System.out.println(ADDMAGAZINE+" - dodanie nowego magazynu");
    }

}
