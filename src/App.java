public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        No novoElemento = new No("A", null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null));
        lista.adicionar(new No("C", null));
        lista.adicionar(new No("D", null));
        novoElemento = new No("E", null);
        lista.adicionar(2, novoElemento);
        lista.imprimir();
        lista.remove(2);
        lista.imprimir();

    }
}
