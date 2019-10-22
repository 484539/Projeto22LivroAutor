/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Autor {
    
    
    private String nome;
    private int anoNasc;
    private String email;
    ArrayList<Livro> Obra = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nome, int anoNasc, String email) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getObra() {
        for (int i = 0;i < Obra.size();i++){
            System.out.println("Nome Livro: "+this.Obra.get(i).getTitulo());
        }
    }

    public void setObra(Livro teste2) {
        Obra.add(teste2);
    }

    
    
}


