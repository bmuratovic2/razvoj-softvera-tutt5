package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleObjectProperty;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<ba.unsa.etf.rs.tut5.Korisnik> korisnik = FXCollections.observableArrayList();
    private SimpleObjectProperty<ba.unsa.etf.rs.tut5.Korisnik> trenutniKorisnik = new SimpleObjectProperty<ba.unsa.etf.rs.tut5.Korisnik>();

    public ObservableList<ba.unsa.etf.rs.tut5.Korisnik> getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ObservableList<ba.unsa.etf.rs.tut5.Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    public ba.unsa.etf.rs.tut5.Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(ba.unsa.etf.rs.tut5.Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set((ba.unsa.etf.rs.tut5.Korisnik) trenutniKorisnik);
    }

    public void dodajKorisnika(){
        korisnik.add(new ba.unsa.etf.rs.tut5.Korisnik());
    }

    void napuni (){
        korisnik.add(new ba.unsa.etf.rs.tut5.Korisnik( "Vedran" , "Ljubovic" , " vljubovic1@etf.unsa.ba" , "vljubovic1", "password"));
        korisnik.add(new ba.unsa.etf.rs.tut5.Korisnik( "Amra" , "Delic" , " adelic@etf.unsa.ba" , "amra", "passw"));
        korisnik.add(new ba.unsa.etf.rs.tut5.Korisnik( "Emina" , "Mlivo" , " emlivo1@etf.unsa.ba" , "minci", "emina(java)"));
        //korisnik.add(new Korisnik());
    }

}