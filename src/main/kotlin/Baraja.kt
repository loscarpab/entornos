/* Prácticas de EDES Git: Adrián Sabino, Carlos Cordero, Daniel Gutierrez */
class Baraja {
    var listaCartas= mutableListOf<Carta>()

    init{
        for (n in (1..10))
            for (p in (0..3)){

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