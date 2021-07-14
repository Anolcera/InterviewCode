import atomictest.eq

val coins = listOf<Int>(50, 20, 10, 5, 1)

fun minSplit(amount: Int): Int {
    var result = 0
    var i = 0
    var amount = amount
    while (amount != 0) {
        if (amount >= coins[i]) {
            amount -= coins[i]
            result++
        }else{
            i++
        }

    }
    return result
}

fun main(){

    minSplit(101) eq 3
    minSplit(28592) eq 575
    minSplit(0) eq 0
}