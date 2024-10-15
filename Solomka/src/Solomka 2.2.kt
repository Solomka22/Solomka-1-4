fun main() {
    println("Задание 1")
    val A1 = true
    val B1 = false
    val C1 = false
    println("А или В: ${A1 || B1}")
    println("А и В: ${A1 && B1}")
    println("В или С: ${B1 || C1}")
    println("\nЗадание 2")
    val X2 = false
    val Y2 = true
    val Z2 = false
    println("X или Z: ${X2 || Z2}")
    println("X и Y: ${X2 && Y2}")
    println("X и Z: ${X2 && Z2}")
    println("\nЗадание 3")
    println("не А и В: ${!A1 && B1}")
    println("А или не В: ${A1 || !B1}")
    println("А и В или С: ${A1 && B1 || C1}")
    println("\nЗадание 4")
    val X4 = true
    val Y4 = true
    val Z4 = false
    println("не X и Y: ${!X4 && Y4}")
    println("X или не Y: ${X4 || !Y4}")
    println("X или Y и Z: ${X4 || (Y4 && Z4)}")
    println("\nЗадание 5")
    println("не X и Y: ${!X4 && Y4}")
    println("X или не Y: ${X4 || !Y4}")
    println("X или Y и Z: ${X4 || (Y4 && Z4)}")
    println("\nЗадание 6")
    val X6 = false
    val Y6 = false
    val Z6 = true
    println("X или Y и не Z: ${X6 || (Y6 && !Z6)}")
    println("X и не Y или Z: ${X6 && !Y6 || Z6}")
    println("не X и не Y: ${!X6 && !Y6}")
    println("X и (не Y или Z): ${X6 && (!Y6 || Z6)}")
    println("не (X и Z) или Y: ${!(X6 && Z6) || Y6}")
    println("X или (не (Y или Z)): ${X6 || !(Y6 || Z6)}")
    println("\nЗадание 7")
    println("А или не (А и В) или С: ${A1 || !(A1 && B1) || C1}")
    println("не А или А и (В или С): ${!A1 || (A1 && (B1 || C1))}")
    println("(А или В и не С) и С: ${((A1 || (B1 && !C1)) && C1)}")
}