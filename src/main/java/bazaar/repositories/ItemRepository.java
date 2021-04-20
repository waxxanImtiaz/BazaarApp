package bazaar.repositories;

import bazaar.entities.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    @Query("SELECT i FROM Item i WHERE i.id = :id")
    Item findItemById(@Param("id") Long Id);


    @Query("SELECT  i FROM Item i WHERE i.itemName like %:searchVal% ")
//            "or i.location like %:searchVal% or i.date like %:searchVal%" +
//            " or i.phoneNumber like %:searchVal% or i.price like %:searchVal% or i.price like %:searchVal%")
    List<Item> searchItem(@Param("searchVal") String searchVal);
}
