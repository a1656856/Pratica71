/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Julio
 */
public class Time {
 
    private HashMap<String, Jogador> jogadores = new HashMap<>();
    
 
    public HashMap getJogadores()
    {
        return jogadores;
    }
    
    public void addJogador(String posicao, Jogador jogador)
    {
        jogadores.put(posicao, jogador);
    }
    public List<Jogador> ordena(JogadorComparator comparacao)
    {
  
        List<Jogador> sortido = new ArrayList<>(jogadores.values());
  
        Collections.sort(sortido, comparacao);
        return sortido;
    }
}
