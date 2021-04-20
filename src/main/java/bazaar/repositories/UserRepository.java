package bazaar.repositories;

import bazaar.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends CrudRepository<User, String> {
    @Query("select u from User u where u.email = :email and u.password = :password")
    User findByEmailAndPassword(@Param("email") String email,@Param("password") String password);

    @Query("select u from User u where u.email =:email")
    User userExists(@Param("email") String email);
}
