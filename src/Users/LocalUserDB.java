package Users;

import java.util.LinkedList;
import java.util.List;

public class LocalUserDB {

    private List<User> userDB = new LinkedList<User>();
    private Integer nextId = 0;

    public LocalUserDB(){}

    public List<User> getUserDB() {
        return userDB;
    }

    public Integer addUser(String name){
        userDB.add(new User(name, nextId));
        return nextId++;
    }

    public User getUserById(Integer id){
        User userWithId = null;
        for(User u : userDB){
            if(u.getId().equals(id)){
                userWithId = u;
            }
        }
        return userWithId;
    }


    public void removeUserById(Integer id){
        User userWithId = null;
        for(User u : userDB) {
            if (u.getId().equals(id)) {
                userWithId = u;
            }
        }
        if(userWithId == null){
            System.out.println("User with id " + id + " does not exist");
        } else {
            userDB.remove(userWithId);
            System.out.println("User sucessfully removed");
        }
    }


    public void print(){
        userDB.forEach(u -> System.out.println(u.getId() + "- " + u.getName()));
    }

}
