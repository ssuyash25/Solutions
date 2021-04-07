// LRU : Least Recently Used
class Node{
    constructor(value){
        this.value = value;
        this.next = this.previous = null;
    }
}
class LRU{
    constructor(size){
        this.maxSize = size;
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    push(value){
        if(this.length == this.maxSize){
            this.tail = this.tail.previous;
            this.tail.next = null;
        }
        const node = new Node(value);
        node.next = this.head;
        this.head.previous = node;
        this.head = node;
        return this.head;
    }

    get(value){
        
    }
}