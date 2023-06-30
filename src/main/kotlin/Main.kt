import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    // 보드의 행 개수
    val m = sc.nextInt()
    // 보드의 열 개수
    val n = sc.nextInt()
    // 보드
    val board = Array(m) {CharArray(n)}
    // 입력 값을 보드에 할당
    for(i in 0 until m){
        val colors = sc.next()
        for(j in 0 until n){
            board[i][j] = colors[j]
        }
    }
    // 최솟값 초기화
    var minCount = Int.MAX_VALUE
    // 0 ~ 돌면서 바꿔야 하는 횟수 확인
    for(i in 0 .. m-8){
        for(j in 0 .. n-8){
            minCount = minOf(minCount , countBoard(board, i , j))
        }
    }
    // 최솟값 출력
    println(minCount)
}

fun countBoard(board : Array<CharArray>, x : Int, y:Int) : Int{
    // 시작할 수 있는 색 배열
    val startColors = arrayOf('W', 'B')
    // W로 시작하는 체스판인 경우
    var count1 = 0
    // B로 시작하는 체스판인 경우
    var count2 = 0

    for(i in 0 until 8){
        for(j in 0 until 8){
            if(board[x+i][y+j] != startColors[(i + j) % 2]){
                count1 ++
            }
            if(board[x+i][y+j] != startColors[(i + j + 1) % 2]){
                count2 ++
            }
        }
    }

    return(minOf(count1, count2))
}