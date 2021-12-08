package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantasyBook = new Book("Lord of the Rings", 1020);
        Book algoBook = new Book("Grokking Algorithms", 290);
        Book javaBook = new Book("Complete Java Reference", 1502);
        Book codeBook = new Book("Clean code", 700);
        Book[] myLibrary = new Book[4];
        myLibrary[0] = fantasyBook;
        myLibrary[1] = algoBook;
        myLibrary[2] = javaBook;
        myLibrary[3] = codeBook;
        for (int i = 0; i < myLibrary.length; i++) {
            System.out.println(myLibrary[i].getName() + " - " + myLibrary[i].getPages() + " pages");
        }
        myLibrary[0] = myLibrary[3];
        myLibrary[3] = fantasyBook;
        System.out.println();
        System.out.println("Below is the list of the books upon swapping 0 and 3");
        for (int i = 0; i < myLibrary.length; i++) {
            System.out.println(myLibrary[i].getName() + " - " + myLibrary[i].getPages() + " pages");
        }
        System.out.println();
        System.out.println("Below are the books with the name \"Clean code\" only");
        for (int i = 0; i < myLibrary.length; i++) {
            if ("Clean code".equals(myLibrary[i].getName())) {
                System.out.println(myLibrary[i].getName() + " - " + myLibrary[i].getPages() + " pages");
            }
        }
    }
}
