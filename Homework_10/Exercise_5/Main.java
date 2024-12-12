package Homework_10.Exercise_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printMainMenu();
    }

    private static void printMainMenu(){
        System.out.print("""
                1. Добавить новый контакт
                2. Просмотреть все контакты
                3. Обновить контактную информацию
                4. Поиск контакта
                0. Закрыть приложение
                """);
        switch (scanner.next()){
            case "1" -> addNewContact();
            case "2" -> printAllContacts();
            case "3" -> updateContactInformation();
            case "4" -> searchContact();
            case "0" -> System.out.println("Приложение закрыто");
            default -> {
                System.out.println("Неверный ввод повтори еще раз");
                printMainMenu();
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Введите имя контакта:");
        String name = scanner.next();

        if (!Contact.getContacts().isEmpty()){
            if (Contact.getContacts().containsKey(name)){
                System.out.println("Контакт с таким именем уже существует");
                printMainMenu();
                return;
            }
        }

        System.out.println("Введите контактный номер:");
        String number = scanner.next();

        new Contact(name,number);

        System.out.println("Ваш контакт был добавлен");

        printMainMenu();
    }

    private static void printAllContacts(){
        if (Contact.getContacts().isEmpty()){
            System.out.println("У вас нет контактов");
            printMainMenu();
            return;
        }
        System.out.println("У Вас " + Contact.getContacts().size() + " контакты:");
        for (Contact contact:Contact.getContacts().values()){
            System.out.println(" -  " + contact);
        }
        printMainMenu();
    }

    private static void searchContact(){
        System.out.println("Для поиска введите имя контакта:");
        String name = scanner.next();

        ArrayList<String> nameList = new ArrayList<>(Contact.getContacts().keySet());

        int index = 0;

        Iterator<String> iterator = nameList.iterator();
        String result;

        while (iterator.hasNext()){
            result = iterator.next();
            if (result.startsWith(name)){
                index++;
                System.out.println(Contact.getContacts().get(result));
                iterator.remove();
            }
        }

        for (String line:nameList){
            if (line.toLowerCase().startsWith(name.toLowerCase())){
                index++;
                System.out.println(Contact.getContacts().get(line));
            }
        }

        if (index==0){
            System.out.println("Нет контакта с таким именем");
        }

        printMainMenu();
    }

    private static void updateContactInformation(){
        System.out.println("Чтобы обновить контактную информацию, введите имя контакта:");
        String name = scanner.next();
        if (!Contact.getContacts().containsKey(name)){
            System.out.println("Нет контакта с таким именем");
            printMainMenu();
            return;
        }

        Contact contactUpdate = Contact.getContacts().get(name);
        System.out.println(contactUpdate);
        System.out.println("Введите новое имя для этого контакта:");
        String newName = scanner.next();

        if (!name.equals(newName)){
            if (Contact.getContacts().containsKey(newName)){
                System.out.println("Контакт с таким именем уже существует");
                printMainMenu();
                return;
            }
        }

        System.out.println("Введите новый номер для этого контакта:");
        String newNumber = scanner.next();
        contactUpdate.setName(newName);
        contactUpdate.setNumber(newNumber);
        System.out.println("Ваш контакт обновлен");
        printMainMenu();
    }
}
