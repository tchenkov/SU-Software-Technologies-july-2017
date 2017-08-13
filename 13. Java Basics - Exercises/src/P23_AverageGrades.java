import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P23_AverageGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scan.nextLine());
        Set<Student> students = new HashSet<>();

        for (int i = 0; i < studentsCount; i++) {
            String studentDataStr = scan.nextLine();
            Student newStudent = new Student(studentDataStr);
            students.add(newStudent);
        }

        List<Student> excellentStudents = students.stream()
                .filter(s -> s.getAverageGrade() >= 5)
                .sorted((s1 ,s2) -> {
                    int compared = s1.getName().compareTo(s2.getName());
                    if (compared == 0){
                        compared = s2.getAverageGrade().compareTo(s1.getAverageGrade());
                    }
                    return compared;
                })
                .collect(Collectors.toList());

        excellentStudents.forEach(s -> System.out.println(
                String.format("%s -> %.2f", s.getName(), s.getAverageGrade())
        ));
    }

    static class Student{
        private String name;
        private List<Double> grades;

        public Student(String studentDataString) {
            String[] studentData = studentDataString.split(" ");

            this.name = studentData[0];
            this.grades = Arrays.asList(
                    Arrays.stream(studentData)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new)
            );
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Double> getGrades() {
            return grades;
        }

        public void setGrades(List<Double> grades) {
            this.grades = grades;
        }

        public Double getAverageGrade(){
            return this.grades
                    .stream()
                    .mapToDouble(g -> g)
                    .average()
                    .getAsDouble();
        }
    }
}
