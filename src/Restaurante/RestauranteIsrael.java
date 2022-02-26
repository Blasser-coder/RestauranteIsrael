package Restaurante;
/**
 *
 * La clase RestauranteIsrael gestiona los comensales del restaurante Israel
 *
 *@author DAM114
 *
 *@version 1.0
 *
 */
public class RestauranteIsrael {
    /** Parametro P de papas*/
    public int p;
    /** Parametro C de Chocos*/
    public int c;

    /**
     *
     * @param a La cantidad de papas que hay en stock
     * @param b La cantidad de chocos que hay en stock
     */
    public RestauranteIsrael(int a, int b) {
        this.p = a;
        this.c = b;
    }

    int cantidadPapas() {
        int a = this.p * 3;
        return a;
    }

    int cantidadChocos() {
        int ch = this.c * 6;
        return ch;
    }

    /**
     * Metodo que a;ade chocos  al stock actual
     * @param c
     */
    public void addChocos(int c) {
        this.c = this.c + c;
    }
    /**
     * Metodo que a;ade papas al stock actual
     * @param d
     */
    public void addPapas(int d) {
        this.p = this.p + d;
    }

    /** @hidden**/
    public static void main(String[] args) {
        RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
        System.out.println("Numero de chocos: " + r1.c);
        System.out.println("Numero de papas: " + r1.p);

        if(r1.cantidadPapas() <= r1.cantidadChocos()) {
            System.out.println("Israel puede dar de comer a " + r1.cantidadPapas() + " personas");
        }
        else {
            System.out.println("Israel puede dar de comer a " + r1.cantidadChocos() + " personas");
        }
    }

}