import atomictest.eq

fun isProperly(sequence: String): Boolean{
    var result = 0
    for (i in sequence){
        if(i == '(') result++
        else if (i == ')') result--
        if(result < 0) return false
    }

    return result == 0
}

fun main(){
    isProperly("()()") eq true
    isProperly("())()") eq false
    isProperly(")()()((())))())(") eq false
}