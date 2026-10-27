package lsk;

public class Trailer extends TransportationDevice implements Licensable {
    private String matrikula;

    @Override
    public void matrikulatu(String text) {
        this.matrikula = text;
    }
}
