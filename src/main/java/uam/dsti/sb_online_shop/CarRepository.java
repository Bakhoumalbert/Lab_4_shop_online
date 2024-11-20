package uam.dsti.sb_online_shop;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    @Query("SELECT c FROM Car c JOIN FETCH c.owners")
    List<Car> findAllWithOwners();
 }
