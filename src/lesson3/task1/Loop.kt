@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import kotlin.math.abs
import kotlin.math.sqrt

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    if (abs(n) < 10) return 1
    var module = abs(n)
    var count = 0
    while (module > 0) {
        module /= 10
        count += 1
    }
    return count
}

/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
<<<<<<< .merge_file_a19836
    var a = 1
    var b = 1
    for (i in 3..n) {
        b = a + b
        a = b - a
    }
    return b
=======
    var fibN = 0
    if ((n == 1) || (n == 2)) return 1 else {
        var fibFirst = 1
        var fibSecond = 1
        for (i in 3..n) {
            fibN = fibFirst + fibSecond
            fibFirst = fibSecond
            fibSecond = fibN
        }
    }
    return fibN

>>>>>>> .merge_file_a13108
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    var k = 1
    while (k <= n) {
        k += 1
        if (n % k == 0) {
            return k
        }
    }
    return -1
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    var k = n
    while (k >= 2) {
        k -= 1
        if (n % k == 0) {
            return k
        }
    }
    return -1
}

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var reversedN = 0
    var m = n
    while (m > 0) {
        val digit = m % 10
        reversedN *= 10
        m /= 10
        reversedN += digit
    }
    return reversedN
}

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean {
    val palindrome = revert(n)
    return palindrome == n
}

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean = TODO()
/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
<<<<<<< .merge_file_a19836

fun findN(number: Int, count2: Int, n: Int): Int {
    var copyn = number
    var copyc = 0
    while (copyn > 0) {
        copyc += 1
        copyn /= 10
    }
    return count2 + copyc
}

fun squareSequenceDigit(n: Int): Int {
    var sch = 0
    var count2 = 0
    for (i in 1..n) {
        sch += 1
        var number = sch * sch
        var counter = findN(number, count2, n)
        count2 = counter
        while (number > 0) {
            if (counter == n) return number % 10
            counter -= 1
            number /= 10
        }
    }
    return -1
=======
fun squareSequenceDigit(n: Int): Int {
    var numberInSequence = 1
    var sum = 0
    var squareOfNumber = 0
    while (sum < n) {
        squareOfNumber = numberInSequence * numberInSequence
        sum += digitNumber(squareOfNumber)
        numberInSequence++
    }
    while (sum != n) {
        squareOfNumber /= 10
        sum--
    }
    return squareOfNumber % 10
>>>>>>> .merge_file_a13108
}

/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
<<<<<<< .merge_file_a19836
    var a = 1
    var number = 1
    var count2 = 2
    if ((n == 1) || (n == 2))
        return (1)
    else {
        for (i in 3..n) {
            number += a
            a = number - a
            var counter = findN(number, count2, n)
            count2 = counter
            var copyn = number
            while (copyn > 0) {
                return if (counter == n) (copyn % 10) else -1
                copyn /= 10
                counter -= 1
            }
        }
    }
    return (-1)
}
=======
    var numberInSequence = 0
    var sum = 0
    while (sum < n) {
        numberInSequence++
        sum += digitNumber(fib(numberInSequence))
    }
    numberInSequence = fib(numberInSequence)
    while (sum > n) {
        numberInSequence /= 10
        sum--
    }
    return numberInSequence % 10
}
>>>>>>> .merge_file_a13108
