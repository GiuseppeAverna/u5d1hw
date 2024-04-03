import java.time.LocalDateTime;
import java.util.List;
import com.epicode.U5D1.entities.Tavolo;

public class Ordine {
    private int numeroOrdine;
    private String stato;
    private int numeroCoperti;
    private LocalDateTime orarioAcquisizione;
    private double importoTotale;
    private Tavolo tavolo;
    private List<ElementoMenu> elementiMenu;

    // Costruttore
    public Ordine(int numeroOrdine, String stato, int numeroCoperti, LocalDateTime orarioAcquisizione, Tavolo tavolo, List<ElementoMenu> elementiMenu) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.orarioAcquisizione = orarioAcquisizione;
        this.tavolo = tavolo;
        this.elementiMenu = elementiMenu;
        this.importoTotale = calcolaImportoTotale();
    }

    // Metodi setter per gli attributi
    public void setStato(String stato) {
        this.stato = stato;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public void setOrarioAcquisizione(LocalDateTime orarioAcquisizione) {
        this.orarioAcquisizione = orarioAcquisizione;
    }

    // Metodo per calcolare l'importo totale dell'ordine
    private double calcolaImportoTotale() {
        double importoElementi = 0;
        for (ElementoMenu elemento : elementiMenu) {
            importoElementi += elemento.getPrezzo();
        }
        double importoCoperti = tavolo.getPrezzoCoperto() * numeroCoperti;
        return importoElementi + importoCoperti;
    }

}
