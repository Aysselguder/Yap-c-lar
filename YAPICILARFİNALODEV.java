
package yapıcılarfinalodev;

class canlı // canlı sınıfını oluşturduk
{
    public canlı()// canlı sınıfının yapıcısı
    {
        System.out.println("canlı sınıfı yapıcısı "); // yapıcıyı belirten mesajı ekrana yazdı
    }
}
class insan extends canlı // insan sınıfını oluşturduk
{
    public insan() //insan sınıfının yapıcısı
    {
        System.out.println("İnsan sınıfı yapıcısı ");// yapıcıyı belirten mesajı ekrana yazdı
    }
}
class hayvan extends canlı //hayvan sınıfını oluşturduk 
{
    public hayvan ()//hayvan sınıfının yapıcısı
    {
        System.out.println(" hayvan sınıfının yapıcısı");// yapıcıyı belirten mesajı ekrana yazdı
    }
}
public class YAPICILARFİNALODEV {

    
    
    public static void main(String[] args) 
    {
        insan ahmet=new insan();
       
    }

}
