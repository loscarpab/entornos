/* Prácticas de EDES Git: Adrián Sabino, Carlos Cordero, Daniel Gutierrez */
fun main() {


    val m = Mano(3)
    m.mostrarMano()
    println("mano 2")

    val m2 = Mano(3)
    m2.mostrarMano()
    println("ganadora")

    m.manoGanadora(m2)

    print (Baraja())

}