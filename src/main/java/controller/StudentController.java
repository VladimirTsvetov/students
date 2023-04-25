package controller;

import dto.StudentDto;
import entity.Student;
import lombok.RequiredArgsConstructor;
import mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;
import servisies.StudentService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;
    private final StudentMapper studentMapper;

    @GetMapping
    public List<StudentDto> findAllStudents(){
        List<StudentDto> studentDtosList = new ArrayList<>();
        List<Student> studentList = studentService.findAll();
        for(Student student: studentList){
            studentDtosList.add(studentMapper.StudentToDto(student));
        }
        return studentDtosList;
    }

    @GetMapping("/{id}")
    public StudentDto findById(Long id){
        Student student = studentService.findById(id).orElseThrow();
        return studentMapper.StudentToDto(student);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }

    @PutMapping("/change")
    public void updateStudent(@RequestBody StudentDto studentDto){
        Student student = studentMapper.DtoToStudent(studentDto);
        studentService.update(student);
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDto studentDto){
        Student student = studentMapper.DtoToStudent(studentDto);
        studentService.add(student);
    }

}

