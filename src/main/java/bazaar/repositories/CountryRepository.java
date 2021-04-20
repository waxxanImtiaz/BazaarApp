package bazaar.repositories;

import bazaar.entities.Country;
import bazaar.entities.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
    Country getCountryByCountryName(String countryName);
}
