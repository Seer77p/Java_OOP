package controller;
import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name,String lastName, long moneyAmount){
        System.out.println("Enter your data");
        userService.saveUser(name,lastName,moneyAmount);


    }
    public void deleteUser(int index){
        if (index!=-1){
            userService.deleteUser(index);
            System.out.println("Delete has been performed");
        }else{
            System.out.println("User is null!");
        }

    }
    public void getAllUsers(){
        System.out.println(userService.getAllUsers());
    }
}
