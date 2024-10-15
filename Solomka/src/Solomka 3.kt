// третья практическая работа
// Условный оператор
import java.util.Scanner
val scan =Scanner(System.`in`)
fun main(args: Array<String>) {
    // задание 1
    print("введите 3 числa: \n")
    print("a) ")
    val a = scan.nextInt()
    print("b) ")
    val b = scan.nextInt()
    print("c) ")
    val c = scan.nextInt()
    if(a > b && a > c){
        print("\nсамое большое число - a) $a ")
    }
    if(b > a && b > c){
        print("\nсамое большое число - b) $b ")
    }
    if(c > b && c > a){
        print("\nсамое большое число - c) $c ")
    }
    // задание 2
    println("\n\nЗдание 2: ")
    if((a==b) || (a==c) || (b==c)){
        print("ОШИБКА! числа равны")
    }
    if((a>b && a<c) || (a>c && a<b))
        print("\nсреднее число - a) $a")
    if((b<a && b>c) || (b<c && b>a))
        print("\nсреднее число - b) $b")
    if((c<a && c>b) || (c<b && c>a))
        print("\nсреднее число - c) $c")
    // задание 3
    println("\n\nЗадание 3: \nвведите 2 числа: ")
    print("x) ")
    val x = scan.nextInt()
    print("y) ")
    val y = scan.nextInt()
    if(x%2==0)
        print("четное число - x) $x")
    if(y%2==0)
        print("четное число - y) $y")
    // Задание 4
    println("\n\nЗадание 4: \nвведите 2 числа: ")
    print("X) ")
    val X = scan.nextInt()
    print("Y) ")
    val Y = scan.nextInt()
    if(X%Y==0)
        print("первое число кратно второму")
    if(0 !== X%Y) {
        val res = X%Y
        print("первое число не кратно второму, остаток - $res")
    }
    // Задание 5
    println("\n\nЗадание 5: \nвведите 3 числа: ")
    print("A) ")
    val A = scan.nextInt()
    print("B) ")
    val B = scan.nextInt()
    print("C) ")
    val C = scan.nextInt()
    if((A == (C + B)) || ((B == (A + C)) || (C == (A+B)))){
        print("треугольник НЕ возможен")
    } else {
        print("триугольник возможен")
    }
    // Задание 6
    println("\n\nЗадание 6: \nвведите год: ")
    print("Год) ")
    val god = scan.nextInt()
    if(god%4 == 0)
        print("год высокосный $god")
    else
        print("год НЕ высокосный $god")
    // Задание 7
    println("\n\nЗадание 7: \nвведите 2 числа: ")
    print("X) ")
    val Xx = scan.nextInt()
    print("Y) ")
    val Yy = scan.nextInt()
    if(Xx>Yy)
        print("$Xx - самое больше число, $Yy - наимеьншее число")
    if(Xx<Yy)
        print("$Yy - самое больше число, $Xx - наимеьншее число")
    // Задание 8
    println("\n\nЗадание 8: \nвведите 2 числа: ")
    print("km) ")
    val km = scan.nextInt()
    print("ft) ")
    val ft= scan.nextInt()
    val km1 = ft * 0.305
    print("растояяние футов в километры: $km1")
    // Задание 9
    println("\n\nЗадание 9: \nвведите 2 числа: ")
    print("m) ")
    val m = scan.nextInt()
    print("n) ")
    val n = scan.nextInt()
    if(m%n ==0){
        var res = m / n
        print("числа делятся нацело - $res")
    } else{
        print("числа не делятся нацело")
    }
    // Задание 10
    println("\n\nЗадание 10: \nвведите 2 числа: ")
    print("A) ")
    val M = scan.nextInt()
    print("B) ")
    val N = scan.nextInt()
    if(M%N == 0)
        print("А является делителем В")
    else
        print("А не является делителем В")
    // Здание 11
    println("\n\nЗадание 11: \nвведите число: ")
    print("A) ")
    val chis = scan.nextInt()
    if(chis%2==0){
        print("a) число четное ")
    } else
        print("а) число не четное ")
    if(chis%5== 2)
        print(" b) на конце 7 ")
    else
        print(" b) на конце не 7 ")
    // Задание 12
    println("\n\nЗадание 12: \nвведите двузначное число: ")
    print("число) ")
    val gd1 = scan.nextInt()
    var gd11 = gd1 / 10
    var gd12 = gd1 %10
    if(gd11> gd12)
        print("первая цифра больше второй - $gd11 ")
    else
        print("второе число больше первого - $gd12 ")
    if(gd11 == gd12)
        println(",цифры равны")
    else
        println(",цифры не равны")
    // Задание 13
    println("\n\nЗадание 13: \nа) введите четырехзначное число: ")
    print("число) ")
    val gd2 = scan.nextInt()
    var gd21 = gd2 / 1000 //первое
    var gd22 = gd2 / 100 //второе
    var gd23 = gd2 / 10 //третье
    var gd24 = gd2 %10 //четвертое
    if((gd21+gd22)==(gd23+gd24))
        println("сумма первых двух и двух последних РАВНА")
    else
        println("сумма не равна")
    print("б) ")
    var gd221 = gd21 + gd22 + gd23 + gd24
    if(gd221%3==0)
        print("сумма всех цифр кратна 3\n")
    else
        print("сумма всех цифр НЕ кратна 3\n")
    print("в) ")
    var gd222 = gd21 * gd22 * gd23 * gd24
    if(gd222%4==0)
        print("произведение всех цифр кратно 4")
    else
        print("произведение всех цифр НЕ кратно 4")
}