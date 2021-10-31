package gb2.lesson4.lesson4dz;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook(new HashMap<>());

        telephoneBook.addPosition("Иванов", "688237414");
        telephoneBook.addPosition("Иванов", "675689189");
        telephoneBook.addPosition("Павлов", "355837808");
        telephoneBook.addPosition("Сидоров", "214274698");
        telephoneBook.addPosition("Козлов", "214274698");
        telephoneBook.addPosition("Баранов", "496685556");
        telephoneBook.addPosition("Собакин", "724650892");
        telephoneBook.addPosition("Собакин", "445163158");
        telephoneBook.addPosition("Кошкин", "812783578");

        telephoneBook.printInfo();

        telephoneBook.get("Собакин");
        telephoneBook.get("Кошкин");
    }
}
