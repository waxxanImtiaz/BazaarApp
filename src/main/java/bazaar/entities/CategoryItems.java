package bazaar.entities;

import javax.persistence.*;

@Entity(name="category_items")
public class CategoryItems {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String name;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Categories categories;
//    @Column(name="categories_id")
//    private String categoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(String categoryId) {
//        this.categoryId = categoryId;
//    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
