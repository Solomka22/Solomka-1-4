// первая практическая работа 
// Задание 1
fun main(args: Array<String>) {
    println("задание 1: ")
    var name = "Peter"
    println("тип данных Striing: $name")
    var age = 23
    println("тип данных Int: $age")
    var bycva = 'a'
    println("тип данных Char: $bycva")
    var zx = true
    println("тип данных Boolean: $zx")
    var arr = arrayOf(1,2,3,4,5)
    print("массив: ")
    for(el in arr){
        print("$el ")
    }
    // Задание 2
    println("\n\nзадание 2: ")
    var chislo = 4.45
    println("число до сотых: $chislo")
    // Задание 3
    println("\nзадание 3: ")
    val e = Math.E
    println(String.format("%.1f", e))
    // Задание 4
    println("\nзадание 4: ")
    println("введите число: ")
    var z4 = readLine()
    println("вы ввели число: $z4")
    // Задание 5
    println("\nзадание 5: ")
    println("$z4 - вот какое число вы ввели")
    // Задание 6
    println("\nзадание 6: ")
    println("1, 13, 49")
    // Задание 7
    println("\nзадание 7: ")
    println("7,  15,  100")
    // Задание 8
    println("\nзадание 8: ")
    println("100,  200,  300")
    // Задание 9
    println("\nзадание 9: ")
    for(i in 1..5){
        print("$i ")
    }
    println()
    // Задание 10
    println("\nзадание 10: ")
    println("50 \n10")
    // Задание 11
    println("\nзадание 11: ")
    print("5\n10\n21\n")
    println()
    // Задание 12
    println("задание 12: ")
    for(i in 1..5){
        print("$i\n")
    }
}