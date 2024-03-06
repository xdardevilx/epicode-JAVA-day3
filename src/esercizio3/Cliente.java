package esercizio3;

public class Cliente {

    private String nome;
    private String cognome;
    private String telefono;
    private String email;
    private String dataIscrizione;

    public Cliente(String nome, String cognome, String telefono, String email, String dataIscrizione) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            ", dataIscrizione='" + getDataIscrizione() + "'" +
            "}";
    }

}
