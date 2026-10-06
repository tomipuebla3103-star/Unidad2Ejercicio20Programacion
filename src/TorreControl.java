public class TorreControl {
    boolean pistaLibre;

    TorreControl() {
        pistaLibre = true;
    }

    void autorizarAterrizaje(Avion avion) {

        if (pistaLibre) {

            System.out.println(
                    "Torre: Aterrizaje autorizado para " +
                            avion.codigoVuelo
            );

            pistaLibre = false;

            avion.cambiarEstado("Aterrizando");

        } else {

            System.out.println(
                    "Torre: Aterrizaje denegado para " +
                            avion.codigoVuelo +
                            ". La pista esta ocupada."
            );
        }
    }

    void liberarPista() {

        pistaLibre = true;

        System.out.println("La pista quedo libre.");
    }
}
