/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Pertemuan13;

/**
 *
 * @author acer
 */
public class proses {
    
    
    
    int total;
    int Totalb;
    int Kembali;
  
    public int total(String Hargabuah, String Jumlahbuah){
        
        int Total;
     
        int harga = Integer.parseInt(Hargabuah);
        int jumlah = Integer.parseInt(Jumlahbuah);
        
        Total =  harga * jumlah;
        total = Total;
        return Total;
      
        
       
        
        
    }
    
   
    
    public String Sr(){
        String Diskon = "";
        
        
        if(total < 16000){
            
            Diskon = "0%";
            return Diskon;
  
          
           
           
        }
        else if(total > 16000 && total < 25000 ){
            
            Diskon = "10%";
            return Diskon;
           
           
           
        }
        
        else if(total > 25000){
            
            Diskon = "15%";
            return Diskon;
           
        }
        return null;
        
    }
    
    
    
    public int disk(){
        
        int totalbelanja;
         
        
        if(total < 16000){
            
           
  
           totalbelanja = total-(total * 0/100);
           Totalb= totalbelanja;
           return totalbelanja;
           
           
        }
        else if(total > 16000 && total < 25000){
            
            
            
           totalbelanja = total-(total * 10/100);
           Totalb = totalbelanja;
           return totalbelanja;
        
        
           
        }
        else if(total > 25000){
            
            
            
           totalbelanja = total-(total*15/100);
           Totalb = totalbelanja;
           return totalbelanja;
           
          
        }
        return 0;
    }
    
    public int kembalian(String uangdibayar){
        
        int Kembalian;
         
        int tunai = Integer.parseInt(uangdibayar);
       
            
            
           Kembalian = tunai-Totalb;
           Kembali = Kembalian;
           return Kembalian;
        
           
          
        
        
    }
    
    public String status( String uangdibayar){
        
        int tunai = Integer.parseInt(uangdibayar);
        String Statusbelanja = "";
        
        if(tunai == total  ){
            
            Statusbelanja = "sukses";
            return Statusbelanja;
  
        }
        else if(tunai < total){
            
            Statusbelanja = "Gagal karena Uang kurang";
            return Statusbelanja;
  
         }
        
        else if(tunai > total){
            
            Statusbelanja = "Sukses";
            return Statusbelanja;
  
         }
       
        return null;
        
    }
    
    

    

    
 

    
    
   
    
}
