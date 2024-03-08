public class Yate extends Embarcacion{
    public Yate(Capitan capitan, double precioBase, double valorAdicional, Integer anioFabricacion, double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    private Integer cantidadCamarotes;

    public boolean mayorLujo(Yate otroYate){
        return cantidadCamarotes > otroYate.cantidadCamarotes;
    }

}
