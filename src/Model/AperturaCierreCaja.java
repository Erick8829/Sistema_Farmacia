package Model;

public class AperturaCierreCaja {
    private int idApertura;
    private String fechaApertura;
    private String fechaCierre;
    private double montoInicial;
    private double montoCierre;
    private String estado;
    private Empleado empleado;
    private Caja caja;

    public AperturaCierreCaja(int idApertura, String fechaApertura, double montoInicial,
                              Empleado empleado, Caja caja) {
        this.idApertura = idApertura;
        this.fechaApertura = fechaApertura;
        this.montoInicial = montoInicial;
        this.empleado = empleado;
        this.caja = caja;
        this.estado = "ABIERTA";
    }

    // Devuelve lo vendido en el turno: monto de cierre menos monto inicial
    public double cuadrarTurno() {
        return montoCierre - montoInicial;
    }

    public void cerrarTurno(String fechaCierre, double montoCierre) {
        this.fechaCierre = fechaCierre;
        this.montoCierre = montoCierre;
        this.estado = "CERRADA";
        caja.cerrarCaja();
    }

    public int getIdApertura() { return idApertura; }
    public String getFechaApertura() { return fechaApertura; }
    public String getFechaCierre() { return fechaCierre; }
    public double getMontoInicial() { return montoInicial; }
    public double getMontoCierre() { return montoCierre; }
    public String getEstado() { return estado; }
    public Empleado getEmpleado() { return empleado; }
    public Caja getCaja() { return caja; }
}
