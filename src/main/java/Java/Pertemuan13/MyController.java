/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Pertemuan13;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author acer
 */
@Controller
public class MyController {
   Buah tokobuah = new Buah();
   
   @RequestMapping("/view")
   @ResponseBody
    
    public String hargabuah(){
        
        String apel = "";
        String jeruk = "";
        String pepaya = "";
        
        apel = String.valueOf(tokobuah.harga(2, 9000));
        jeruk = String.valueOf(tokobuah.harga(2, 20000));
        pepaya = String.valueOf(tokobuah.harga(2, 30000));
        
        return "viewAndyDaffa";
        
    }
    
}
