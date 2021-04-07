class Node {
    constructor(val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        this.root = null;
    }

    // Inserts a new unique value in the BST
    insert(val) {
        const newNode = new Node(val);
        if (this.root == null) {
            this.root = newNode;
        }
        else {
            let root = this.root;
            let prev = null;
            while (root != null) {      //find correct position for insertion
                if (root.value === val) return undefined; // Handle Duplicates
                prev = root;
                root = val > root.value ? root.right : root.left;
            }
            if (val > prev.value)
                prev.right = newNode;
            else
                prev.left = newNode;
        }
        return this;
    }

    //find if the value is present in the BST
    find(val) {
        if (this.root != null) {
            let current = this.root;
            while (current != null) {
                if (current.value === val) return current;
                current = val > current.value ? current.right : current.left;
            }
        }
        return false;
    }

    printLeftView(root){
        if(root == null) 
        return;
        console.log(root.value)
        if(root.left){
            this.printLeftView(root.left)
        }
        if(root.right){
            this.printLeftView(root.right.left)
        }
    }

    printRightView(root){
        if(root == null) 
        return;
        console.log(root.value)
        if(root.right){
            this.printRightView(root.right)
        }
        if(root.left){
            this.printRightView(root.left.right)
        }
    }
}



let bst = new BST()

bst.insert(10)
bst.insert(2)
bst.insert(3)
bst.insert(7)
bst.insert(8)
bst.insert(15)
bst.insert(12)
bst.insert(14)

//bst.printLeftView(bst.root);
bst.printRightView(bst.root);