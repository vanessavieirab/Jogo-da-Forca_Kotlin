import model.Forca

fun main() {
    print("Digite uma palavra: ")
    var palavra = readLine()!!
    print("Digite uma dica: ")
    var dica = readLine()!!

    var jogoforca = Forca(palavra, dica)

    jogoforca.iniciar()

    while(!jogoforca.terminou()) {

        try {
            println("Letras Usadas:   [${jogoforca.getLetrasUsadas()}]")
            println("Letras Distintas: ${jogoforca.letrasDistintas()}")
            println("Acertos:          ${jogoforca.getAcertos()}")
            println("Tentativas:       ${jogoforca.getTentativas()}")

            println("Dica: ${jogoforca.getDica()}")
            println()

            println(jogoforca.getPalavraOculta())
            println()

            print("Digite uma letra: ")
            val letra = readLine()!!.uppercase()
            println()

            jogoforca.adivinhar(letra)
        }
        catch (e: Throwable) {
            println(e.message)
        }
    }

    if (jogoforca.getAcertos() == jogoforca.getTamPalavra()) {
        println("GANHOU")
        print("A palavra era: ${jogoforca.getPalavra()}")
    }
    else {
        println("PERDEU")
        print("A palavra era: ${jogoforca.getPalavra()}")
    }

}