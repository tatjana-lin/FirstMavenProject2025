import org.apache.commons.lang3.StringUtils;

public class Main {
//Задача
//Необходимо написать тесты для любого метода из подключенной библиотеки
// (можно использовать StringUtils)
// или можно написать свой метод и протестировать его.
// Тесты должны запускаться через TestNG.

    public static boolean isStringEmpty(String str) {
        return StringUtils.isEmpty(str);  // Проверяет, пуста ли строка или равна null
    }

    public static int countMatches(String str, char c){
        return StringUtils.countMatches(str, c);
    }

    public static String reverse(String str){
        return StringUtils.reverse(str);
    }

}
