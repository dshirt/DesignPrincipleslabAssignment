/*John Lawless
23/03/2020
g00351835@gmit.ie

Design Principals Lab
Refactor the UserController class so that is it is following the Single
Responsibility Principal.
The only responsibility this class now has is to store a valid user
 */

package ie.gmit.single;

public class StoreUsersCheck {

    //Store used by controller
    private Store store = new Store();

    public String storeUser(User user){
        store.store(user);
        return "SUCCESS";
    }
}
