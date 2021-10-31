package gb2.lesson4.lesson4dz;

import java.util.*;

public class TelephoneBook {
    Map<String, ArrayList<String>> telBook;

    public TelephoneBook(Map<String, ArrayList<String>> telBook) {
        this.telBook = telBook;
    }

    public Map<String, ArrayList<String>> addPosition(String firstName, String number ) {
        if(compareNumber(telBook, firstName, number)){
            if (!compareFirstName(telBook, firstName)){
                telBook.get(firstName).add(number);
            }
            if (compareFirstName(telBook, firstName)){
                ArrayList<String> numbers = new ArrayList<>();
                numbers.add(number);
                telBook.put(firstName, numbers);
            }
        }
        return telBook;
    }

    public void printInfo() {
        for (Map.Entry<String,ArrayList<String>> pair : telBook.entrySet()) {
            System.out.println("Контакт: Фамилия " + pair.getKey() + " Номер телефона: " + pair.getValue());
        }
    }

    public static boolean compareNumber(Map<String, ArrayList<String>> telBook, String firstName, String number){
        boolean check = true;
        for (Map.Entry<String, ArrayList<String>> pair : telBook.entrySet()) {
            for (int i = 0; i < pair.getValue().size(); i++) {
                if (number.equals(pair.getValue().get(i))){
                    System.out.println("Номер, " + number + " добавляемый для фамилии " + firstName + " уже существует для фамилии " + pair.getKey() );
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    private boolean compareFirstName(Map<String, ArrayList<String>> telBook, String firstName) {
        boolean check = true;
        for (Map.Entry<String, ArrayList<String>> pair : telBook.entrySet()) {
            if (firstName.equals(pair.getKey())){
                check = false;
                break;
            }
        }
        return check;
    }

    public void get(String firstName) {
        System.out.println("На фамилию " + firstName + " записаны следующие номера: " + telBook.get(firstName));
    }
}
