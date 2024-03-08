public class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private Integer anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, Integer anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler(){
        double totalAlquiler = precioBase;
        if (anioFabricacion > 2020){
            totalAlquiler += valorAdicional;
        } return totalAlquiler;
    }
}
