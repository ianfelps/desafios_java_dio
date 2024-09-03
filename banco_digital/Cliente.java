// CLiente possui um nome e um cpf

public class Cliente{

    // atributos
    private String nome_do_cliente;
    private String cpf_do_cliente;

    // metodos
    public Cliente(String nome, String cpf){ // construtor
        this.nome_do_cliente = nome;
        this.cpf_do_cliente = cpf;
    }

    public void setNome(String nome){ // setter nome_do_cliente
        this.nome_do_cliente = nome;
    }

    public String getNome(){ // getter nome_do_cliente
        return this.nome_do_cliente;
    }

    public void setCpf(String cpf){ // setter cpf_do_cliente
        this.cpf_do_cliente = cpf;
    }

    public String getCpf(){ // getter cpf_do_cliente
        return this.cpf_do_cliente;
    }

}