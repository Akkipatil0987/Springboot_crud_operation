package repository;



//import com.example.springbootcrud.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import categories.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
