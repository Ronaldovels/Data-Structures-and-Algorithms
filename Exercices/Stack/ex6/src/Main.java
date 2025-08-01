public class Main {

    public static void main(String[] args) {

        FilaComDuasPilhas fila = new FilaComDuasPilhas();
        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");

        fila.showQueue();

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());







    }

}
