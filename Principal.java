/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor objAut4 = new Autor("Lucas", 1995, "lucas@teste");
        Autor objAut5 = new Autor("Renato", 1995, "lucas@teste");
        
        
        Livro objLiv1 = new Livro("Titulo","Editora",2580);
        Livro objLiv2 = new Livro("Titulo","Editora",2580);
        
        objLiv1.setEscritores(objAut4);
        objLiv1.setEscritores(objAut5);
        
        objAut4.setObra(objLiv2);
        objAut4.setObra(objLiv1);
 
       objLiv1.getEscritores();
       objAut4.getObra();
       
        
   

       
       

    }
}