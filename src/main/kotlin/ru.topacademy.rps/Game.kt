package ru.topacademy.rps

object Game {

    fun launch() {
        val code = readln().toInt()

        val figure1 = Figure.of(code) ?: error("Unknown code!")
        val figure2 = Figure.rand()

        val res = result(figure1 to figure2)

        if (res == null) {
            println("DRAW!")
        } else {
            if (res) {
                println("WIN: Human")
            } else {
                println("WIN: PC")
            }
        }
    }

    fun result(figures: Pair<Figure, Figure>) = if (figures.first.code == figures.first.code) {
        null
    } else {
        if (figures.first.loss == figures.second.code) {
            true
        } else {
            false
        }
    }

}
