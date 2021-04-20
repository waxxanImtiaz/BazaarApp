package bazaar.services;

import bazaar.beans.LOV;
import bazaar.entities.Categories;
import bazaar.repositories.CategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesService {
    @Autowired
    private CategoriesRepo categoriesRepo;
    public  List<LOV> getAllCategories(){
        final Iterable<Categories> iterable = categoriesRepo.findAll();
        List<LOV> lovList = new ArrayList<>();
        iterable.forEach((e)-> {
            LOV lov = new LOV();
            lov.setLabel(e.getName());
            lov.setValue(String.valueOf(e.getId()));
            lovList.add(lov);
        });
        return lovList;
    }


}
