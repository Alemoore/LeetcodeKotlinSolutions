import kotlin.math.abs

/***You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z.
 * Let x be any string in the first array and y be any string in the second array.
 * Find max(abs(length(x) − length(y)))
 * If a1 and/or a2 are empty return -1
 */



    fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
        if (a1.isEmpty() || a2.isEmpty())
            return -1
        val firstMin = a1.sortedBy { it.length }[0].length
        val secondMin = a2.sortedBy { it.length }[0].length
        val firstMax = a1.sortedBy { it.length }[a1.size - 1].length
        val secondMax = a2.sortedBy { it.length }[a2.size - 1].length
        return if (abs(firstMin - secondMax) > abs(secondMin - firstMax)) abs(firstMin - secondMax) else abs(secondMin - firstMax)
    }




