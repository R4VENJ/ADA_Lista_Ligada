package Main;

import java.util.Random;
import dataStructure.Queue;

public class filaDeAtendimento {
    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente: " + cliente);
//        Simula chegada dos clientes
        for(int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o ciente: " + cliente);
            queue.enqueue(cliente);
        }
//        Atendimento dos clientes
        var node = queue.dequeue();
        while (node!=null){
            System.out.println("Atendio o cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }
}
