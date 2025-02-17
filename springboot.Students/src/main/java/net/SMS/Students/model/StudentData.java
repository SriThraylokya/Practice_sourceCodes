package net.SMS.Students.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Students")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID",nullable = false)
    private int id;

    @Column(name = "Name",nullable = false)
    private String name;

//    @Column(name = "Age")
//    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    @Column(name = "Course")
    private String course;

    @Column(name = "Email",nullable = false)
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
