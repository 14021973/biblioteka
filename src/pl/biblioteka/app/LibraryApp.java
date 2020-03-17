package pl.biblioteka.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName="Biblioteka chyba ver 1.11";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }
}
