/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Student { /* Product */
    private String name;
    private String university;
    private int age;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    /* getResult() */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + name + "\n")
                .append("University: " + university + "\n");
        if (this.age != 0) {
            stringBuilder.append("Age: " + age + "\n");
        } else {
            stringBuilder.append("Age: no information\n");
        }
        return stringBuilder.toString();
    }

    /* nested class */
    public static class StudentBuilder { /* Concrete Builder */
        private final String name;
        private final String university;
        private int age = 0;

        /* buildPart() */
        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
