package bazaar.services;

import bazaar.entities.Item;
import bazaar.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;


    public List<Item> getItemsByCategory(String category){

        List<Item> byCategory = new ArrayList<>();
        for (Item item : itemRepository.findAll()){
            if (item.getCategory().equals(category))
                byCategory.add(item);
        }

        return byCategory;
    }
    public Item getItemById(Long id) {
        return itemRepository.findItemById(id);
    }



    public Item uploadItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    public List getItem(String searchValue){
        return itemRepository.searchItem(searchValue);
    }

}
