package controller;

import service.AdminService;


public class Controller {
    public static void main(String[] args) {
        AdminService adminService = AdminService.getInstance();

        adminService.list();

    }

}	
