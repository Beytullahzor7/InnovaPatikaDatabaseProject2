package com.innova.main;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

import java.util.ArrayList;
import java.util.List;

public class AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController = new AdminController();

        /*//create
        AdminDto adminDto = new AdminDto();
        adminDto.setAdminName("Merve");
        adminDto.setAdminSurname("Kara");
        adminController.create(adminDto);*/

        /*//delete
        AdminDto adminDto=new AdminDto();
        adminDto.setAdminID(2);
        adminController.delete(adminDto);*/

        //güncelleme
       /* AdminDto adminDto=new AdminDto();
        adminDto.setAdminID(3);
        adminDto.setAdminName("Meryem");
        adminDto.setAdminSurname("Yılmaz");
        adminController.update(adminDto); */

        //list
        AdminDto adminDto = new AdminDto();
        List<AdminDto> list = new ArrayList<>();
        for(AdminDto dto : adminController.list()){
            list.add(dto);
        }
        System.out.println(list);
    }
}
