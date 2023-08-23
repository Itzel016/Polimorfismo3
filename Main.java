public class Main {
    public static void main(String[] args) {
        Paleta[] paletas = new Paleta[2];
        paletas[0] = new PaletaAgua("Fresa", 15.0, true);
        paletas[1] = new PaletaCrema("Chocolate", 20.0, true);

        for (Paleta paleta : paletas) {
            paleta.mostrarInformacion();
            paleta.cambiarPrecio(0);
            paleta.mostrarInformacion();
            System.out.println("----------------");
        }
    }
}