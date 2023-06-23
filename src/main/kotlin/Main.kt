fun main() {
    /**
     * 12. 루프와 범위
     */
    fun showRange(r: IntProgression) {
        for (i in r) {
            print("$i ")
        }
        println(" // $r")
        println()
    }

    showRange(1..5)
    showRange(1 until 5)
    showRange(5 downTo 1)
    showRange(0..5 step 2)
    showRange(0 until 5 step 2)
    showRange(10 downTo 2 step 2)

    for (i in 'a'..'z') {
        print("$i")
    }

    println()

    val a = "abcd"
    for (i in 0..a.lastIndex) {
        print(a[i] + 1)
    }

    println()

    val ch: Char = 'a'
    println(ch + 25)
    println(ch + 25 < 'z')
    println('y' < 'z')

    println()

    fun hasChar(s: String, c: Char): Boolean {
        for (i in s) {
            if (i == c) return true
        }
        return false
    }

    println(hasChar("abc", 'c'))
    println(hasChar("abc", 'z'))

    /**
     * 13. in 키워드
     */
    println()
    println("13. in 키워드")

    val percent = 35
    println(percent in 1..20)
    println(percent in 1..36)

    // for 루프 제어식에 있는 in만 이터레이션을 뜻한다.
    // 나머지 in은 모두 원소인지 여부를 검사하는 in이다.

    val b = 1..3
    for (i in b) {
        print("$i")
    }
    println()
    println(2 in b)
    println(4 in b)


    println()
    println()
    //25. 가변 인자 목록
    val aa = listOf(1)
    println(aa)

    fun v(s: String, vararg d: Double) {}
    v("Abc", 1.0, 2.0)
    v("Abc", 1.0, 2.0, 3.0)
    v("Abc", 1.0, 2.0, 4.0, 5.0, 6.90)


}