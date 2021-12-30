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
        
        Double harga = Double.valueOf(Harga);
        Double jumlah = Double.valueOf(Jumlah);
        Double Total = harga + jumlah;
        Double diskon = 0.0;
        Double totalbelanja = null;
        if(Total < 16000){
            
           diskon = Total * 0/10;
           totalbelanja = Total - diskon;
        }
        else if(Total > 16000){
            diskon = Total * 10/100;
            totalbelanja = Total - diskon;
        }
        else if(Total < 25000){
            diskon = Total * 10/100;
            totalbelanja = Total - diskon;
        }
        else if(Total > 25000){
            diskon = Total * 15/100;
            totalbelanja = Total - diskon;
            
        }
        
        proses prosesdata = new proses();
        
        
        buah.addAttribute("Buah", prosesdata.Datanama(Buah));
        buah.addAttribute("Harga",prosesdata.Dataharga(Harga));
        buah.addAttribute("Jumlah",prosesdata.Datajumlah(Jumlah));
        buah.addAttribute("Total",Total);
        buah.addAttribute("Diskon", diskon);
        buah.addAttribute("Total Belanja", totalbelanja);
        
        return "viewAndyDaffa";
    }
    
    
}
