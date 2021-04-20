package bazaar.controllers;

import bazaar.entities.Categories;
import bazaar.entities.CategoryItems;
import bazaar.entities.Item;
import bazaar.api.BaseExecutor;
import bazaar.api.BaseResponse;
import bazaar.custom.exceptions.DataNotFoundException;
import bazaar.services.CategoriesService;
import bazaar.services.CategoryItemService;
import bazaar.services.ItemService;
import bazaar.utils.ResponseRelatedFields;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ItemController {


    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoriesService categoriesService;


    @Autowired
    private CategoryItemService categoryItemService;


    @RequestMapping(produces = "application/json", value = "/list/{category}")
    public BaseResponse getItemsByCategory(@PathVariable String category) {
        return BaseExecutor.getBaseResponse(itemService.getItemsByCategory(category));
    }

    @RequestMapping("/test")
    public String hello() {
        return "Hello i am server";
    }

    /*================SEARCHING MEHTOD======================*/
    @SuppressWarnings("unchecked")
    @RequestMapping(method = RequestMethod.GET, value = "/search/{formData}")
    public BaseResponse search(@PathVariable String formData) {

        try {
            List data = itemService.getItem(formData);

            if (data.size()>0)
                return BaseExecutor.getBaseResponse(data);
            else
                throw  new DataNotFoundException("Search Not Found");

        } catch (Exception e) {
            return BaseExecutor.getBaseResponse(null);
        }
    }


    @RequestMapping("/item/{id}")
    public BaseResponse getItem(@PathVariable Long id) {

        return BaseExecutor.getBaseResponse( itemService.getItemById(id));
    }



    @RequestMapping("/categoryList")
    public BaseResponse getCategoryList() {

        return BaseExecutor.getBaseResponse(categoriesService.getAllCategories());
    }


    @RequestMapping("/categoryList/{id}")
    public BaseResponse getCategoryById(@PathVariable Long id) {
        return BaseExecutor.getBaseResponse(categoryItemService.getCategoryItemById(id));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/item")
    public String uploadItem(@RequestBody Item item) {
        if (itemService.uploadItem(item) != null) {
            return "Item uploaded successfully!";
        }
        return "Item not uploaded";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/item")
    public BaseResponse updateItem(@RequestBody Item item) {
        BaseResponse baseResponse;
        Item i = itemService.updateItem(item);
        baseResponse = BaseExecutor.getBaseResponse(i);
        if (i != null) {
            baseResponse.setMessage(ResponseRelatedFields.ITEM_UPDATED);
        }else baseResponse.setMessage(ResponseRelatedFields.ITEM_NOT_UPDATED);

        return baseResponse;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/item/{id}")
    public String saveStudent(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "Item deleted successfully!";
    }


}
