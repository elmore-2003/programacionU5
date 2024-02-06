package repaso;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class TiendaMascota {
    Mascota[] inventario;
    int cantidadMascotas;
    
    public TiendaMascota(){
        this.inventario = new Mascota[100];
        this.cantidadMascotas=0; 
    }
    public void  agregarMascota(String nombre, int edad, String tipoAnimal){
        Mascota mascota = new Mascota(nombre, edad, tipoAnimal);
        inventario[cantidadMascotas]=mascota;
        cantidadMascotas++;
        System.out.println("La mascota"+mascota+"se ha añadido correctametne");
    }
    public void venderMascota(String nombre){
        for (int i = 0; i < cantidadMascotas ; i++) {
            if (inventario[1].getNombre()==nombre);
            System.out.println("la mascota"+inventario[i].getNombre()+"Se ha vendido");
            inventario[i]=null;
            for (int j = 0; j < cantidadMascotas; j++) {
                inventario[j]=inventario[j+1];
            }
            cantidadMascotas--;
            return;
        }
        System.out.printf("la mascota con nombre"+nombre+"no se encuentra");
    }
        public void mostrarInventario() {
                System.out.println("Inventario de la tienda:");
                for (int i = 0; i <cantidadMascotas; i++) ;
                    System.out.println("Nombre: " +inventario[1].getNombre()+ ", Edad: " +inventario[2].getEdad()+ ", Tipo: " +inventario[3].getTipoAnimal());

        }
    }

