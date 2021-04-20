package bazaar.repositories;

import bazaar.entities.State;
import bazaar.entities.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StateRepository extends CrudRepository<State, Long> {

    List<State> getStateByCountry(Country country);
}
