package sample.view;

import sample.dto.I_List;
import sample.dto.I_Menu;
import sample.controllers.Menu;
import sample.controllers.ProductList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
public class ProductManagement {

    public static void main(String args[]) {
        I_Menu menu = new Menu();
        menu.addItem("1. Add new product");
        menu.addItem("2. Display");
        menu.addItem("3. Quit");
        int choice;
        boolean cont = true;
        
        I_List list = new ProductList();
        do {
            menu.showMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    boolean check= list.add();
                    if(check){
                        System.out.println("Add thanh cong roi !");
                    }else{
                        System.out.println("Sai roi !");
                    }
                    break;
                case 2:
                    list.diplay();
                    break;
                
                case 3:
                    cont = menu.confirmYesNo("Do you want to quit?(Y/N)");
                    break;
            }
        } while (choice >= 0 && choice <= 3 && cont);
    }
}
