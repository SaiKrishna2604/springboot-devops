package springbootdevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootdevops.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
