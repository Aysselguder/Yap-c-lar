
package uygulama7yapıcılar;

class araba //araba sınıfı oluştu   
{
    public araba() //araba sınıfının yapıcısı   
    {
        System.out.println("araba sınıfı yapıcısı"); //ekrana araba sınıfının yapıcısını yazdırdık
        
    }
}
class sporaraba extends araba //araba sınıfından sporaraba sınıfı oluştu
{
    public sporaraba() //sporaraba sınıfının yapıcısı
    {
        System.out.println("sporaraba sınıfının yapıcısı"); //ekrana sporaraba sınıfının yapıcısını yazdırdık
    }
}
class kamyonet extends araba //araba sınıfından kamyonet sınıfı oluştu 
{
    public kamyonet() // kamyonet sınıfının yapıcısı
    {
        System.out.println("Kamyonet sınıfının yapıcısı"); //ekrana kamyonet sınıfının yapıcısını yazdırdık
    }
}
public class UYGULAMA7YAPICILAR {

    
    
    public static void main(String[] args) 
    {
        sporaraba mercedes= new sporaraba(); //sporaraba sınıfından nesne oluşturduk 
        kamyonet toyota=new kamyonet(); //kamyonet sınfından nesne oluşturduk
        
        
    }

}
