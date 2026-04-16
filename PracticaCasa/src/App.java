import com.edu.uce.ec.practica.Pedido;
import com.edu.uce.ec.practica.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // caso 1
        System.out.println("------caso 1 >100");
        Pedido p1 = new Pedido("Gene", "cola", 120.2, "gene@example.com", "09999");
        PedidoService service = new PedidoService();
         service.registrar(p1);
        //caso 2
        System.out.println("------caso 1 <=100");
        Pedido p2 = new Pedido("Gene", "cola", 100, "gene@example.com", "09999");
        PedidoService service2 = new PedidoService();
         service.registrar(p2);
        //caso 3
        System.out.println("------caso 1 <50");
        Pedido p3 = new Pedido("Gene", "cola", 2.2, "gene@example.com", "09999");
        PedidoService service3 = new PedidoService();
        service.registrar(p3);
    }
}