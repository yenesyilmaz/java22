public class Main {
    public static void main(String[] args) {

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;
        String okYonu = "";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        }   else if(dolarBugun>dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);


        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbank'dan çekenler","Bilmem ne kredisi"};
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }



    }
}
