package Avaliacao.Atv_2;

public class Atividade2 {

    //criacao da classe e atributos
    private String nomeCompleto;
    private float CPF;
    private String email;

    Atividade2 (String nomeCompleto, float CPF, String email){
        // atributo se torna parâmetro
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.email = email;
    }

    Atividade2 () {

    }

    //criacao do Getter and Setter

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public float getCPF() {
        return CPF;
    }

    public void setCPF(float CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //criacao do toString

    @Override
    public String toString() {
        return "Atividade2{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
