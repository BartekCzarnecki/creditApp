package pl.inteca.creditApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.inteca.creditApp.model.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
