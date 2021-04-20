package bazaar;

import bazaar.entities.Categories;
import bazaar.entities.CategoryItems;
import bazaar.entities.Item;
import bazaar.repositories.CategoriesRepo;
import bazaar.repositories.CategoryItemRepo;
import bazaar.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
// Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute

public class Driver {
    public static void main(String[] args) {
        SpringApplication.run(Driver.class,args);
    }

//    @Bean
//    public CommandLineRunner demo(ItemRepository repository) {
//        return (args) -> {
//
//            List<Item> itemList = new ArrayList<>();
//            Item item1 = new Item();
//            item1.setId(1L);
//            item1.setCategory("Phone");
//            item1.setDate((new Date()).toString());
//            item1.setItemName("OPPO A37");
//            item1.setLocation("PECHS Block 6");
//            item1.setPhoneNumber("+92 3001232123");
//            item1.setPrice("Rs.14,000");
//            item1.setImages("images/products/1.jpg");
//            item1.setPublisherId("Imtiaz Ali");
//            itemList.add(item1);
//
//
//            Item item2 = new Item();
//            item2.setId(2L);
//            item2.setCategory("Phone");
//            item2.setDate((new Date()).toString());
//            item2.setItemName("Samsung S8");
//            item2.setLocation("DHA Phase 2");
//            item2.setPhoneNumber("+92 3001232123");
//
//            item2.setImages("images/products/2.jpg");
//            item2.setPrice("Rs.65,000");
//            item2.setPublisherId("Joy");
//            itemList.add(item2);
//
//
//            Item item3 = new Item();
//            item3.setId(3L);
//            item3.setCategory("Phone");
//            item3.setDate((new Date()).toString());
//            item3.setItemName("Samsung Note 8");
//            item3.setLocation("Mallir Cantt");
//            item3.setPhoneNumber("+92 3001232123");
//            item3.setPrice("Rs.105,000");
//            item3.setImages("images/products/1.jpg");
//            item3.setPublisherId("Adam");
//            itemList.add(item3);
//
//
//            Item item4 = new Item();
//            item4.setId(4L);
//            item4.setCategory("Phone");
//            item4.setDate((new Date()).toString());
//            item4.setItemName("Samsung 8");
//            item4.setLocation("Mallir Cantt");
//            item4.setPhoneNumber("+92 3001232123");
//            item4.setPrice("Rs.105,000");
//            item4.setImages("images/products/4.jpg");
//            item4.setPublisherId("David");
//            itemList.add(item4);
//
//
//
//
//            Item item5 = new Item();
//            item5.setId(4L);
//            item5.setCategory("Phone");
//            item5.setDate((new Date()).toString());
//            item5.setItemName("Samsung 8");
//            item5.setLocation("Mallir Cantt");
//            item5.setPhoneNumber("+92 3001232123");
//            item5.setPrice("Rs.105,000");
//            item5.setImages("images/products/4.jpg");
//            item5.setPublisherId("Zeeshan");
//            itemList.add(item5);
//
//            Item item6 = new Item();
//            item6.setId(4L);
//            item6.setCategory("Phone");
//            item6.setDate((new Date()).toString());
//            item6.setItemName("Samsung 8");
//            item6.setLocation("Pakistan");
//            item6.setPhoneNumber("+92 3001232123");
//            item6.setPrice("Rs.105,000");
//            item6.setImages("images/products/4.jpg");
//            item6.setPublisherId("Zeeshan");
//            itemList.add(item6);
//
//
//
//            repository.saveAll(itemList);
//
//        };
//    }
//
//    @Bean
//    public CommandLineRunner saveCategories(CategoriesRepo repository) {
//
//        return (args) -> {
//
//            List<Categories> categoriesList = new ArrayList<>();
//
//            Categories categories1 = new Categories();
//            categories1.setName("Mobiles");
//            categories1.setId(1L);
//
//
//
//            Categories categories2 = new Categories();
//            categories2.setName("Cars");
//            categories2.setId(2L);
//
//
//
//            categoriesList.add(categories1);
//            categoriesList.add(categories2);
//
//
//
//            repository.saveAll(categoriesList);
//
//        };
//    }
//    @Bean
//    public CommandLineRunner saveCategoryItems(CategoryItemRepo repository) {
//        return (args) -> {
//
//
//            CategoryItems item1 = new CategoryItems();
//            item1.setId(1L);
//            item1.setName("Mobiles");
//            Categories one = (new Categories());
//            one.setId(1L);
//            one.setName("Mobiles");
//            item1.setCategories(one);
//
//
//
//            CategoryItems item2 = new CategoryItems();
//            item2.setId(2L);
//            item2.setName("Tablets");
//            Categories two = (new Categories());
//            two.setId(1L);
//            two.setName("Mobiles");
//            item2.setCategories(two);
//
//            List<CategoryItems> list = new ArrayList<>();
//
//            list.add(item1);
//            list.add(item2);
//
//            repository.saveAll(list);
//
//        };
//    }
    }
