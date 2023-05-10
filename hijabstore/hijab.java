
package hijabstore;


public class hijab {
    String brand_1, brand_2, brand_3;
    int total_1, total_2, total_3;
    int jumlah;
    
    void Brand (String brand_1, String brand_2, String brand_3) {
        this.brand_1 = brand_1;
        this.brand_2 = brand_2;
        this.brand_3 = brand_3;
    }
    
    void total (int total_1, int total_2, int total_3){
        this.total_1 = total_1;
        this.total_2 = total_2;
        this.total_3 = total_3;
    }

    void cetak(){
        System.out.println("Brand Hijab 1 \t\t  :" +brand_1);
        System.out.println("Brand Hijab 2 \t\t  :" +brand_2);
        System.out.println("Brand Hijab 3 \t\t  :" +brand_3);
        System.out.println("Total Hijab " +brand_1+" \t  : " +total_1);
        System.out.println("Total Hijab " +brand_2+ " : " +total_2);
        System.out.println("Total Hijab " +brand_3+ " \t  : " +total_3);
    }     
        
     int jumlah (int total_1, int total_2, int total_3){
         jumlah = total_1+total_2+total_3;
         System.out.println("Total Hijab Adalah :"+jumlah);
        return jumlah;
    }
    
}
