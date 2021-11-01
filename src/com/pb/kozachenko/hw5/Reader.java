package com.pb.kozachenko.hw5;

public class Reader {

    private String nameReader;
    private int number;
    private String faculty;
    private String dateOfBDay;
    private String telNumber;

    public Reader(String nameReader, int number, String faculty, String dateOfBDay, String telNumber) {
        this.nameReader = nameReader;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBDay = dateOfBDay;
        this.telNumber = telNumber;
    }

    public String getNameReader() {
        return nameReader;
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBDay() {
        return dateOfBDay;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getInfoReader() {
        return "ФИО: " + nameReader + ", номер читательского билета: " + number + ", факультет: " + faculty + ", дата рождения: " + dateOfBDay + ", номер телефона: " + telNumber;
    }

    public void takeBook(int countBooks) {
        System.out.print("\n" + nameReader + " взял " + countBooks + " книги.");
    }

    public void takeBook(String... namesOfBooks) {
        System.out.print("\n" + nameReader + " взял книги:");
        for (String books : namesOfBooks) {
            System.out.print(" " + books);
        }
    }

    public void takeBook(Book... infoOfBooks) {
        System.out.print("\n" + nameReader + " взял книги:");
        for (Book ibooks : infoOfBooks) {
            System.out.println("\n" + ibooks.getInfoBook());
        }
    }

    public void returnBook(int countBooks) {
        System.out.print("\n" + nameReader + " вернул " + countBooks + " книги.");
    }

    public void returnBook(String... namesOfBooks) {
        System.out.print("\n" + nameReader + " вернул книги:");
        for (String books : namesOfBooks) {
            System.out.print(" " + books);
        }
    }

    public void returnBook(Book... infoOfBooks) {
        System.out.print("\n" + nameReader + " взял книги:");
        for (Book ibooks : infoOfBooks) {
            System.out.println("\n" + ibooks.getInfoBook());
        }
    }
}

