//Рефакторинг:
// Использовали общую коллекцию TreeSet<User> вместо необработанного TreeSet,
// чтобы указать, что она хранит объекты типа User.
// Указание явного типа при создании экземпляров TreeSet.
// Прокомментировал применение принципа открытости/закрытости (OCP), r
// код открыт для расширения (возможность добавления новых типов User),
// но закрыт для модификации (не требуется вносить изменения в основной код при добавлении новых типов User).
//Комментарий:
//Рефакторинг соответствует принципу открытости/закрытости (OCP),
// поскольку позволяет расширить код без изменения существующего кода.
// Благодаря использованию общей коллекции и указанию типа,
// код становится более безопасным для типов и гарантирует,
// что в TreeSet могут храниться только объекты User.


import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        User oneUser = new User("Ян", "Янов", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet<User> treeSet = new TreeSet<>(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);

        User user1 = new User("Tom", "Tomas", "Tomasss", LocalDate.now());
        User user2 = new User("Van", "Vanas", "Vanasss", LocalDate.now());
        User user3 = new User("Vil", "Vilas", "Vilasss", LocalDate.now());
        TreeSet<User> treeSet1 = new TreeSet<>(new UserComparator());
        treeSet1.add(user1);
        treeSet1.add(user2);
        treeSet1.add(user3);

        System.out.println(treeSet);
        System.out.println(treeSet1);
    }
}