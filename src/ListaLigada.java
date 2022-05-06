public class ListaLigada {

    private No cabeca;
    private No cauda;    

    //metodo que adiciona no fim da lista
    public void adicionar(No novoElemento){
        if(cabeca == null){
            this.cabeca = novoElemento;
            this.cauda = cabeca;
        }else{
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }        
    }

    public void adicionar(int posicao, No novoElemento){
        No aux = this.cabeca;
        int i = 0;
        while(aux.getProx() != null && i < posicao-1){
            aux = aux.getProx();
            i++;
        }
        novoElemento.setProx(aux.getProx());
        aux.setProx(novoElemento);

    }

    public void remove(int posicao){
        No aux = this.cabeca;
        int i = 0;
        //Move o nó para a posição do nó anterior que deseja excluir
        while(aux.getProx() != null && i < posicao-1){
            aux = aux.getProx();
            i++;
        }
        //No temp = aux.getProx();
        aux.setProx((aux.getProx()).getProx());
        //temp.setProx(null);
    }
    
    public void imprimir(){
        No aux = cabeca;
        while(aux != null){
            System.out.print(aux.getDado() + " -> ");
            aux =  aux.getProx();
        }
        System.out.print("Fim\n\n");
    }
    
}
