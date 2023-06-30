import java.util.*

/**
 * spiral 만들기
 */


fun main() {
    val sc = Scanner(System.`in`)
    // m : 행의 수
    val m = sc.nextInt()
    // n : 열의 수
    val n = sc.nextInt()
    // spiralList 초기화
    val spiralArray = Array(m) {IntArray(n)}

    // spiralArray 출력
    for (row in spiralArray) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}