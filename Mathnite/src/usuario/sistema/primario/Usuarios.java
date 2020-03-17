package usuario.sistema.primario;

public class Usuarios {

    private int idUsuario;
    private String nome;
    private int password;
    private int type;


    public Usuarios(int idUsuario, String nome, int password, int type) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.password = password;
        this.type = type;
    }

    public int getId() {
        return idUsuario;
    }

    public void setId(int id) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", password=" + password +
                ", type='" + type + '\'' +
                '}';
    }
}