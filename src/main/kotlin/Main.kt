fun main(args: Array<String>) {


    val m = Mano(3)
    //println(m.listaCartas)
    m.mostrarMano()
    /*
    println(m.obtenerTamaño())
    m.mostrarCarta(1)
    var cartaNueva=Carta(10,'P')

    m.actualizarCarta(1,cartaNueva)
    println("actauliza carta")
    m.mostrarCarta(1)
    println("modificar")
    cartaNueva.numero=3
    m.mostrarCarta(1)
    */
    println("mano 2")

    val m2 = Mano(3)
    m2.mostrarMano()
    println("ganadora")

    m.manoGanadora(m2)


}
   /*

    var libroPrueba=Libro("anillos","tolkiem",54,6)
   // println(libroPrueba.toString())

    val Biblioteca=ListaLibro(6,libroPrueba)
    */

    /*
    println("inroduce max libros")
    Biblioteca.maxLibros= readln().toInt()

*/

/*

    var libroPrueba2=Libro("torres","tolkiem",54,6)
    Biblioteca.añadir(libroPrueba2)

  // Biblioteca.listaLibros.add(libroPrueba2)



    var libroPrueba3=Libro("rey","tolkiem",54,6)
    Biblioteca.añadir(libroPrueba3)
    println(Biblioteca.toString())

    println("cambiar tamaño a 1")
    Biblioteca.maxLibros=1
    println(Biblioteca.toString())

    /*
    println("eliminar anillos")
    Biblioteca.borrarPorTitulo("anillos")
    print(Biblioteca.toString())
    println("eliminar torres")
    Biblioteca.borrarPorTitulo("torres")
    print(Biblioteca.toString())
    */

    /*
    val miBaraja=Baraja()
    miBaraja.mostrar()
    println("aleatoria ")
    miBaraja.verCartaAleatoria()
*/

    /*
    var listaCartas= mutableListOf<Carta>()
    for (n in (1..13))
        for (p in (0..3)){
            /*
            val c=Carta(n,numeroAPalo(p))
            listaCartas.add(c)

             */
            listaCartas.add(Carta(n,numeroAPalo(p))  )
        }
    for (cartadelaLista in listaCartas){
        cartadelaLista.mostrarCarta()
    }

    /*
        val pepe=Alumno("77777777U",21)
        val ana=Alumno("88888888Y",41)


        pepe.notaTrimestre1=6
        pepe.notaTrimestre2=7
        pepe.notaTrimestre3=9

        //pepe.informeAlumno()
        ana.notaTrimestre1=4
        ana.notaTrimestre2=6

        ana.informeAlumno()
    */

     */
}
*/