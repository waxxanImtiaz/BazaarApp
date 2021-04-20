package bazaar.services;

import bazaar.beans.LOV;
import bazaar.entities.Country;
import bazaar.entities.State;
import bazaar.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StateService {

    @Autowired
    private  StateRepository stateRepository;
    @Autowired
    private  CountryService countryService;


    public List<LOV> getStates(String countryName){
        Country country = countryService.getCountryByName(countryName);
            List<State> stateList = stateRepository.getStateByCountry(country);
            List<LOV> lovList = new ArrayList<>();

            stateList.forEach((e) -> {
                LOV lov = new LOV();
                lov.setValue(String.valueOf(e.getId()));
                lov.setLabel(e.getStateName());
                lovList.add(lov);
            });
            return lovList;
    }

}
