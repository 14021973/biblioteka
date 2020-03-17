package pl.biblioteka.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName="Biblioteka chybAAA ver 1.1";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }
}
