package com.example.SpringSwaggerREST.Controller;

import com.example.SpringSwaggerREST.Model.User;
import com.example.SpringSwaggerREST.ServiceImplementation.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping(value = "/api")
@Api(value = "User Info Details")
public class UserController
{
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // to save your information
    @PostMapping(value = "saveUser")
    public User saveUser(@RequestBody User user){
        userService.saveUser(user);
        return user;

    }
    // to update the information
    @PutMapping(value = "updateUser")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return user;

    }
    //to get all data values
    @GetMapping(value="getAllDetails")
    public List<User> getAllDetails(){
        System.out.println("test getAllDetails");
        return userService.findAllUsers();
    }
    // to delete particular value
    @DeleteMapping(value="deleteUser")
    public String deleteUser(@RequestParam int id){
        System.out.println("delete method");
        userService.deleteUser(id);
        return "successfully deleted";
    }



 /*   @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        return "custom";
    }


  @RequestMapping(value = "/v1",method = RequestMethod.GET)
    public String name(@RequestParam(value = "Name",defaultValue = "World")String red  ){
        return String.format("happy %s",red);
    }

   ConcurrentMap<String,User> userr=new ConcurrentHashMap<>();

    //to add a user
    @PostMapping(value = "/")
    public User addUser(@RequestBody User user)
    {
        userr.put(String.valueOf(user.getId()),user);
        return user;
    }

    //to get all users
    @GetMapping(value="/")
    public List<User> getDetails()
    {
        return new ArrayList<User>(userr.values());
    }

    //to get a user by id
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable int id){
        return userr.get(id);
    }
    //to delete a user
    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestParam int id){
        return "Delete Success";
    }*/

}
