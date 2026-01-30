package kiirasok;

/**
 *
 * @author PácziBalázs(SZF_N_20
 */
public class ciklusokMetodussal {

    public static void main(String[] args) {
        int SorDb = 5;
        int SzamDb = 5;
        String formazo = "%" + SzamDb + "s\n";
        char Betu = 'a';
        int BetuDb = 4;

        String szoveg = " " + Betu;
        int cv = 0;
        while (cv < BetuDb - 1) {
            szoveg += Betu;
            cv++;
        }
        
        
        cv = 0;
        if (BetuDb >= SorDb) {
            int tmp= BetuDb;
            BetuDb=SzamDb;
            

            while (cv < SorDb) {
                System.out.printf(formazo, szoveg);
                cv++;
            }
        } else {
            while (cv < SorDb) {
                System.out.printf(szoveg, formazo);
                cv++;
            }
        }
    }
    
    public static void statisztika() {
        string f="%d sorban, %d oszlopban %d betü db \n"
    }
}


