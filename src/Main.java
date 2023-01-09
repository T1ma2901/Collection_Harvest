import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> harvest = new HashSet<String>();

        harvest.add("Watermelon");
        harvest.add("Banana");
        harvest.add("Cherry");
        harvest.add("Pear");
        harvest.add("Melon");
        harvest.add("Blackberry");
        harvest.add("Ginseng");
        harvest.add("Strawberry");
        harvest.add("Iris");
        harvest.add("Potato");

        for (String setGet : harvest) {
            System.out.println(setGet);
        }

        Set<String> harvest1 = new LinkedHashSet<String>();//соблюдение порядка добавления!

        harvest1.add("Watermelon");
        harvest1.add("Banana");
        harvest1.add("Cherry");
        harvest1.add("Pear");
        harvest1.add("Melon");
        harvest1.add("Blackberry");
        harvest1.add("Ginseng");
        harvest1.add("Strawberry");
        harvest1.add("Iris");
        harvest1.add("Potato");

        for (String setGet : harvest1) {
            System.out.println(setGet);
        }


    }

}
// Время сборки урожая наступило. Создадим коллекцию Set с типом элементов String.
// А добавим в неё вот какие десять строк: арбуз, банан, вишня, груша, дыня, ежевика,
// женьшень, земляника, ирис, картофель. После этого выведем содержимое коллекции на экран,
// параллельно наблюдая за порядком добавленных.