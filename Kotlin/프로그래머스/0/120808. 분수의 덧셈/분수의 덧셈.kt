class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var a1:Int; var a2:Int
        a1 = (numer1 * denom2 + numer2 * denom1)
        a2 = (denom1 * denom2)
        
        val gcdValue = gcd(a1, a2)
        
        answer = intArrayOf(a1/gcdValue, a2/gcdValue)
        return answer
    }
}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)


