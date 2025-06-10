
package hitung;
public class Matematika {
  // Membuat Variable 
    private double bil1, bil2;
    
    // Membuat constructor 
    public Matematika(double bil1,bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
        
    // Membuat method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
 // Membuat methon setPengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    // Membuat method setPerkalian
    public double setPerkalian (){
        return bil1 * bil2;
    }
    
    // Membuat methon setPembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
}
