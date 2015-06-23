/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Julio
 */
public class JogadorComparator implements Comparator<Jogador>{
    private final boolean comparacaoNumero, comparacaoNome, comparacaoGeral;
    
    public JogadorComparator()
    {
      this(true,true,true);
    }
    
    public JogadorComparator(boolean comparacaoGeral, boolean comparacaoNumero, boolean comparacaoNome)
    {
        this.comparacaoGeral = comparacaoGeral;
        this.comparacaoNome = comparacaoNome;
        this.comparacaoNumero = comparacaoNumero;
    }
    
    @Override
    public int compare(Jogador jogador1, Jogador jogador2)
    {
        //Verificando se é para ordenar em função do nome ou numero
        if(comparacaoGeral)
        {
            
            //Verificando se os numeros são iguais
            if(comparaNumero(jogador1.numero, jogador2.numero) == 0)
            {
                //comparando pelo nome
                return comparaNome(jogador1.nome, jogador2.nome);
            }
            return comparaNumero(jogador1.numero, jogador2.numero);
        }
        else
        {
            
      
            if(comparaNome(jogador1.nome, jogador2.nome) == 0)
            {
             
                return comparaNumero(jogador1.numero, jogador2.numero);
            }
            return comparaNome(jogador1.nome, jogador2.nome);
        }
    }
    public int comparaNome(String n1, String n2)
    {
      
        if(n1.length() < n2.length())
        {
          
            for(int i = 0; i <= n1.length(); i++)
            {
                if(n1.charAt(i) < n2.charAt(i))
                {
                   
                    if(comparacaoNome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i))
                {
                 
                    if(comparacaoNome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        else
        {
  
            for(int i = 0; i < n2.length(); i++)
            {
                if(n1.charAt(i) < n2.charAt(i))
                {
                
                    if(comparacaoNome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i))
                {
                  
                    if(comparacaoNome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        
        return 0;
    }
    
    public int comparaNumero(int n1, int n2)
    {

        if(comparacaoNumero)
            return n1 - n2;
        else
            return (n1 - n2)*-1;
    }
    
    
    
}
