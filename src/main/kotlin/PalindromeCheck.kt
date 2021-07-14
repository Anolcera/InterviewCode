import atomictest.eq

fun isPalindrome(text: String): Boolean{
    val txt = lettersFromString(text).lowercase()
    return txt == txt.reversed()
}

fun lettersFromString(text: String): String{
    return text.filter { it.isLetter() }
}

fun main(){

    isPalindrome("AnNa") eq true
    isPalindrome("ZVIO") eq false
    isPalindrome("Eva, can I see bees in a cave?") eq true
}