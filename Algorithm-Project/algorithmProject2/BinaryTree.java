package algorithmProject2;

public class BinaryTree<K, V> {
	static class Node<K, V>{
		private K key;
		private V data;
		private Node<K,V> left;
		private Node<K,V> right;
		
		Node(K key, V data, Node<K,V> left, Node<K,V> right) {
			this.key=key;
			this.data=data;
			this.left=left;
			this.right=right;
		}
		K getKey() {
			return key;
		}

		V getValue() {
			return data;
		}

		void print() {
			System.out.println(data);
		}
		
	}//Node
	
	private Node<K,V> root;//루트노드
	
	BinaryTree(){
		root = null;//루트노드초기화
	}
	
	public int comp(K key1, K key2) {
		return ((Comparable<K>)key1).compareTo(key2);
	}
	
	//노드추가
	public void addNode(Node<K,V> node, K key, V data) {
		int result = comp(key, node.getKey());
		if(result==0) {
			return;
		} else if(result<0) {
			if(node.left==null) {
				node.left = new Node<K,V>(key,data,null,null);
			}else {
				addNode(node.left, key, data);
			}
		} else {
			if(node.right==null) {
				node.right = new Node<K,V>(key,data,null,null);
			}else {
				addNode(node.right, key, data);
			}
		}
	}
	
	//노드추가
	public void add(K key, V data) {
		if(root==null) {
			root = new Node<K,V>(key, data, null, null);
		} else {
			addNode(root, key, data);
		}
	}
	
	//노드삭제
	public boolean remove(K key) {
		Node<K, V> point = root;
		Node<K, V> parent = null;
		boolean isLeftChild = true;
		
		while(true) {
			if(point==null){
				return false;
			}
			
			//삭제할 노드 찾기
			int cond = comp(key, point.getKey());
			
			if(cond==0) {
				break;
			}else {
				parent = point;
				if(cond<0) {
					point = point.left;
					isLeftChild = true;
				}else {
					point = point.right;
					isLeftChild = false;
				}
			}
		}

		if(point.left == null) {
			if(point==root) {
				root = point.right;
			}else if(isLeftChild) {
				parent.left = point.right;
			}else {
				parent.right = point.right;
				
			}
		}else if(point.right==null) {
			if(point==root) {
				root = point.left;
			}else if(isLeftChild) {
				parent.left = point.left;
			}else {
				parent.right = point.right;
			}
		}else {
			parent = point;
			Node<K,V> maxNode = point.left;
			isLeftChild = true;
			while(maxNode.right!=null) {
				parent = maxNode;
				maxNode = maxNode.right;
				isLeftChild = false;
			}
			
			point.key = maxNode.key;
			point.data = maxNode.data;
			
			if(isLeftChild) {
				parent.left = maxNode.left;
			}else {
				parent.right = maxNode.left;
			}
		}

		System.out.println("상품 삭제 완료");
		System.out.println();
		return true;
	}

	public V search(K key) {
		Node<K,V> point = root; 
		
		while(true) {
			if(point == null) {
				return null;
			}

			int result = comp(point.getKey() , key);
			if(result==0) {
				return point.getValue();
			}else if(result>0) {
				point = point.left;
			}else {
				point = point.right;
			}
		}
	}
	
	public void subNodePrint(Node node) {
		if(node!=null) {
			subNodePrint(node.left);
			System.out.println(node.getKey() +" "+ node.data);
			subNodePrint(node.right);
		}
	}

	public void print() {
		if(root==null) {
			System.out.println();
			System.out.println("등록된 상품이 없습니다.");
			System.out.println();
		}else {
			subNodePrint(root);
			System.out.println();
		}
	}
}