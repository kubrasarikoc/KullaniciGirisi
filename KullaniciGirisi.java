import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, select, newp;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Hatalı Giriş Yaptınız, Tekrar Deneyiniz !");
            System.out.println("Şifrenizi Sıfırlamak İster misiniz ?\nEvet\nHayır");
        }
        select = input.nextLine();
        switch (select) {
            case "Evet":
                System.out.println("Lütfen Yeni Şifrenizi Giriniz :");
                newp = input.nextLine();
                if (newp.equals("java123")) {
                    System.out.println("Şifre Oluşturalamadı !\nLütfen Eski Şifrenizden Farklı Bir Şifre Giriniz");
                } else {
                    System.out.println("Yeni Şifre Oluşturuldu !");
                }
                break;
            case "Hayır":
                System.out.println("Lütfen Tekrar Giriş Yapmayı Deneyiniz ");
                break;
            default:
                System.out.println("Hatalı Tuşlama Yaptınız. Lütfen Seçiminizi Evet veya Hayır Şeklinde Belirtiniz");
                break;



        }


    }
}
