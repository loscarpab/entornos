/* Prácticas de EDES Git: Adrián Sabino, Carlos Cordero, Daniel Gutierrez */
class Carta(Minumero: Int, mipalo: Char) {
    var numero=Minumero
        set(value) {
            if (value !in 1..10) {
                println("Numero de carta inválido.")
            } else
                field = value
        }

    var palo=mipalo
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf('C', 'B', 'O', 'E')
            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }

    constructor():this((1..10).random(),paloAleatorio())
    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo)

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when (palo) {
            'C' -> paloMostrar = "Corazones"
            'B' -> paloMostrar = "Bastos"
            'O' -> paloMostrar = "Oros"
            'E' -> paloMostrar = "Espadas"
        }
        when (numero) {
            8 -> numeroMostrar = "Sota"
            in (1..7) -> numeroMostrar = numero.toString()
            9 -> numeroMostrar = "Caballo"
            10 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar.")
    }

    fun compararCarta(otraCarta : Carta):Int {
        /*
        var numero2 = this.numero
        var palo2 = this.palo*/
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            this.mostrarCarta()
            return -1
        } else if (this.numero < otraCarta.numero) {
            print("La carta mayor es: ")
            otraCarta.mostrarCarta()
            return 1
        } else {//número iguales
            if (this.palo > otraCarta.palo) {
                print("La carta mayor es: ")
                this.mostrarCarta()
                return -1
            } else {
                print("La carta mayor es: ")
                otraCarta.mostrarCarta()
                return 1
            }
        }
    }

    override fun toString(): String {
        return "Carta(numero=$numero, palo=$palo)"
    }
    fun pedirCarta(){
        println("introduce un número del 1 al 10")
        numero= readln().toInt()
        println("introduce un palo entra ('C', 'B', 'O', 'E')")
        palo= readln()[0]


    }

}
fun paloAleatorio():Char{
    val l = listOf('C', 'B', 'O', 'E')
    return(l.get((0..3).random()) )
}
fun numeroAPalo(n:Int):Char{
    val l = listOf('C', 'B', 'O', 'E')
    if (n>=0 && n<=3)
     return(l.get(n) )
    else return l.get(0)
}
fun main() {
    val listaCartas= mutableListOf<Carta>()
    for (n in (1..10))
        for (p in (0..3)){
            listaCartas.add(Carta(n,numeroAPalo(p))  )
        }
    for (cartadelaLista in listaCartas){
        cartadelaLista.mostrarCarta()
    }
}
