package tree;

public class TreeTins {

	private Node rootNode = null;

    public boolean isEmpty() {
        return rootNode == null;
    }
    
    public void posOrder() {

		posOrder(rootNode);
	}

	private void posOrder (Node subRoot) {

		if (subRoot == null)
			return;

		posOrder(subRoot.getLeftNode());
		posOrder(subRoot.getRightNode());
		System.out.println(subRoot.getValue());
	}

	public void preOrder() {

		preOrder(rootNode);
	}

	private void preOrder (Node subRoot) {

		if (subRoot == null)
			return;

		System.out.println(subRoot.getValue());
		preOrder(subRoot.getLeftNode());
		preOrder(subRoot.getRightNode());
	}

	public void inOrder() {

		inOrder(rootNode);
	}

	private void inOrder(Node subRoot) {

		if (subRoot == null)
			return;

		inOrder(subRoot.getLeftNode());
		System.out.println(subRoot.getValue());
		inOrder(subRoot.getRightNode());
	}
	
	public void add(char value) {

		addNode(value, rootNode);
	}
	
	private void addNode(char value, Node subRoot) {
		
		if (isEmpty()) {
			
			if (value != '+' && value != '-' && value != '*' && value != '/')
				System.out.println("Deve começar inserindo um operador");
			
			else
				rootNode = new Node(value);
		}
		
		else {
			
			if (value == '*' || value == '/' || value == '+' || value == '-') {
				
				if (subRoot.getLeftNode() == null)
					subRoot.setLeftNode(new Node(value));

				else
					addNode(value, subRoot.getLeftNode());
			}
			
			else {
				
				if (subRoot.getLeftNode() == null)
					subRoot.setLeftNode(new Node(value));
				
				else if (subRoot.getRightNode() == null)
					subRoot.setRightNode(new Node(value));
				
				else {
					
					if (subRoot.getLeftNode().getValue() == '*' || subRoot.getLeftNode().getValue() == '/' || subRoot.getLeftNode().getValue() == '+' || subRoot.getLeftNode().getValue() == '-')
						addNode(value, subRoot.getLeftNode());
						
					else
						System.out.println("Não pode inserir um número sem inserir um operador antes");
				}
			}
		}
	}
	
	public Integer resolverExpressao() {
		
		return resolverExpressao(rootNode);
	}
	
	private Integer resolverExpressao(Node subRoot) {
		
		if (subRoot == null) {
			
			System.out.println("Expressão vazia");
			return null;
		}
		
		else {
			
			if (subRoot.getLeftNode() == null && subRoot.getRightNode() == null) {
				
				return Character.getNumericValue(subRoot.getValue());
			}
			
			Integer esquerda = resolverExpressao(subRoot.getLeftNode());
			
			Integer direita = resolverExpressao(subRoot.getRightNode());
			
			switch (subRoot.getValue()) {
			
				case '+':
					
					return esquerda + direita;
				
				case '-':
					
					return esquerda - direita;
					
				case '*':
					
					return esquerda * direita;
					
				case '/':
					
					return esquerda / direita;
					
				default:
					
					System.out.println("Operação falhou");
					return null;
			}
		}
	}
}
