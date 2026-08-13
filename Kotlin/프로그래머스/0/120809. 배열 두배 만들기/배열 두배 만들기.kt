class Solution {
    fun solution(numbers: IntArray): IntArray {
        for (i in numbers.indices/*방 번호(인덱스)들의 모음집*/){
            numbers[i] = numbers[i] * 2
        } 
        return numbers
    }
}