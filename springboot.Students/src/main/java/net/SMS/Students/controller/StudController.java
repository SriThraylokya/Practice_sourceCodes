package net.SMS.Students.controller;

import net.SMS.Students.model.StudentData;
import net.SMS.Students.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Students")
//localhost:8080/students  -->should give all the list of data about the student data.

public class StudController {

    @Autowired
    private StudentRepository srepo ;

    @GetMapping()
    public List<StudentData> getAllStudents(){
        List<StudentData>students = srepo.findAll();
        return students;
    }
    @GetMapping("/{id}")
    public StudentData getStudent(@PathVariable int id ){
         return srepo.findById(id).get();

    }

    //start building REST API
    @PostMapping()
    //@ResponseStatus(code= HttpStatus.CREATED)
    public StudentData createStudentData(@RequestBody StudentData stdata){
        StudentData createData = srepo.save(stdata);
        return createData;
    }
//    @GetMapping("{id}")
//    public ResponseEntity<StudentData> getStudentById(@PathVariable int id){
//        StudentData studata;
//        studata = srepo.findById(id).get();
//        //  srepo.save(studata);
//        return ResponseEntity.ok(studata);
//    }
    @PutMapping("{id}")
    public ResponseEntity<StudentData>updateStudents(@PathVariable int id,@RequestBody StudentData Studetails){
            StudentData updates= srepo.findById(id).get();

            updates.setCourse(Studetails.getCourse());
            updates.setName(Studetails.getName());
            updates.setEmail(Studetails.getEmail());

            srepo.save(updates);
            return ResponseEntity.ok(updates) ;
    }
    @DeleteMapping("{id}")
    public ResponseEntity<StudentData>deleteDetails(@PathVariable int id ){
        StudentData deletes=srepo.findById(id).get();
        srepo.delete(deletes);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
//    @PutMapping("/{id}")
//    public StudentData updateStudents(@PathVariable int id){
//        StudentData studata = srepo.findById(id).get();
//        studata.setName("shreekar");
//        studata.setCourse("blockChain");
//        srepo.save(studata);
//        return studata;
//    }
//    @DeleteMapping("/{id}")
//    public void removeStudent(@PathVariable int id){
//        StudentData stud=  srepo.findById(id).get();
//        srepo.delete(stud);
//    }


}
