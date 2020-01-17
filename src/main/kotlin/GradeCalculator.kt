class GradeCalculator {
    fun printGrade(score:Int):String{
        return when {
            score < 49 -> "F"
            score in 50..54 -> "D"
            score in 55..59 -> "D+"
            score in 60..64 -> "C"
            score in 65..69 -> "C+"
            score in 70..74 -> "B"
            score in 75..79 -> "B+"
            else -> "A"
        }
    }
}