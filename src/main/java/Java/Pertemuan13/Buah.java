/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Pertemuan13;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author acer
 */
@Controller
public class Buah {

     @RequestMapping ("/view")
     
    
    public String harga(HttpServletRequest data, Model buah){
    
        
        String Buah = data.getParameter("nama buah");
        String Harga = data.getParameter("harga buah");
        String Jumlah = data.getParameter("jumlah buah");
        String Tunai = data.getParameter("uang dibayar");
        
        
        
        proses VAR = new proses();
        
        
         int totalharga = VAR.total(Harga, Jumlah);
         int totalhargasetelahdiskon = VAR.kembalian(Tunai);
         String statustoko = VAR.status(Tunai);
        
         
        
        buah.addAttribute("Buah", Buah);
        buah.addAttribute("Harga", Harga);
        buah.addAttribute("Jumlah", Jumlah);
        buah.addAttribute("Tunai", Tunai);
        buah.addAttribute("totalharga",totalharga);
        buah.addAttribute("diskon",VAR.Sr());
        buah.addAttribute("Diskon", VAR.disk());
        buah.addAttribute("Kembalian",totalhargasetelahdiskon);
        buah.addAttribute("statustoko", statustoko);
       
        return "viewAndyDaffa";
    }
    
    
}
