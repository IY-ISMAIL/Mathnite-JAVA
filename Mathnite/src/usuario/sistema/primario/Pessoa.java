package usuario.sistema.primario;

import java.util.Date;

public class Pessoa {
    private int idPessoa;
    private int idUsuario;
    private String nome;
    private double RG;
    private Date dataNascimento;

    public Pessoa(int idPessoa, int idUsuario, String nome, double RG, Date dataNascimento) {
        this.idPessoa = idPessoa;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRG() {
        return RG;
    }

    public void setRG(double RG) {
        this.RG = RG;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
