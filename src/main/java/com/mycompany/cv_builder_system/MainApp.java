package com.mycompany.cv_builder_system;

import java.util.Scanner;
import controller.usercontroller;
import model.usermodel;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        usermodel user = new usermodel(name,email, password);
        usercontroller controller = new usercontroller();
        controller.register(user);
        sc.close();
    }
}