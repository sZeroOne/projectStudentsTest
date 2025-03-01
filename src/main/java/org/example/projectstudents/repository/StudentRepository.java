package org.example.projectstudents.repository;


import org.example.projectstudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}
