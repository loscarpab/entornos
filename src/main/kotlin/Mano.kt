class Mano (tamañoinicial:Int){

    private var tamaño=1
        get(){
            return field
        }
        set(valor:Int){
            if (valor<0)
                field=1
            else
                field=valor
        }

    private var listaCartas= mutableListOf<Carta>()
    init{
        if (tamañoinicial<0)
            tamaño=1
        else
            tamaño=tamañoinicial

        for (i in (0..tamaño-1))
            listaCartas.add(Carta())
    }


    constructor():this(3){
        /*
        listaCartas.add(Carta())
        listaCartas.add(Carta())
        */
        for (i in (0..tamaño-1))
            listaCartas.add(Carta())
    }
    fun obtenerTamaño():Int{
        return tamaño
    }
    fun mostrarCarta(posición : Int){
        if(posición>=0 && posición<listaCartas.size){
            println(listaCartas[posición].toString())
        }

    }
    fun obtenerCarta(posición : Int):Carta {
        if (posición >= 0 && posición < listaCartas.size) {
            return listaCartas[posición]
        } else
            return Carta()
    }
    fun mostrarMano(){

        for (i in (0.. listaCartas.size-1))
            mostrarCarta(i)
    }
    fun actualizarCarta(posición : Int, nuevaCarta : Carta){
        if (posición >= 0 && posición < listaCartas.size) {
           //listaCartas[posición]=nuevaCarta
            listaCartas[posición]=Carta(nuevaCarta)
        }


    }
    fun manoGanadora(otraMano: Mano):Int{
        var acumulaVictorias=0
        var menorNumeroCartas=if (listaCartas.size<otraMano.listaCartas.size) listaCartas.size else otraMano.listaCartas.size
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
    fun pedirCartayAñadir(){
        var nuevaCarta=Carta()
        nuevaCarta.pedirCarta()
        listaCartas.add(nuevaCarta)
        //tamaño++
        tamaño=listaCartas.size

    }
}

