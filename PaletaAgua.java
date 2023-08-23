class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        System.out.println("Base de agua: " + baseAgua);
    }

    @Override
    public void cambiarPrecio(double cambio) {
        super.cambiarPrecio(cambio + 2.0);
    }
}