import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args){
        int mat,fzk,kmy,trk,trh,mzk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat= inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fzk= inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kmy= inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        trk=inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        trh= inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        mzk= inp.nextInt();

        int ort=(mat+fzk+trk+trh+mzk)/5;

        String sonuc=(ort>=60) ? "Geçti" : "Kaldı";

        System.out.print("Ortalamanız : "+ort +" Sonucunuz : "+ sonuc);

    }
}
