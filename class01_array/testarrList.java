package class1_array;

public class testarrList {
	public static void main(String[] args){
		arrList array=new arrList();
		System.out.println(array.isEmpty());
		System.out.println(array.currSize());
		array.insertElement("a");
		System.out.println(array.currSize());
		array.insertElement("b");
		System.out.println(array.currSize());
		array.insertElement("c");
		System.out.println(array.currSize());
		array.insertElenmentAT(2, "ddd");
		System.out.println(array.currSize());
		array.printList();
		System.out.println(array.currSize());
		array.remove(3);
		array.printList();
		System.out.println(array.isEmpty());
		System.out.println(array.maxSize());
		
	}

}
