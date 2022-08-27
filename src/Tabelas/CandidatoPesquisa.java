package Tabelas;

public class CandidatoPesquisa{

    private int idcandidatoxpesquisa;
    private String votos;
    private Candidatos[] candidato;
    private Pesquisa pesquisa;

    public CandidatoPesquisa(int idcandidatoxpesquisa, String votos, Candidatos[] candidato, Pesquisa pesquisa) {
        this.idcandidatoxpesquisa = idcandidatoxpesquisa;
        this.votos = votos;
        this.candidato = candidato;
        this.pesquisa = pesquisa;
    }

    public int getIdcandidatoxpesquisa() {
        return idcandidatoxpesquisa;
    }

    public void setIdcandidatoxpesquisa(int idcandidatoxpesquisa) {
        this.idcandidatoxpesquisa = idcandidatoxpesquisa;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public Candidatos[] getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos[] candidato) {
        this.candidato = candidato;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }
}
