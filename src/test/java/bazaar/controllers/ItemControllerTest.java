package bazaar.controllers;

import bazaar.api.BaseResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ItemControllerTest {
    @Autowired
    private ItemController itemController;
    @Test
    void getItemsByCategory() {
    }

    @Test
    void hello() {
    }

    @Test
    void search() {
    }

    @Test
    void getItem() {
    }

    @Test
    void getCategoryList() {
        BaseResponse baseResponse = itemController.getCategoryList();
        System.out.println(baseResponse);
    }

    @Test
    void getCategoryById() {
    }

    @Test
    void uploadItem() {
    }

    @Test
    void updateItem() {
    }

    @Test
    void saveStudent() {
    }
}