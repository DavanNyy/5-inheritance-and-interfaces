package periytymisesimerki;

public class TiliOhjelma {
    public static void main(String[] args) {
        //Luodaan yksi tili
        Tili tili = new Tili();

        tili.setNimi("Ruokatili");
        tili.setSaldo(300);
        tili.setTilinumero("FI1315");

        LainaTili lainatili = new LainaTili();
        
        lainaTili.setsaldo(399000);
        System.out.println("Lainaa tuolla tilillä on: " + lainatili.getSaldo());

        if(lainaTili instanceof LainaTili) {
            System.out.println("Tili on tyypiltään lainatili");
        }

    }

}
