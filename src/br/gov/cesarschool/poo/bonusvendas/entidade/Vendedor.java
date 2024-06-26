package br.gov.cesarschool.poo.bonusvendas.entidade;
import java.io.Serializable;



import java.time.LocalDate;
import java.time.Period;

import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo;

public class Vendedor implements Serializable{

    private String cpf;
    private String nomeCompleto;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private double renda;
    private Endereco endereco;

   
    public Vendedor(String cpf, String nomeCompleto, Sexo sexo, LocalDate dataNascimento, double renda, Endereco endereco){
        super();
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.renda = renda;
        this.endereco = endereco;
    }

   
    public String getCpf() {
        return cpf;
    }

    public String getnomeCompleto() {
        return nomeCompleto;
    }
   
    public Sexo getSexo() {
        return sexo;
    }

    public java.time.LocalDate getdataNascimento(){
        return dataNascimento;
    }

    public double getrenda(){
        return renda;
    }

    public Endereco getendereco(){
        return endereco;
    }

    //propriedades de set publico para todos, exceto cpf
    public void setnomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setsexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setdataNascimento(java.time.LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setrenda(double renda) {
        this.renda = renda;
    }

    public void setendereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento,dataAtual).getYears();
     
    }

}