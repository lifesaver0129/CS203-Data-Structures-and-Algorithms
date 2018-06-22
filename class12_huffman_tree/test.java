package Exercise12;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Huffman hTree=new Huffman();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = input.nextLine();
		hTree.getCharacterFrequency(text);
		hTree.getHuffmanTree();
		//hTree.assignCode(hTree.getRoot());
		hTree.assignCode();
		hTree.printHuffman();
		input.close();
	}

}
