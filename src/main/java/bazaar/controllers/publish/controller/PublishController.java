package bazaar.controllers.publish.controller;

import bazaar.api.BaseExecutor;
import bazaar.api.BaseResponse;
import bazaar.services.CategoriesService;
import bazaar.services.CategoryItemService;
import bazaar.services.ItemService;
import bazaar.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PublishController {

    @Autowired
    private StateService stateService;

    @RequestMapping("/static/publish/{countryName}")
    public BaseResponse getStatesByCountry(@PathVariable String countryName) {
        return BaseExecutor.getBaseResponse(stateService.getStates(countryName));
    }

}
