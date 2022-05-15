package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Take the book from UniLibrary " );
        System.out.println("-------------------------------------------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Return book to the UniLibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Take the magazine from UniLibrary");
        System.out.println("-------------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return magazine to the UniLibrary");
        System.out.println("-------------------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Add book to the UniLibrary");
        System.out.println("-------------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Add magazine to the UniLibrary");
        System.out.println("-------------------------------------------------------------------");
    }
}
