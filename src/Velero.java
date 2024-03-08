public class Velero extends Embarcacion{
    public Velero(Capitan capitan, double precioBase, double valorAdicional, Integer anioFabricacion, double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    private Integer cantidadMastiles;

    public boolean veleroGrande(){
        return cantidadMastiles > 4;
    }
}
