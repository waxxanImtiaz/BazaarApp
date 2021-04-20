package bazaar.services;

import bazaar.entities.Categories;
import bazaar.entities.CategoryItems;
import bazaar.repositories.CategoriesRepo;
import bazaar.repositories.CategoryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryItemService {

    @Autowired
    private CategoryItemRepo categoryItemRepo;
    @SuppressWarnings("unchecked")
    public List<CategoryItems> getCategoryItemById(Long id){
        return categoryItemRepo.getCategoryItemsByCategories_Id(id);// categoryItemRepo.getAllItems();
    }
}
