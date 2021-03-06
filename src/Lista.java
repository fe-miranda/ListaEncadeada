public class Lista {
    private No primeiro;
    private No ultimo;
    private No no;
    public int tamanho = 0;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void listaVazia(){
        if(vazia() == true){
            System.out.print("Lista vazia!!!\n\n\n");
        }
    }

    public void inserePrimeiro(int info) {

        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(primeiro);
        primeiro = auxiliar;
        tamanho ++;
    }


    public void insereDepois(int no1, int info){
        System.out.print("Inserindo depois do no " + no1 + " o elemento " + info + ".\n");
        No anterior = null;
        No atual = primeiro;

        while (atual != null && atual.getProx() != null) {
            anterior = atual;
            atual = atual.getProx();
            if (anterior.getInfo() == no1) {
                No novo = new No();
                novo.setInfo(info);
                anterior.setProx(novo);
                novo.setProx(atual);
                tamanho ++;
            }
        }
    }

    public void insereUltimo(int info) {

        if (vazia() == true) {
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;
            while (auxiliar != null && auxiliar.getProx() != null) {
                auxiliar = auxiliar.getProx();
            }
            if (auxiliar.getProx() == null) {
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
                tamanho ++;
            }
        }
    }

    public void removePrimeiro() {
        System.out.print("Removendo primeiro elemento da lista: \n");
        primeiro = primeiro.getProx();
        tamanho --;
    }

    public void removeUltimo() {

        if (primeiro == null) {
            removePrimeiro();
        }
        No anterior = null;
        No ultimo = primeiro;
        while (ultimo != null && ultimo.getProx() != null) {
            anterior = ultimo;
            ultimo = ultimo.getProx();
        }
        if (ultimo.getProx() == null){
            anterior.setProx(null);
            tamanho --;
        }
    }

    public void removeNo(int info) {
        System.out.print("Removendo o no " + info + " da lista.\n");
        No anterior = null;
        No atual = primeiro;
        while (atual != null && atual.getProx() != null) {
            anterior = atual;
            atual = atual.getProx();
            if (atual.getInfo() == info) {
                anterior.setProx(atual.getProx());
                tamanho--;
            }
        }
    }

    public void mostrar(){
        No auxiliar = primeiro;
        while(auxiliar != null){
            System.out.print(auxiliar.getInfo() + ",");
            auxiliar = auxiliar.getProx();
        }
        System.out.print("\nTamanho em quantidade de elementos na lista = "+ tamanho + " elementos.\n");
    }
}
