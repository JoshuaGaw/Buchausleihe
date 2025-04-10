public class Buch {
    private String titel;
    private String author;
    private int bookId;
    private boolean availableStatus;
    private boolean rentingStatus;

    // Buch kann per Fernleihe beschafft werden
    // Es muss zwischen Fern- und Ortsleihe unterschieden werden
    // Wenn Buch neu beschafft wird, wird es im Katalog verzeichnet, als bestellt markiert und für den Kunden reserviert werden
    // Frage: Was sind Bücher die per Fernleihe angefordert werden? Bücher, die die Bib hat und per post verleihen kann / Bücher, die die Bib nicht hat und nachbestellen muss

}
