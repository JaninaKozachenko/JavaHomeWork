package com.pb.kozachenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();

        bookOne.setTitle("451 градус по Фаренгейту");
        bookOne.setAuthor("Брэдбери Рэй");
        bookOne.setYearOfPublishing(2008);
        bookTwo.setTitle("1984");
        bookTwo.setAuthor("Оруэлл Джордж");
        bookTwo.setYearOfPublishing(1949);
        bookThree.setTitle("Три товарища");
        bookThree.setAuthor("Ремарк Эрих Мария");
        bookThree.setYearOfPublishing(2000);
        System.out.println("Все книги библиотеки:\n" + bookOne.getInfoBook() + "\n" + bookTwo.getInfoBook() + "\n" + bookThree.getInfoBook());

        Reader readerOne = new Reader("Петров Д.Ю.", 8369, "юридический факультет", "14/06/2000", "0961393210");
        Reader readerTwo = new Reader("Кил Р.П.", 4563, "экономический факультет", "08/12/1999", "0508393542");
        Reader readerThree = new Reader("Визир К.Д.", 5210, "юридический факультет", "19/03/2001", "0678003020");
        System.out.println("\nВсе читатели библитеки:\n" + readerOne.getInfoReader() + "\n" + readerTwo.getInfoReader() + "\n" + readerThree.getInfoReader());

        System.out.println("\nАренда книг.");
        readerOne.takeBook(2);
        readerThree.takeBook(2);

        readerOne.takeBook(bookOne.getTitle() + ",", bookThree.getTitle());
        readerThree.takeBook(bookTwo.getTitle() + ",", bookThree.getTitle());

        readerOne.takeBook(bookOne,bookThree);
        readerThree.takeBook(bookTwo,bookThree);

        System.out.println("\nВозврат книг.");
        readerOne.returnBook(2);
        readerThree.returnBook(2);

        readerOne.returnBook(bookOne.getTitle() + ",", bookThree.getTitle());
        readerThree.returnBook(bookTwo.getTitle() + ",", bookThree.getTitle());

        readerOne.returnBook(bookOne,bookThree);
        readerThree.returnBook(bookTwo, bookThree);
    }
}
