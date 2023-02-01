class Mano (tamanoinicial:Int){

    private var tamano=1

        set(valor){
            if (valor<0)
                field=1
            else
                field=valor
        }

    private var listaCartas= mutableListOf<Carta>()
    init{
        if (tamanoinicial<0)
            tamano=1
        else
            tamano=tamanoinicial

        for (i in (0..tamano-1))
            listaCartas.add(Carta())
    }


    constructor():this(3){
        /*
        listaCartas.add(Carta())
        listaCartas.add(Carta())
        */
        for (i in (0..tamano-1))
            listaCartas.add(Carta())
    }
    fun obtenerTamano():Int{
        return tamano
    }
    fun mostrarCarta(posicion : Int){
        if(posicion>=0 && posicion<listaCartas.size){
            println(listaCartas[posicion].toString())
        }

    }
    fun obtenerCarta(posicion : Int):Carta {
        if (posicion >= 0 && posicion < listaCartas.size) {
            return listaCartas[posicion]
        } else
            return Carta()
    }
    fun mostrarMano(){

        for (i in (0.. listaCartas.size-1))
            mostrarCarta(i)
    }
    fun actualizarCarta(posicion : Int, nuevaCarta : Carta){
        if (posicion >= 0 && posicion < listaCartas.size) {
           //listaCartas[posición]=nuevaCarta
            listaCartas[posicion]=Carta(nuevaCarta)
        }


    }
    fun manoGanadora(otraMano: Mano):Int{
        var acumulaVictorias=0
        val menorNumeroCartas=if (listaCartas.size<otraMano.listaCartas.size) listaCartas.size else otraMano.listaCartas.size
        for (i in (0.. menorNumeroCartas-1)){
            acumulaVictorias+=listaCartas[i].compararCarta(otraMano.listaCartas[i])
        }
        if (acumulaVictorias<0) {
            this.mostrarMano()
           return -1
        }
        else{
            otraMano.mostrarMano()
            return 1
        }
        //return acumulaVictorias

    }
    fun pedirMano(){
        for (cartaActual in listaCartas){
            cartaActual.pedirCarta()
        }

    }
    fun pedirCartayAnadir(){
        val nuevaCarta=Carta()
        nuevaCarta.pedirCarta()
        listaCartas.add(nuevaCarta)
        //tamaño++
        tamano=listaCartas.size

    }
}

