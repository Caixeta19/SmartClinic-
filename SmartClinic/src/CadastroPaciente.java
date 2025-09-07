import java.util.ArrayList;
import java.util.List;
public class CadastroPaciente {

 private String nome;
 private String cpf;
 private String email;
 private String telefone;
 private boolean resposta;
 private boolean planoDesaude;
 private String endereco;
 private List<String> historicoDeconsultas;

 public CadastroPaciente(String nome,String cpf, String email, String telefone, boolean planoDesaude, String endereco) {
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     this.telefone = telefone;
     this.planoDesaude = planoDesaude;
     this.endereco = endereco;
     this.historicoDeconsultas = new ArrayList<>();
 }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public boolean isPlanoDesaude() {
        return planoDesaude;
    }
    public void setPlanoDesaude(boolean planoDesaude) {
        this.planoDesaude = planoDesaude;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<String> getHistoricoDeconsultas() {
        return historicoDeconsultas;
    }
    public void setHistoricoDeconsultas(List<String> historicoDeconsultas) {
        this.historicoDeconsultas = historicoDeconsultas;
    }

@Override
public String toString() {
    return "Nome: " + nome +
            ", CPF: " + cpf +
            ", Email: " + email +
            ", Telefone: " + telefone +
            ", Plano de Saúde: " + (planoDesaude ? "Sim" : "Não") +
            ", Endereço: " + endereco;
}

}