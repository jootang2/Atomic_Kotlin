import java.util.*

/**
 * spiral 만들기
 * 1. m * n 2차원 배열 생성
 * 2. 오른쪽 -> 아래 -> 왼쪽 -> 위 순으로 배열을 채워가며 이동
 * 3. 배열에 값이 할당되어 있거나, 값 할당 횟수가 m * n을 넘어가는 경우 반복 중지
 * 4. 배열 출력
 */

var m = 0
var n = 0
var spiralArray = Array(m) { IntArray(n) }
var flag = true
var count = 0

//오른족으로 이동하는 함수
fun goRight(x: Int, y: Int) {
    // 배열을 벗어나거나, 이미 채워진 값이 있는 경우
    if (y > n - 1 || spiralArray[x][y] != 0) {
        // 모든 배열의 값이 있는 경우
        if (count >= m * n){
            //멈춘다.
            flag = false
        }
        // 배열이 비어있는 경우 아래로 이동
        else goDown(x + 1, y - 1)
    }
    if (flag) {
        // 반복횟수만큼 count 증가
        count++
        // 배열에 값 할당
        spiralArray[x][y] = count
        // 오른쪽으로 이동
        goRight(x, y + 1)
    }
}

fun goDown(x: Int, y: Int) {
    // 배열을 벗어나거나, 이미 채워진 값이 있는 경우
    if (x > m - 1 || spiralArray[x][y] != 0) {
        // 모든 배열의 값이 있는 경우
        if (count >= m * n){
            //멈춘다.
            flag = false
        }
        // 배열이 비어있는 경우 왼쪽으로 이동
        else goLeft(x - 1, y - 1)

    }
    if (flag) {
        // 반복횟수만큼 count 증가
        count++
        // 배열에 값 할당
        spiralArray[x][y] = count
        // 아래로 이동
        goDown(x + 1, y)
    }

}

fun goLeft(x: Int, y: Int) {
    // 배열을 벗어나거나, 이미 채워진 값이 있는 경우
    if (y < 0 || spiralArray[x][y] != 0) {
        // 모든 배열의 값이 있는 경우
        if (count >= m * n){
            //멈춘다.
            flag = false
        }
        // 배열이 비어있는 경우 위로 이동
        else goUp(x - 1, y + 1)
    }
    if (flag) {
        // 반복횟수만큼 count 증가
        count++
        // 배열에 값 할당
        spiralArray[x][y] = count
        // 왼쪽으로 이동
        goLeft(x, y - 1)
    }
}

fun goUp(x: Int, y: Int) {
    // 배열을 벗어나거나, 이미 채워진 값이 있는 경우
    if (x < 0 || spiralArray[x][y] != 0) {
        // 모든 배열의 값이 있는 경우
        if (count >= m * n){
            //멈춘다.
            flag = false
        }
        // 배열이 비어있는 경우 오른쪽으로 이동
        else goRight(x + 1, y + 1)
    }

    if (flag) {
        // 반복횟수만큼 count 증가
        count++
        // 배열에 값 할당
        spiralArray[x][y] = count
        // 위로 이동
        goUp(x - 1, y)
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    // m : 행의 수
    m = sc.nextInt()
    // n : 열의 수
    n = sc.nextInt()
    // spiralList 초기화
    spiralArray = Array(m) { IntArray(n) }

    //flag가 false : 모든 배열의 값이 채워질 때 까지 반복
    while (flag) {
        //시작점
        goRight(0, 0)
    }

    // spiralArray 출력
    for (row in spiralArray) {
        for (element in row) {
            print("$element")
        }
        println()
    }
}