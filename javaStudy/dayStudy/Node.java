package javaStudy.dayStudy;

public class Node {
	private Node beforeNode;
	private Node afterNode;
	private String value;
	
	
	public Node(String value) {
		this.value = value;
	}

	public Node getBeforeNode() {
		return beforeNode;
	}

	public void setBeforeNode(Node beforeNode) {
		this.beforeNode = beforeNode;
	}

	public Node getAfterNode() {
		return afterNode;
	}

	public void setAfterNode(Node afterNode) {
		this.afterNode = afterNode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void InsertBefore(Node targetNode) {
		if(this.beforeNode!=null) {
			beforeNode.afterNode = targetNode;
			targetNode.beforeNode=this.getBeforeNode();
			targetNode.afterNode = this;
			this.beforeNode=targetNode;
		}else {
			beforeNode=targetNode;
		}
	}
}
