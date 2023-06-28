import java.util.*

/**
 * spiral 만들기
 */

var n = 0
var m = 0
var spiralList = mutableListOf<MutableList<Int>>()
var number = 0
var flag = true

fun up(x: Int, y: Int) {
    //map을 벗어낫 경우
    if (x < 0 || x > n - 1 || y < 0 || y > m - 1) {
        right(x, y)
    }
    // 사방이 모두 값이 할당되어있는 경우 - 멈춰야 함
    else if(spiralList[x + 1][y] != 0 && spiralList[x - 1][y] != 0 && spiralList[x][y+1] != 0 && spiralList[x + 1][y-1] != 0){
        flag = false
    } else {
        // spiralArray에 number 값 할당
        spiralList[x][y] = number
        // number 1 증가
        number++
        up(x - 1, y)
    }
}

fun left(x: Int, y: Int) {
    if (x < 0 || x > n - 1 || y < 0 || y > m - 1) {
        up(x, y)
    }
    // 사방이 모두 값이 할당되어있는 경우 - 멈춰야 함
    else if(spiralList[x + 1][y] != 0 && spiralList[x - 1][y] != 0 && spiralList[x][y+1] != 0 && spiralList[x + 1][y-1] != 0){
        flag = false
    } else {
        // spiralArray에 number 값 할당
        spiralList[x][y] = number
        // number 1 증가
        number++
        left(x, y - 1)
    }
}

fun down(x: Int, y: Int) {
    if (x < 0 || x > n - 1 || y < 0 || y > m - 1) {
        left(x, y)
    }
    // 사방이 모두 값이 할당되어있는 경우 - 멈춰야 함
    else if(spiralList[x + 1][y] != 0 && spiralList[x - 1][y] != 0 && spiralList[x][y+1] != 0 && spiralList[x + 1][y-1] != 0){
        flag = false
    } else {
        // spiralArray에 number 값 할당
        spiralList[x][y] = number
        // number 1 증가
        number++
        down(x + 1, y)
    }
}

// 오른쪽으로 이동 함수
fun right(x: Int, y: Int) {
    if (x < 0 || x > n - 1 || y < 0 || y > m - 1) {
        down(x, y)
    }
    else if(spiralList[x + 1][y] != 0 && spiralList[x - 1][y] != 0 && spiralList[x][y+1] != 0 && spiralList[x + 1][y-1] != 0){
        flag = false
    }
    else {
        // spiralArray에 number 값 할당
        spiralList[x][y] = number
        // number 1 증가
        number++
        right(x + 1, y)
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    // m : 행의 수
    m = sc.nextInt()
    // n : 열의 수
    n = sc.nextInt()

    val initList = mutableListOf<Int>()
    //2차원 list를 초기화 하기 위한 1차원 list
    for(i in 0 .. n){
        initList.add(0)
    }
    // n*m 행렬보다 1칸씩 더 큰 크기로, 0으로 초기화
    for(i in 0 .. m){
        spiralList.add(initList)
    }

    while(flag){
        right(1, 1)
    }

    // spiralArray 출력
    for (row in spiralList) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}
