//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TorreControl torre = new TorreControl();

    Avion avion1 =
            new Avion("AR123", "Aerolineas Argentinas");

    Avion avion2 =
            new Avion("LA456", "LATAM");

    Avion avion3 =
            new Avion("IB789", "Iberia");


    avion1.solicitarAterrizaje(torre);

    avion2.solicitarAterrizaje(torre);

    torre.liberarPista();

    avion2.solicitarAterrizaje(torre);

    torre.liberarPista();

    avion3.solicitarAterrizaje(torre);


    System.out.println("\nEstado de los aviones:");

    System.out.println(
            avion1.codigoVuelo + " - " +
                    avion1.estadoVuelo
    );

    System.out.println(
            avion2.codigoVuelo + " - " +
                    avion2.estadoVuelo
    );

    System.out.println(
            avion3.codigoVuelo + " - " +
                    avion3.estadoVuelo
    );
}
