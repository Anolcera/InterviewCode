import MyCollection.CoolColletion

fun main(args: Array<String>) {
    val myCoolCollectionThatIsBasicallyDoublyLinkedList = CoolColletion<Int>()
    println(
        myCoolCollectionThatIsBasicallyDoublyLinkedList.add(1).add(897).add(2).add(69).add(420))

    myCoolCollectionThatIsBasicallyDoublyLinkedList.remove(897)
    println(myCoolCollectionThatIsBasicallyDoublyLinkedList)

}