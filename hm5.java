import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Seminar {
  public static void main(String[] args) {
    HashMap<String, String> book = new HashMap<>();
    put(book, "Sasha", "+79737892387");
    put(book, "Anna", "+75939878922");
    put(book, "Ivan", "+79458992255");
    put(book, "Lida", "+79745377321");
    print(book);

  }

  public static void put(HashMap<String, String> book, String contact, String phone) {
    book.merge(contact, phone, (ph1, ph2) -> ph1 + ", " + ph2);
  }

  public static void print(HashMap<String, String> book) {
    ArrayList<Map.Entry<String, String>> list = new ArrayList<>(book.entrySet());
    list.sort((o1, o2) -> o2.getValue().length() - o1.getValue().length());
    for (Map.Entry<String, String> entry : list) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}