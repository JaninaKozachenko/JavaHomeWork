package com.pb.kozachenko.hw11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.*;

public class PhoneBook {
    static Scanner scanner = new Scanner(System.in);
    //static List<People> peopleList = new ArrayList<People>();
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        // peopleList.add(new People("Алексей", "1987-06-14", "+380674321086", "Днепр, проспект Яворницкого, 55",LocalDateTime.now()));
        //peopleList.add(new People("Виктор", "1987-06-14", "+380674321086", "Днепр, проспект Яворницкого, 55",LocalDateTime.now()));
        //  peopleList.add(new People("Анатолий", "1987-06-14", "+380674321086", "Днепр, проспект Яворницкого, 55", LocalDateTime.now()));
//writeToFile(peopleList);

        System.out.println("Работа с телефонной книгой (по полю name):");
        System.out.println("- введите 1 для добавления контакта");
        System.out.println("- введите 2 для удаления контакта");
        System.out.println("- введите 3 для поиска контакта");
        System.out.println("- введите 4 для редактирования контакта");
        System.out.println("- введите 5 для вывода на экран всех контактов");
        System.out.println("- введите 6 для сортировки по имени всех контактов");

        int numb = scanner.nextInt();

        switch (numb) {
            case 1:
                addContact();
                break;
            case 2:
                delContact();
                break;
            case 3:
                findContact();
                break;
            case 4:
                correctContact();
                break;
            case 5:
                getContacts();
                break;
            case 6:
                sortContacts();
                break;
        }
    }

    public static void writeToFile(List<People> peopleList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("/Users/a1/Desktop/JavaHomeWork/people.json"), peopleList);
    }

    public static String readFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = Files.newBufferedReader(Path.of("/Users/a1/Desktop/JavaHomeWork/people.json"));
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        String peopleJson = sb.toString();
        return peopleJson;
    }

    public static void addContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });

        System.out.println("Для добавления контакта");
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите дату рождения: ");
        String dateOfBirth = scanner.next();
        System.out.println("Введите номер телефона в формате '+380': ");
        String telNumb = scanner.next();
        System.out.println("Введите адрес: ");
        String address = scanner.next();

        People peopNew = new People(name, dateOfBirth, telNumb, address, LocalDateTime.now());
        peopleListNew.add(peopNew);
        writeToFile(peopleListNew);
        System.out.println("Контакт успешно добавлен");
    }

    public static void delContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });
        System.out.println("Для удаления контакта");
        System.out.println("Введите имя: ");
        String nameDelete = scanner.next();
        for (int i = 0; i < peopleListNew.size(); i++) {
            People people = peopleListNew.get(i);
            if (people.getName().equals(nameDelete)) {
                peopleListNew.remove(people);
                System.out.println("Контакт успешно удален");
                writeToFile(peopleListNew);
            } else continue;
        }
    }

    public static void findContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });
        System.out.println("Для поиска контакта");
        System.out.println("Введите имя: ");
        String nameFind = scanner.next();
        readFile();

        for (int i = 0; i < peopleListNew.size(); i++) {
            People people = peopleListNew.get(i);
            if (people.getName().equals(nameFind)) {
                System.out.println(peopleListNew.get(i).toString());
            } else continue;
        }
    }

    public static void correctContact() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });
        System.out.println("Для редактирования контакта");
        System.out.println("Введите имя: ");
        String nameCorrect = scanner.next();
        System.out.println("Введите новый номер телефона:");
        String telNumbCorrect = scanner.next();
        for (People people : peopleListNew) {
            if (people.getName().equals(nameCorrect)) {
                people.setTelNumb(telNumbCorrect);
                writeToFile(peopleListNew);
                System.out.println("Номер телефона изменен успешно");
            } else continue;
        }
    }

    public static void getContacts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List <People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });
        System.out.println("Все Ваши контакты:");
        System.out.println(peopleListNew);
    }

    public static void sortContacts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<People> peopleListNew = mapper.readValue(readFile(), new TypeReference<List<People>>() {
        });
        peopleListNew.sort(Comparator.comparing(p -> p.getName()));
        System.out.println(peopleListNew);
    }
}
