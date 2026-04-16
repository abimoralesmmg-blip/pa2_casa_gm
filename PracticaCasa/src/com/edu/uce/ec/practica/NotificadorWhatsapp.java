package com.edu.uce.ec.practica;

public class NotificadorWhatsapp {
    public void enviar(String numero, String mensaje){
        System.out.println("Se envio el mensaje al Whatsapp: " + numero);
        System.out.println("con el mensaje: " + mensaje);
    }
}