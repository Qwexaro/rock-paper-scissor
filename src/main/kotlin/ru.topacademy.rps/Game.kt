package ru.topacademy.rps

object Game {

    fun launch() {
        println("Figures: ")

        Figure.entries.forEach {
            val code = it.code
            val name = it.name

            val row = "[$code] $name"
            println(row)
        }

        println()

        print("Your figure code: ")
        val code = readln().toInt()
        val figure1 = Figure.of(code) ?: error("Unknown code!")

        val figure2 = Figure.rand()
        println("PC: ${figure2.code} (${figure2.name})")

        val res = result(figure1 to figure2)

        if (res == null) {
            println("DRAW!")
        } else {
            if (res) {
                println("WIN: PC")
            } else {
                println("WIN: Human")
            }
        }
    }

    private fun result(figures: Pair<Figure, Figure>) = if (figures.first.code == figures.second.code) {
        null
    } else {
        if (figures.first.loss == figures.second.code) {
            true
        } else {
            false
        }
    }

}
