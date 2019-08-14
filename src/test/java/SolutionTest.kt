import org.junit.runner.RunWith
import org.junit.runners.Parameterized

import org.junit.Assert.*
import org.junit.Test

@RunWith(Parameterized::class)
class SolutionTest(
        private val input: String,
        private val expected: Int
) {
    private val soln = Solution1()

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun params() = arrayOf(
                arrayOf("1 + 1", 2),
                arrayOf("2-1 + 2", 3)
        )
    }

    @Test
    fun test() {
        assertEquals(expected, soln.calculate(input))
    }

}