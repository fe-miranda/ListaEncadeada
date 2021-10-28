import java.awt.event.WindowFocusListener;

public class App {
    public static void main(String[] args) throws Exception  {

        Lista l = new Lista();
        System.out.print("Teste para verificar se a lista está vazia:\n");
        l.listaVazia();

        System.out.print("Mostrando lista:\n");
        l.insereUltimo (10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        l.insereUltimo(60);
        l.insereUltimo(40);
        l.insereUltimo (5);
        l.mostrar();

        System.out.print("\nInserindo no final:\n");
        l.insereUltimo(33);
        l.mostrar();

        System.out.print("\nInserindo no inicio:\n");
        l.inserePrimeiro(50);
        l.mostrar();

        System.out.print("\nRemovendo no inicio da lista:\n");
        l.removePrimeiro();
        l.mostrar();

        System.out.print("\nRemovendo elemento no fim da lista:\n");
        l.removeUltimo();
        l.mostrar();


        System.out.print("\nRemovendo um determinado nó\n");
        l.removeNo( 20);
        l.mostrar();

        System.out.print("\nInserindo elemento depois do no determinado:\n");
        l.insereDepois(30,90);
        l.mostrar();

    }
}