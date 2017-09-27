package comercioeletronico3_percival;

public class Cliente {
    
    public String identificao;
    public String nome;
    public String genero;
    public java.util.Date data_nascimento;
    public String telefone;
    public Endereco endereco;
    
    public boolean anivesariantemes(){
        if (data_nascimento.getMonth() == new java.util.Date().getMonth())
                return true;
        return false;
    } 
    
    public String toString(){
        String texto = "identificao: "  + identificao + "\n";
        texto += "nome:" +  nome + "\n";
        texto += "genero:" +  genero + "\n";
        texto +=  "data_nascimento" + data_nascimento + "\n";
        texto +=  "telefone: " + telefone + "\n";
        texto +=  "Endereco: \n"  + endereco;
        return texto;
    }
}
