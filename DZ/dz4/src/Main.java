import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User oneUser = new User("Ян", "Янов", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet treeSet = new TreeSet(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);

        User user1 = new User("Tom", "Tomas", "Tomasss", LocalDate.now());
        User user2 = new User("Van", "Vanas", "Vanasss", LocalDate.now());
        User user3 = new User("Vil", "Vilas", "Vilasss", LocalDate.now());
        TreeSet treeSet1 = new TreeSet(new UserComparator());
        treeSet1.add(user1);
        treeSet1.add(user2);
        treeSet1.add(user3);

        System.out.println(treeSet);
        System.out.println(treeSet1);
    }
}