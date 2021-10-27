import java.awt.event.WindowFocusListener;

public class app {
    public static void main(String[] args) throws Exception  {

        Lista l = new Lista();
        System.out.print("Mostrando lista\n");
        l.insereUltimo (10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        l.insereUltimo(60);
        l.mostrar();

        System.out.print("\nInserindo no final\n");
        l.insereUltimo(40);
        l.insereUltimo (5);
        l.insereUltimo(33);

        l.mostrar();
        System.out.print("\nInserindo no inicio\n");
        l.inserePrimeiro(50);

        l.mostrar();
        System.out.print("\nremovendo no inicio\n");
        l.removePrimeiro();

        l.mostrar();
        System.out.print("\nremovendo no fim\n");
        l.removeUltimo();
        l.mostrar();


    }
}