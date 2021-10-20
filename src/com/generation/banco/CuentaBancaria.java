package com.generation.banco;

public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo<0){
            this.saldo=0;
        }else {
            this.saldo = saldo;
        }
    }

    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }

}

