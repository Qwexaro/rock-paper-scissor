package ru.topacademy.rps

enum class Figure (
    val code: Int,
    val loss: Int
) {

    Rock(
        code = Codes.ROCK,
        loss = Codes.PAPER
    ),

    Paper(
        code = Codes.PAPER,
        loss = Codes.SCISSORS
    ),

    Scissors(
        code = Codes.SCISSORS,
        loss = Codes.ROCK
    );

    object Codes {

        const val ROCK = 0

        const val PAPER = 1

        const val SCISSORS = 2

    }

    companion object {

        fun of(code: Int) = entries.find {
            it.code == code
        }

        fun rand() = entries.random()

    }

}
