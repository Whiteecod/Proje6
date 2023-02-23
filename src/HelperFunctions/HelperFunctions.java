package HelperFunctions;

import Database.Address;

public class HelperFunctions {


    public static String checkCity(String city) {

        if (Address.getCityList().contains(city))
            return city;
        else throw new RuntimeException("We can not continue your process because, there is no shipping that location.");
    }
    public static String generateShippingTrackingNumber (String fullname, String city, String zipcode){
        String isimKodu;
        isimKodu = String.valueOf(fullname.charAt(0));
        for (int i = 0; i < fullname.length(); i++) {
            if (fullname.charAt(i) == ' ') {
                isimKodu = isimKodu.concat(String.valueOf(fullname.charAt(i + 1)));
            }
        }

        String city3HArf = city.substring(0,3);


        return (city3HArf + zipcode + isimKodu).toUpperCase();
    }

    public static String checkZipCode (String zipCode){
        if (zipCode.length() != 5) {
            throw new RuntimeException("Please enter valid Zip Code");
        } else return zipCode;


    }
}


    /*

        Proje kapsamında gerekli genel methodlari burada tanımlayacağız, buradaki methodlari birer doğrulayıcı yada
    oluşturucu olarak düşünebiliriz. Örneğin bir city nin varlığını doğrulama veya bir rastgele bir numara oluşturuma.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "checkCity" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir city almalı

        Eğer ki city:
            Address classinin icerisindeki static arrayliste bulunan bir city e eşit değilse
            bir RuntimeException firlatsin ve şu mesaji geçsin:
                "We can not continue your process because, there is no shipping that location."
        Eğer ki city:
            Arraylistin içerisinde var ise o zaman city i dondursun.

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "generateShippingTrackingNumber" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir fullname, bir city, bir zipcode almalı

        Bu methodun amacı bir kargo takip numarasi üretmektir.

        kargo takip numarası şu şekilde oluşacak ve daha sonrada return olacaktır.

            city nin ilk 3 harfi + zipcode + fullname in baş harfleri

        son olarak ise dönen değer tamamen büyük harde dönmelidir.

        örneğin bir takip kodu: IZM35430CK (Izmir + 35430 + Cem Karaca)

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "checkZipCode" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir zipCode almalı

        Eğer ki zipCode:
            5 rakamdan oluşmuyorsa RuntimeException firlatmalı ve mesaj olarak ise "Please enter valid Zip Code"
            geçmeli
        diğer durumda ise zipCode unu döndürmeli
     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------



