/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprakpbo;

/**
 *
 * @author lenovo
 */

//Interface
interface MainLaptop{
    public void nugas();
    public void ngeGame();
    public void nonton();
    public void ngoding(); 
}

//Superclass - Abstract
abstract class Laptop{
    String nama;
    public Laptop(String nama){
        this.nama = nama;
    } 
    void tampilkanNama(){
        System.out.println("Nama Laptop: " + nama);
    }
    void turnOn(){
        System.out.println("Hidupkan!!");
    }
    void turnOff(){
        System.out.println("Matikan!!");
    }
    void volumeUp(){
        System.out.println("Volume Up!!");
    }
    void volumeDown(){
        System.out.println("Volume Down!!");
    }
    public void nugas(){
        System.out.println("Nugas dulu..");
    }
    public void ngeGame(){
        System.out.println("NgeGame dulu..");
    }
    public void nonton(){
        System.out.println("Nonton dulu..");
    }
    public void ngoding(){
        System.out.println("Ngoding dulu..");
    }
}

//Polymorphism - Override
class Lenovo extends Laptop implements MainLaptop{
    public Lenovo(String nama){
        super(nama);
    } 
    @Override
    void turnOn(){
        System.out.println("Laptop " + nama + " dinyalakan!");
    }
    @Override
    void turnOff(){
        System.out.println("Laptop " + nama + " dimatikan!");
    }
    @Override
    void volumeDown(){
        System.out.println("Volume " + nama + " diturunkan!");
    }
    @Override
    public void ngoding(){
        System.out.println("Ngoding dulu pake " + nama);
    }
}

class Asus extends Laptop implements MainLaptop{
    public Asus(String nama){
        super(nama);
    }
    @Override
    void turnOn(){
        System.out.println("Laptop " + nama + " dinyalakan!");
    }
    @Override
    void turnOff(){
        System.out.println("Laptop " + nama + " dimatikan!");
    }
    @Override
    void volumeUp(){
        System.out.println("Volume " + nama + " dinaikkan!");
    }
    @Override
    public void ngeGame(){
        System.out.println("Ngegame dulu pake " + nama);
    }
}

class HP extends Laptop implements MainLaptop{
    public HP(String nama){
        super(nama);
    }
    @Override
    void turnOn(){
        System.out.println("Laptop " + nama + " dinyalakan!");
    }
    @Override
    void turnOff(){
        System.out.println("Laptop " + nama + " dimatikan!");
    }    
    @Override
    void volumeUp(){
        System.out.println("Volume " + nama + " dinaikkan!");
    } 
    @Override
    public void nonton(){
        System.out.println("Nonton dulu pake " + nama);
    }
}

class Dell extends Laptop implements MainLaptop{
    public Dell(String nama){
        super(nama);
    }
    @Override
    void turnOn(){
        System.out.println("Laptop " + nama + " dinyalakan!");
    }
    @Override
    void turnOff(){
        System.out.println("Laptop " + nama + " dimatikan!");
    }   
    @Override
    void volumeDown(){
        System.out.println("Volume " + nama + " diturunkan!");
    }
    @Override
    public void nugas(){
        System.out.println("Nugas dulu pake " + nama);
    }
}

public class T1_123230060{
    public static void main(String[] args) {
        Laptop lenovo = new Lenovo("Lenovo Thinkpad");
        Laptop hp = new HP("HP Spectre");
        Laptop asus = new Asus("Asus ROG");
        Laptop dell = new Dell("Dell Inspiron");
        
        //Lenovo
        lenovo.tampilkanNama();
        lenovo.turnOn();
        lenovo.volumeDown();
        lenovo.ngoding();
        lenovo.turnOff();
        System.out.println(" ");
        System.out.println(" ");
        
        //Asus
        asus.tampilkanNama();
        asus.turnOn();
        asus.volumeUp();
        asus.ngeGame();
        asus.turnOff();
        System.out.println(" ");
        System.out.println(" ");
        
        //HP
        hp.tampilkanNama();
        hp.turnOn();
        hp.nonton();
        hp.volumeUp();
        hp.turnOff();
        System.out.println(" ");
        System.out.println(" ");
        
        //Dell
        dell.tampilkanNama();
        dell.turnOn();
        dell.nugas();
        dell.volumeDown();
        dell.turnOff();
    }
}
