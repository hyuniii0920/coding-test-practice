class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        
        if (num1==num2){
            answer = 1
        }
        else {
            answer = -1
        }
        
        return answer
    }
}

/*
val calculate = { num: Int ->
    if (num % 2 == 0) {
        println("짝수입니다.")
        num * 1000 // 짝수일 때의 마지막 줄 (반환값)
    } else {
        println("홀수입니다.")
        0          // 홀수일 때의 마지막 줄 (반환값)
    }
}

println(calculate(4)) // 출력: 4000

*/