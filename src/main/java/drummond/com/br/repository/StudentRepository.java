package drummond.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import drummond.com.br.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
