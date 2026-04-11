package Monticulo_MinHeap;

import java.util.ArrayList;

public class Monticulo {

    private ArrayList<Integer> monticulo;

    public Monticulo() {
        this.monticulo = new ArrayList<>();
    }

    public ArrayList<Integer> getMonticulo() {
        return monticulo;
    }

    public void setMonticulo(ArrayList<Integer> monticulo) {
        this.monticulo = monticulo;
    }

    public void upHeapify(int i){

        while(i > 0){

            int parent = (i - 1)/2; // posicion del padre

            if(monticulo.get(i) < monticulo.get(parent)){

                // intercambiar
                int temp = monticulo.get(i);
                monticulo.set(i, monticulo.get(parent));
                monticulo.set(parent, temp);

                i = parent;

            } else{
                break;
            }

        }
    }

    public void insert(int num){
        monticulo.add(num);
        upHeapify(monticulo.size()-1);

    }

    public void mostrar() {
        System.out.println(monticulo);
    }
    public int peek() {
        if (monticulo.isEmpty()) {
            throw new RuntimeException("El montículo está vacío");
        }
        return monticulo.get(0);
    }

    public int eliminarMin() {
        if (monticulo.isEmpty()) throw new RuntimeException("Monticulo vacío");

        int raiz = monticulo.get(0);
        int ultimo = monticulo.remove(monticulo.size() - 1);

        if (!monticulo.isEmpty()) {
            monticulo.set(0, ultimo); // El último pasa a ser el primero.
            downHeapify(0); // Lo 'hundimos' a su lugar correcto.
        }

        return raiz;
    }

    private void downHeapify(int i){

        int menor = i; // posicion del actual que sera eventualmente el menor.
        int izq = 2 * i + 1; // posicion del hijo izq.
        int der = 2 * i + 2; // posicion del hijo der.

        if (izq < monticulo.size() && monticulo.get(izq) < monticulo.get(menor)) {
            menor = izq;
        }

        if (der < monticulo.size() && monticulo.get(der) < monticulo.get(menor)) {
            menor = der;
        }

        if (menor != i) {

            int temp = monticulo.get(i);
            monticulo.set(i, monticulo.get(menor));
            monticulo.set(menor, temp);

            downHeapify(menor);

        }

    }

    public void heapify() {

        for (int i = (monticulo.size() / 2) - 1; i >= 0; i--) {
        downHeapify(i);
    }
}

    // Para probar el Heapify
    public void cargarDatos(int[] valores) {

        this.monticulo.clear();

        for (int v : valores) {
            this.monticulo.add(v);
        }

        this.heapify();
    }

    public void limpiar(){
        this.monticulo.clear();
    }








}
