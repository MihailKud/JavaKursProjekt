/*
ЗАДАНИЕ
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Main {
    public static void main(String[] args) {
        TelefonBook s1 = new TelefonBook();
        s1.addTel("Semen Nevzorov", 89213224567L);
        s1.addTel( "Semen Nevzorov",89312586598L);
        s1.addTel( "Maikl Borisov", 89883224567L);
        s1.addTel( "Maikl Borisov", 89883228675L);
        s1.addTel( "Semen Nevzorov", 89883224588L);
        s1.addTel( "Djon Bekker", 89878624567L);
        s1.addTel( "Bob Nevzorov", 89883098567L);
        s1.addTel( "Nelli Svan", 89884324567L);
        s1.printBookTel();
    }
}