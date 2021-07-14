import atomictest.eq

fun notContains(array: List<Int>): Int{
    return notContainsSorted(array.sorted(), 1)
}

tailrec fun notContainsSorted(array: List<Int>, absentMin: Int): Int{
    if(array.first() != absentMin) return absentMin
    return if(array.size > 1){
        notContainsSorted(array.subList(1, array.size), absentMin + 1)
    }else{
        when(absentMin){
            array[0] -> absentMin + 1
            else -> absentMin
        }
    }
}

fun main(){
    notContains(listOf(99, 5, 76, 22, 13, 1, 57, 9, 69, 420)) eq 2
}