class Baraja {
    var listaCartas= mutableListOf<Carta>()

    init{
        for (n in (1..13))
            for (p in (0..3)){
                /*
                val c=Carta(n,numeroAPalo(p))
                listaCartas.add(c)

                 */
                listaCartas.add(Carta(n,numeroAPalo(p))  )
            }

    }
    fun mostrar(){
        print("mostrar baraja")
        for (cartadelaLista in listaCartas){
            cartadelaLista.mostrarCarta()
        }
        print("fin mostrar baraja")
    }
}