package MyCollection

data class Node<T>(var value: T, var next: Node<T>? = null, var prev: Node<T>? = null){
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class CoolColletion<T>{
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private val elementMap: MutableMap<T, Node<T>?> = mutableMapOf()
    private var size = 0

    fun add(element: T): CoolColletion<T>{
        if(size == 0){
            head = Node(element)
            elementMap[element] = head
            tail = head
            size++
        }else{
            tail?.next = Node(element, prev = tail)
            tail = tail?.next
            elementMap[element] = tail
            size++
        }

        return this
    }

    fun remove(element: T): Boolean{
        val delNode: Node<T> = elementMap[element] ?: return false

        if(head == delNode) head = delNode.next
        if(delNode.next != null) delNode.next!!.prev = delNode.prev
        if(delNode.prev != null) delNode.prev!!.next = delNode.next
        return true
    }

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }
}