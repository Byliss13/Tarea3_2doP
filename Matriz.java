
public class Matriz
{
    private int matriz[][];
    private int dimension;
    public Matriz(int dimension){
        this.dimension = dimension;
        matriz = new int[dimension][dimension]; 
    }

    public void recorridoCaracol() {
        int numeroinicial = 1;
        int limiteDimension = dimension-1;
        for (int valor = 1; valor <= limiteDimension / 2; valor++) {
            for (int indice = valor; indice <= limiteDimension - valor; indice++) {
                matriz[valor][indice] = numeroinicial;
                numeroinicial++;
            }
            for (int indice = valor; indice <= limiteDimension - valor; indice++) {
                matriz[indice][limiteDimension - valor + 1] = numeroinicial;
                numeroinicial++;
            }
            for (int indice = limiteDimension - valor + 1; indice >= valor + 1; indice--) {
                matriz[limiteDimension - valor + 1][indice] = numeroinicial;
                numeroinicial++;
            }
            for (int indice = limiteDimension - valor + 1; indice >= valor + 1; indice--) {
                matriz[indice][valor] = numeroinicial;
                numeroinicial++;
            }
        }
        if (limiteDimension % 2 == 1) {
            matriz[limiteDimension / 2 + 1][limiteDimension / 2 + 1] = numeroinicial;
        }

    }

    public void recorridoDiagonal(){
        int limite = dimension-1;
        for(int x = 0;x < dimension;x++){
            for(int y = 0;y < dimension;y++){
                if(x == y){
                    matriz[x][y] = 1;
                }else{
                    matriz[x][y] = 0;
                }
            }
            matriz[x][limite] = 1;
            limite--;
        }
    }

    public void recorridoNormal(){
        int contador = 0;
        for(int x = 0;x < dimension;x++){
            for(int y = 0;y < dimension;y++){
                contador++;
                matriz[x][y] = contador;
            }
        }
    }

    public void imprimirMatriz(){
        for(int x = 0;x < dimension;x++){
            for(int y = 0;y < dimension;y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
    }
}
