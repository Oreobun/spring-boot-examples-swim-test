import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

  public static void main(String[] args) {
    // Create a list of students
    List<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 80, 85));
    students.add(new Student("Bob", 90, 75));
    students.add(new Student("Charlie", 85, 90));
    students.add(new Student("David", 70, 95));

    // Find student with highest math score
    Student highestMathStudent = getStudentWithHighestMathScore(students);
    System.out.println("Student with highest math score: " + highestMathStudent.getName());

    // Find student with highest English score
    Student highestEnglishStudent = getStudentWithHighestEnglishScore(students);
    System.out.println("Student with highest English score: " + highestEnglishStudent.getName());

    // Find student with highest overall score
    Student highestOverallStudent = getStudentWithHighestOverallScore(students);
    System.out.println("Student with highest overall score: " + highestOverallStudent.getName());
  }

  public static Student getStudentWithHighestMathScore(List<Student> students) {
    return students.stream()
            .max(Comparator.comparingInt(Student::getMathScore))
            .orElse(null);
  }

  public static Student getStudentWithHighestEnglishScore(List<Student> students) {
    return students.stream()
            .max(Comparator.comparingInt(Student::getEnglishScore))
            .orElse(null);
  }

  public static Student getStudentWithHighestOverallScore(List<Student> students) {
    return students.stream()
            .max(Comparator.comparingInt(Student::getTotalScore))
            .orElse(null);
  }
}
