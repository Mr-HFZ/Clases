/*  se tiene N clientes de un almacen se solicita el nombre, articulo, cantidad, valor unitario
calcular el valor total a pagar y aplicar un descuento del 10% en todoas las ventas

mostrar los datos completos de los clientes
*/

public class DatosCliente {
    private String nombre;
    private String articulo;
    private int cantidad;
    private int valorU;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorU() {
        return valorU;
    }

    public void setValorU(int valorU) {
        this.valorU = valorU;
    }

}
