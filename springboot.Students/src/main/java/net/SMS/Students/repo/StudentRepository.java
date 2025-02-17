package net.SMS.Students.repo;

import net.SMS.Students.model.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<StudentData, Integer> {

    //CRUD database methods will be done here and added !!

}
