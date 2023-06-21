package tree;

public class Node {

	private char value;
    private Node leftNodeTree;
    private Node rightNodeTree;

    public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public Node getLeftNode() {
        return leftNodeTree;
    }

    public void setLeftNode(Node leftNodeTree) {
        this.leftNodeTree = leftNodeTree;
    }

    public Node getRightNode() {
        return rightNodeTree;
    }

    public void setRightNode(Node rightNodeTree) {
        this.rightNodeTree = rightNodeTree;
    }

    public Node(char value) {
        this.value = value;
        this.leftNodeTree = null;
        this.rightNodeTree = null;
    }
}
