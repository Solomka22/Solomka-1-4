// вторая практическая 1
// Операции с числами
import kotlin.math.sqrt
fun main(args: Array<String>) {
    // Задание 1
    var z1a = arrayOf(2, 3)
    print("задание 1.\na: число: ")
    for(i in 0..1){
        print(z1a[i])
    }
    print(" ответ: ")
    println(z1a[0])
    print("b: ответ: ")
    println(z1a[1])
    print("в: ответ: ")
    println(z1a[0]+z1a[1])
    print("г: ответ: ")
    println(z1a[0]*z1a[1])
    // Задание 2
    var z2a = arrayOf(2, 3,5)
    print("\nзадание 2.\na: число: ")
    for(i in 0..2){
        print(z2a[i])
    }
    print(" ответ: ")
    println(z2a[2])
    print("b: ответ: ")
    println(z2a[1])
    print("в: ответ: ")
    println(z2a[0]+z2a[1]+z2a[2])
    print("г: ответ: ")
    println(z2a[0]*z2a[1]*z2a[2])
    // Задание 3
    print("\nзадание 3.\nделение числа 58 и 4\nответ: ")
    println( 58 / 4)
    // Задание 4
    print("\nзадание 4.\nвозведение в степень 7 число 5\nответ: ")
    var z4a = 5
    for(l in 1..6){
        z4a *= 5
    }
    print(z4a)
    // Задание 5
    print("\n\nзадание 5.\nкорень числа 121\nответ: ")
    var z5a = 121
    print(sqrt(z5a.toDouble()))
}