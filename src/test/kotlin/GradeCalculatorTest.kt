import org.junit.Test

import org.junit.Assert.*

class GradeCalculatorTest {
    val gradeCalculator = GradeCalculator()
    @Test
    fun printGradeF() {
        val score = 40
        val expectGrade = "F"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeD() {
        val score = 50
        val expectGrade = "D"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeC() {
        val score = 60
        val expectGrade = "C"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeB() {
        val score = 70
        val expectGrade = "B"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeA() {
        val score = 80
        val expectGrade = "A"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeBplus() {
        val score = 75
        val expectGrade = "B+"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeCplus() {
        val score = 65
        val expectGrade = "C+"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeDplus() {
        val score = 55
        val expectGrade = "D+"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
    @Test
    fun printGradeDplus2() {
        val score = 59
        val expectGrade = "D+"
        val grade = gradeCalculator.printGrade(score)
        assertEquals(expectGrade,grade)
    }
}