import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi giriniz:");
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu giriniz:");
        day = input.nextInt();


        switch (month){
            case 1:
                if(day<22){
                    System.out.println("Burcunuz OGLAK");
                }else{
                    System.out.println("Burcunuz KOVA");
                }
                break;

            case 2:
                if(day<20){
                    System.out.println("Burcunuz KOVA");
                }else {
                    System.out.println("Burcunuz BALIK");
                }
                break;

            case 3:
                if(day<21){
                    System.out.println("Burcunuz BALIK");
                }else{
                    System.out.println("Burcunuz KOC");
                }
                break;

            case 4:
                if(day<21){
                    System.out.println("Burcunuz KOC");
                }else{
                    System.out.println("Burcunuz BOGA");
                }
                break;

            case 5:
                if(day<22){
                    System.out.println("Burcunuz BOGA");
                }else{
                    System.out.println("Burcunuz IKIZLER");
                }
                break;

            case 6:
                if(day<23){
                    System.out.println("Burcunuz IKIZLER");
                }else{
                    System.out.println("Burcunuz YENGEC");
                }
                break;

            case 7:
                if(day<23){
                    System.out.println("Burcunuz YENGEC");
                }else{
                    System.out.println("Burcunuz ASLAN");
                }
                break;

            case 8:
                if(day<23){
                    System.out.println("Burcunuz ASLAN");
                }else{
                    System.out.println("Burcunuz BASAK");
                }
                break;

            case 9:
                if(day<23){
                    System.out.println("Burcunuz BASAK");
                }else{
                    System.out.println("Burcunuz TERAZİ");
                }
                break;

            case 10:
                if(day<23){
                    System.out.println("Burcunuz TERAZİ");
                }else{
                    System.out.println("Burcunuz AKREP");
                }
                break;

            case 11:
                if(day<22){
                    System.out.println("Burcunuz AKREP");
                }else{
                    System.out.println("Burcunuz YAY");
                }
                break;

            case 12:
                if(day<22){
                    System.out.println("Burcunuz YAY");
                }else{
                    System.out.println("Burcunuz OGLAK");
                }
                break;
            default:
                System.out.println("Yanlıs deger girdiginiz icin burcunuz hesaplanamadı");
        }
    }
}
