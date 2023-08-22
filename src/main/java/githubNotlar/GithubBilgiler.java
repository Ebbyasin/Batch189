package githubNotlar;

import java.util.Arrays;

public class GithubBilgiler {

    //"git" version lar icin

// git init ==>ile terminalden kaydediyoruz. (repostories -kaydedecegimiz yer-
// --oluşturuyoruz
// --kod yazdigimiz yer WS (working space)
// git status ==>statüyü kontrol ettiriyor (guncellenmis kod var ise bize
// --soyluyor, SA'ya gonderilecek kodlari)
// git add . ==>ile "tüm eksikleri" (yaptiklarimizi) Staging Area'ya yukluyoruz.
// --Geçici alan (SA) Staging Area. Version lamadan once gonderilen Area
// --Class'taki yesil renk gecici alanda, versiyonlama beklinildigi anlamina geliyor

// git commit -m" başlık gelecek buraya " ==>version ekliyoruz (gecici alandan
// --versiyonlamis oluyoruz, commitliyoruz)
// --Commit Area

// git log ==> versiyon lari ayrintili gosterir (commit de hash kodu yani
// --kimlik bilgisi var, yazar ve tarih de var)
// Q ==>ile log kismindan cikiliyor (Quit)
// git log --oneline ==>tek satirda versionlari gosterir (burada da sayilar var.
// --bu sayilar version un kimlik numaralarinin ilk 7 hanesi)
// cls ==> ile alan temizleniyor kodlar yani
// git commit --amend -m"" ==> isim değiştirme (hangi versiyondaysan)
// --klavyedeki ok tuşlarıyla eski yazdıklarına ulaşabilirsin
// git log --oneline ==> ile versiyonları tek satırlar halinde gösteriyor.
// git show kmilikNumarasininIlkYediKarakteri ==> orn: git show dd39838
// --Q ile cikiliyor

// git restore --staged . ==> ile SA'daki kodu tekrar WS'ye gonderiyoruz
// git reset --hard ==>WS'deki son kodlari yok eder. Commit'lenmisleri silmiyor

// git checkout kimlikNO_7Hane . ==> kimlik nosunu yazdigimiz versiona gidiliyor
// --oteki version u silmiyor

//--v4 te sorun var. v3 alip v5 olarak kayit edecegiz
//git checkout db135b2 . ==>v3 kimlik nosu ile v3 e donduk
//git commit -m"v5" ==>v3 u v5 olarak atadik, farkli kaydet gibi

//git remote add origin https://github.com/emreceltik/GithubLectureRepo.git ==>lokal deki ile online baglaniyor
//git remote -v ==> origin linklerimizi gorebiliyoruz.

//git push --set-upstream origin master ==> kodlarimizi online a itiyoruz, Github'a.
//--(ilk seferde bu sekilde uzun yaziyoruz)

//git push ==> sonraki guncellemeleri sadece git push kodunu yazarak yapiyoruz

//kodlari online'dan cekmek icin
//git init ==> terminale kayit
//git pull
//--ya da
//git pull gitHubLinki master (ya da versiyona gore "main") ==>kodlarimizi online dan geri getiriyoruz...
//--bu kodu girince cakisan dosyalar "kirmizi renk" ile gozukuyor ve bunlari sildikten sonra kodlarimiz geliyor

//--yeni projede kodlarimizi acmak
//--file ==> new ==> project from version control ==> buraya URL'yi(github linki) yapistirinca
//--yeni projede kodlarimizi acmis oluyoruz
    // bakalim bu degisikligi kaydedecek mi??kaydetmedi

    public static void main(String[] args) {
        int numbers[][]= {{15, 4},{12,43,21}};
        int small=numbers[0][0];
        int max=numbers[0][0];

        for (int [] w:numbers) {
            for (int k:w) {
                max=Math.max(max,k);
                small=Math.min(small,k);


            }
        }
        System.out.println(max);
        System.out.println(small);


    }

}
