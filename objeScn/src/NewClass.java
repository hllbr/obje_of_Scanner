
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        


    

        /*scannar objesi kullanıcıdan input alma olarak tanımlanır
        buna obje dememizin sebebi scanner sınıfından türüyor olmasıdır.
        bu javada hazır bulunan bir kütüphanedir.
        bu işlem için bir import işlemi gerçekleştirmek gerekmektedir.
        Python'da bu işlem için 
        input(int("Bir sayı giriniz : ") ...
        yazmak yeterliyke java da bu işlem için bir kaç adım ek olarak bulunmaktadır.
        Android programlamada ise yine javada bulunan sistem geçerlidir.
        Android programlamada bir çok için kullanıcıdan izin alma(procedur) bulunurken bu input basit bir sayı yada isim girme gibi bir işlemse izin isteme gereksiz görülmektedir.
        Android ile kullanıcıdan input olarak konum,resim,video,vb... gibi veriler almak için manifesto olarak bilinen prosedürleri yerine getirmeniz ve bunu hem Google hemde kullanıcıya bildirmeniz gerekmektedir.
                Scnnar class'ın dan scn isimli bir obje oluşturduk ve bu sınıfı scn olarak bundan sonraki satırlarımızda kullanmak istediğimizi derleyiciye bildirdik.
        crtl+shift+ı ile eğer kütüphaneniz otomatik olarak eklenmediyse ekleyebilirsiniz.(komut ayarlarını değiştirmediyseniz...)
             scannar class'tan bir scanner objesi oluştrarak işlemimize başlamamız gerekiyor.

        */
        
        Scanner scn = new Scanner(System.in);
             //scanner ile yazı alma
        
        System.out.println("Lütfen isminizi giriniz...");
        
        String isim = scn.nextLine();
        
        System.out.println(" belirtmiş olduğunuz isminiz = " +isim);
           //eğer sayı ister ve yazı(String) bir ifade ile karşılaşırsak bize bir exception fırlatılır...!!!
        //bunu 2 yöntem ile çözebiliriz. bir koşul ile birde exception ile burada koşullu durum ile çözüm yapılacak ilerleyen projelerde diğer yöntemde gösterilecektir.
                System.out.println("Lütfen bir sayı giriniz.");
        if(scn.hasNextInt()){

        int sayı1 = scn.nextInt();
        System.out.println(" sayımız = "+sayı1);
        }

    
        System.out.println("Lütfen yaşınızı giriniz = ");
        int yas = scn.nextInt();
        System.out.println("Yaşınız = " +yas);
       //bunu koymamızın bir sebebi var daha geniş projelerde ifade edilecektir.
        
        
        
   
        
        
     
        
        
        

    }
    
}

    
    
    

