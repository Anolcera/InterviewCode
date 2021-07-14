import atomictest.eq
fun countVariants(stairCount: Int): Int?{
    if(stairCount < 0) return null
    if(stairCount < 1) return 1

    val result = mutableListOf<Int>(1,1)

    for(i in 2..stairCount){
        result.add(result[i-1] + result[i-2])
    }
    return result[stairCount]
}

fun main(){

    countVariants(27) eq 317811
}