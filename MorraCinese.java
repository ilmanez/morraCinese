import java.util.Scanner;

public class MorraCinese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del primo giocatore:");
        String Giocatore1 = scanner.nextLine();
        System.out.println("Inserisci il nome del secondo giocatore:");
        String Giocatore2 = scanner.nextLine();

        System.out.println(Giocatore1 + ", inserisci una parola tra - forbice -, - carta - o - sasso -:");
        String sceltaGiocatore1 = scanner.nextLine();
        System.out.println(Giocatore2 + ", inserisci una parola tra - forbice -, - carta - o - sasso -:");
        String sceltaGiocatore2 = scanner.nextLine();

        String vincitore = "";

        if (sceltaGiocatore1.equals("forbice") && sceltaGiocatore2.equals("sasso") ||
                sceltaGiocatore1.equals("sasso") && sceltaGiocatore2.equals("carta") ||
                sceltaGiocatore1.equals("carta") && sceltaGiocatore2.equals("forbice")) {
            vincitore = Giocatore2;
        } else if (sceltaGiocatore1.equals("sasso") && sceltaGiocatore2.equals("forbice") ||
                sceltaGiocatore1.equals("carta") && sceltaGiocatore2.equals("sasso") ||
                sceltaGiocatore1.equals("forbice") && sceltaGiocatore2.equals("carta")) {
            vincitore = Giocatore1;
        } else if (sceltaGiocatore1.equals(sceltaGiocatore2)) {
            vincitore = "Pareggio";
        } else {
            System.out.println("Errore: scelta non valida.");
        }

        System.out.println("Il vincitore è: " + vincitore);
    }
}