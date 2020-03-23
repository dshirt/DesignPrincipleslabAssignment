package ie.gmit.single;
//jackson takes in a json and maps it to variables
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity
        UserValidation validate = new UserValidation();
        StoreUsersCheck storeUser = new StoreUsersCheck();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            if(!validate.isValidUser(user)) {
                return "ERROR";
            }else{
               return  storeUser.storeUser(user);
            }
        }
 }

