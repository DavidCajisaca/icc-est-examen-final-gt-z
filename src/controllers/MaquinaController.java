package controllers;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import models.Maquina;

public class MaquinaController {
public  Stack<Maquina> filtrarPorSubred (List<Maquina> maquina,int umbral){
    umbral=100;
    Stack<Maquina> maquinasFiltradas = new Stack<>();
    for (Maquina m : maquina) {
        if (m.getSubred() >= umbral) {
            maquinasFiltradas.push(m);
            imprimir(maquina);
        }
    }
    return maquinasFiltradas;
}
public static Set<Maquina> ordenarPorSubRed (Stack<Maquina>pila){
    Stack<Maquina> subred=new Stack<>();
    TreeSet<Maquina> loa=  new TreeSet<>();
    return null;

    
}
public void imprimir(List<Maquina>maquina){
    for(Maquina e: maquina){
        System.out.println(e);
    }
    
}
}
