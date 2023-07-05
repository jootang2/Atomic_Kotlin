import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val array = Array(N) { IntArray(2) }
    for (i in 0 until N) {
        array[i][0] = sc.nextInt()
        array[i][1] = sc.nextInt()
    }
    array.sortBy { it[0] }
    for()
    for (i in 0 until N - 1) {
        if (array[i][0] == array[i + 1][0]) {
            if(array[i][1] > array[i+1][1]){
                val big = array[i][1]
                array[i][1] = array[i+1][1]
                array[i+1][1] = big
            }
        }
    }

    for (i in array) {
        for (j in i) {
            print("$j ")
        }
        println()
    }


}