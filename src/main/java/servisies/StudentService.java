package servisies;

import Repositoryes.StudentRepository;
import entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public void add(Student student){
        studentRepository.save(student);
    }
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void update(Student student){
        studentRepository.save(student);
    }


}
