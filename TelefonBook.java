import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TelefonBook {
    // Объявляем внутреннее поле класса в виде HashMap словаря. Это и будет наша телефонная
    // книга. Реализована на структуре HashMap. В качестве ключа используется имя владельца
    // телефона (тип String). Значение записи представлено списком (тип LinkedList) телефонов
    // (тип Long, в тип Integer номер телефона не помещается).
    // В программе реализовано два метода. Первый - это запись в телефонную книгу информации
    // об абоненте, номер телефона и его имя. Второй обеспечивает вывод на консоль всего объема
    // телефонной книги в заданном в условии формате. То есть, отсортированном по убыванию числа
    // телефонов абонента.
    //
    // Также эту задачу пробовал делать со структурой, в которой в качестве ключа использовал
    // номер телефона. Но количество шагов по обработке данных получается больше, чем в представленном
    // решении. Во всяком случае на данном этапе обучения мне не удалось найти более оптимальный
    // способ решения.
    private Map<String, LinkedList<Long>> bookTel = new HashMap<String, LinkedList<Long>>();

    // метод добавления записи в телефонную книгу
    public void addTel(String name, Long numberTel){
        if (bookTel.containsKey(name)){
            bookTel.get(name).add(numberTel);
        } else {
            bookTel.put(name, new LinkedList<Long>());
            bookTel.get(name).add(numberTel);
        }
    }
    // метод вывода на консоль информации о записях книги в формате, заданном в условии задачи
    public void printBookTel(){
        int max = 1;
        for (var bookTelRecord : bookTel.entrySet()){
            if (bookTelRecord.getValue().size() > max){
                max = bookTelRecord.getValue().size();
            }
        }
        for (int j = max; j > 0; j--){
            for (var bookTelRecord : bookTel.entrySet()){
                if (bookTelRecord.getValue().size() == j){
                    System.out.println(bookTelRecord.getKey() + " - " + bookTelRecord.getValue());
                }
            }
        }
    }
}
