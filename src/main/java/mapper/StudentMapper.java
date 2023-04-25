package mapper;

import dto.StudentDto;
import entity.Student;

public class StudentMapper {
    public StudentDto StudentToDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setMark(student.getMark());
        studentDto.setFirstname(student.getFirstname());
        studentDto.setLastname(student.getLastname());
        return studentDto;
    }

   public Student DtoToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstname(studentDto.getFirstname());
        student.setLastname(studentDto.getLastname());
        student.setMark(studentDto.getMark());
        return student;
   }
}
