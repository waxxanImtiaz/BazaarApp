package bazaar.services;

import bazaar.entities.Country;
import bazaar.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public Country getCountryByName(String countryName){
        return countryRepository.getCountryByCountryName(countryName);
    }
}
