class PaletaCrema extends Paleta {
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    public void mostrarTexturaCremosa() {
        System.out.println("Textura cremosa: " + cremosa);
    }

    @Override
    public void cambiarPrecio(double cambio) {
        super.cambiarPrecio(cambio + 6.0);
    }
}
