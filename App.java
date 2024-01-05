/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
    public static void main(String[] args) {
        Student mine = new Student
                .StudentBuilder("mine", "kmitl")
                .build();
        System.out.println(mine);

        Student s1 = new Student
                .StudentBuilder("John", "CS")
                .buildAge(19)
                .build();
        System.out.println(s1);

        Student s2 = new Student
                .StudentBuilder("Jane", "OS")
                .build();
        System.out.println(s2);
    }
}
