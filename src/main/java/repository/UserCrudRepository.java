package repository;

import model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);/*se usa para metodos de busqueda*/
    Optional<User> findByEmailAndPassword(String email,String password);/*clave opcional para hacer un control si se puede encontrar o no */
    //Optional<User> findByName(String name);

}
