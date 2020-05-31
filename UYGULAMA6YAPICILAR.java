
package uygulama6yapıcılar;
class programcı // programcı sınıfı oluştu
{ String adı,soyadı,departman,programalamadilleri;//sınıfın değişkenleri tanımlandı 
    void ekranayaz()// programcının bilgilerini ekrana yazdıran metod   
    {
        System.out.println("Çalışan Bilgileri:");
        System.out.println("Adı:"+adı);
        System.out.println("Soyadı:"+soyadı);
        System.out.println("Çalıştığı Departman:"+departman);
        System.out.println("Bildiği Programlama Dilleri:"+programalamadilleri);
    }
    public  programcı(String isim,String Soyisim,String Depart,String programdili)// programcı sınıfının yapıcısı oluşturuldu
    {
        adı=isim;
        soyadı=Soyisim;
        departman=Depart;
        programalamadilleri=programdili;
        
    }
}

public class UYGULAMA6YAPICILAR {

    
    public static void main(String[] args) 
    {
        programcı developer=new programcı("aysel", "güder", "Bilgi İşlem","Java,PHP");//programcı sınıfından developer adında nesne oluşturuldu ve bilgileri girildi
        developer.ekranayaz();// ekrana yazdırma metodu ile ekrana bilgiler yazıldı
        
    }

}
