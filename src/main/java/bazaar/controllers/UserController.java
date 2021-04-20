package bazaar.controllers;

import bazaar.api.BaseResponse;
import bazaar.entities.User;
import bazaar.repositories.UserRepository;
import bazaar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( "/user/{email}/{password}")
    public BaseResponse getUserByEmailAndPassword(@PathVariable String email,@PathVariable String password){
                return userService.getUserByEmailAndPassword(email,password);
    }

    @RequestMapping(produces = "application/json",method = RequestMethod.POST, value = "/signup")
    public BaseResponse signup(@RequestBody User user){
        return userService.createUser(user);
    }


}


