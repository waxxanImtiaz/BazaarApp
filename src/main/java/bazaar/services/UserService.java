package bazaar.services;

import bazaar.api.BaseExecutor;
import bazaar.api.BaseResponse;
import bazaar.entities.User;
import bazaar.repositories.UserRepository;
import bazaar.resources.UserResource;
import bazaar.utils.ResponseRelatedFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;

    @Value("${user.aleardy.exits}")
    private String userAlreadyExits;

    @Value("${user.signup.success}")
    private String successSignuedUp;
    public BaseResponse createUser(User user){
        BaseResponse baseResponse;
        if (userRepository.userExists(user.getEmail()) == null) {
            userRepository.save(user);
            baseResponse = BaseExecutor.getBaseResponse(user);

            baseResponse.setMessage(successSignuedUp);
        }else {
            baseResponse = BaseExecutor.getBaseResponse(null);
            baseResponse.setMessage(userAlreadyExits);
        }
        return baseResponse;

    }
    public BaseResponse getUserByEmailAndPassword(String email, String password){
        UserResource res = new UserResource();
        res.setUser(userRepository.findByEmailAndPassword(email,password));
      return BaseExecutor.getBaseResponse(res);
    }
}
