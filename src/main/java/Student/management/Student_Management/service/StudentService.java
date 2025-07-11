package Student.management.Student_Management.service;

import Student.management.Student_Management.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Optional<Student> getStudentById(Long id);
    public Student createStudent(Student student);
    public Student updateStudent(Long id, Student student);
    public boolean deleteStudent(Long id);
}
