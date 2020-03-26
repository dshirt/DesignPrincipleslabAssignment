/*John Lawless
23/03/2020
g00351835@gmit.ie

Design Principals Lab
Refactor the UserController class so that is it is following the Single
Responsibility Principal.
The only responsibility this class now has is to create a valid user
 */


package ie.gmit.single;
//jackson takes in a json and maps it to variables
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import java.util.regex.Pattern;

public class UserController {


        UserValidation validateUser = new UserValidation();
        StoreUsersCheck storeUserCheck = new StoreUsersCheck();

        //Handles incoming JSON requests that work on User resource/entity
        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            if(!validateUser.isValidUser(user)) {
                return "ERROR";
            }else{
               return  storeUserCheck.storeUser(user);
            }
        }
 }

