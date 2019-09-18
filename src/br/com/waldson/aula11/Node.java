package br.com.waldson.aula11;

public class Node {
    private Node left;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }
    public Node remove(Node temp){
        if(this.getValue() == temp.getValue()){
            if(this.getLeft() == null && this.getRight() == null){
                return null;
            }else{
                if(this.getRight() != null && this.getLeft() == null){
                    return this.getRight();
                }else if(this.getLeft() != null && this.getRight() ==   null ) {
                    return this.getLeft();
                }else{
                    if(this.left != null && this.right != null){
                        Node _aux = this.getLeft();
                        while(_aux.getRight() != null){
                            _aux = _aux.getRight();
                        }
                        int temp_value = this.getValue();
                        this.value = _aux.getValue();
                        _aux.value = temp_value;
                        this.left = this.getLeft().remove(temp);
                    }
                }

            }
        }else if(this.getValue() < temp.getValue()){
            this.left = this.left.remove(temp);

        }else if(this.getValue() > temp.getValue()){
            this.right = this.right.remove(temp);
        }
        return this;
    }

    public void print(){
        System.out.println(this.getValue());
        if(this.left != null){
            this.left.print();
        }
        if(this.right != null){
            this.right.print();
        }

    }
}
