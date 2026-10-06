public class Avion {
    String codigoVuelo;
    String aerolinea;
    String estadoVuelo;

    Avion(String codigoVuelo, String aerolinea) {
        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.estadoVuelo = "En vuelo";
    }

    void cambiarEstado(String nuevoEstado) {
        estadoVuelo = nuevoEstado;
    }

    void solicitarAterrizaje(TorreControl torre) {

        System.out.println(
                "El avion " + codigoVuelo +
                        " solicita autorizacion para aterrizar."
        );

        torre.autorizarAterrizaje(this);
    }
}
