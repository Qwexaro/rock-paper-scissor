package ru.topacademy.rps

enum class Action (
    private val code: Int
) {

    Rock(Codes.ROCK),

    Paper(Codes.PAPER),

    Scissors(Codes.SCISSORS);

    companion object {

        fun of(code: Int) = entries.find {
            it.code == code
        }

        fun random() = entries.random()

        fun compare(action1: Action, action2: Action) = Result.of(action1, action2)

    }

    enum class Result {

        Win,

        Loss,

        Draw;

        companion object {

            fun of(action1: Action, action2: Action): Result {
                val code1 = action1.code
                val code2 = action2.code

                if (code1 == code2) return Draw
                else if (code1 > code2) return Win
                else return Loss
            }

        }

    }

    object Codes {

        const val ROCK = 0

        const val PAPER = 1

        const val SCISSORS = 2

    }

}
