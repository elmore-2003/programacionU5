package repaso;

public class Main {
    public static void main(String[] args) {
        TiendaMascota tiendaMascota = new TiendaMascota();

        tiendaMascota.agregarMascota("tony", 4, "oso");
        tiendaMascota.agregarMascota("pancho", 3,"murcielago");
        tiendaMascota.agregarMascota("alfredo", 2,"Perro");

        tiendaMascota.venderMascota("tony");

        tiendaMascota.mostrarInventario();
    }
}
