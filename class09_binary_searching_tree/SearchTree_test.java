package class9_binary_searching_tree;

public class SearchTree_test {
	public static void main(String[] args){
		SearchTree m=new SearchTree(23);
		int []a={35,17,18,15,22,60,51,88,93};
		m.insert(a, m);
		m.retrieve(m.root);
		System.out.println();
		System.out.println(m.find(1, m.root));
		System.out.println(m.find(23, m).getData());
		m.insert(44, m);   
		m.retrieve(m.root);
		System.out.println();
		m.delete(51, m);
		m.retrieve(m.root);
	}

	
}
