package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maquina {
private String nombre;
private String ip;
private List<Integer> codigos;
private int subred;
private int riesgo;

public Maquina(String nombre, String ip, List<Integer> codigos) {
    this.nombre = nombre;
    this.ip = ip;
    this.codigos = codigos;
}
private static int caracteresUnicos(String ip) {
    Set<Character> caracteresUnicos = new HashSet<>();
    for (char c : ip.toCharArray()) {
        caracteresUnicos.add(c);
    }
    return caracteresUnicos.size();
}
private static int  divisibles3(List<Integer>codigos){
    int num=19;
    return num;
}

private int calcularSubred(){

    return caracteresUnicos(ip);
}
private int calcularRiesgo(){
    riesgo= divisibles3(codigos)* caracteresUnicos(ip);
    return riesgo;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getIp() {
    return ip;
}
public void setIp(String ip) {
    this.ip = ip;
}
public List<Integer> getCodigos() {
    return codigos;
}
public void setCodigos(List<Integer> codigos) {
    this.codigos = codigos;
}
public int getSubred() {
    return subred;
}
public void setSubred(int subred) {
    this.subred = subred;
}
public int getRiesgo() {
    return riesgo;
}
public void setRiesgo(int riesgo) {
    this.riesgo = riesgo;
}
@Override
public String toString() {
    return "Maquina [nombre=" + nombre + ", ip=" + ip + ", codigos=" + codigos + ", subred=" + calcularSubred() + ", riesgo="
            + calcularRiesgo() + "]";
}

}
