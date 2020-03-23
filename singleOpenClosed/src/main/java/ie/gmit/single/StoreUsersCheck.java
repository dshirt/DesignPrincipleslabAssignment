package ie.gmit.single;

public class StoreUsersCheck {

    //Store used by controller
    private Store store = new Store();

    public String storeUser(User user){
        store.store(user);
        return "SUCCESS";
    }
}
