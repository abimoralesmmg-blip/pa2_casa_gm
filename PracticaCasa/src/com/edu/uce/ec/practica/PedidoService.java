package com.edu.uce.ec.practica;

public class PedidoService {

    public void registrar(Pedido pedido){
        System.out.println("Registrar pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
    
        if (pedido.getTotal() > 100) {
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido mayor a 120 dólares");
        } else if (pedido.getTotal() < 50) {
            NotificadorWhatsapp n2 = new NotificadorWhatsapp();
            n2.enviar("09545415", "Se ha creado un pedido menor a 50 dólares");
        } else if (pedido.getTotal() <=100) {
            NotificadorSMS n3 = new NotificadorSMS();
            n3.enviar(pedido.getNumero(), "Se ha creado un pedido entre 50 y 120 dólares");
        }
    }
}