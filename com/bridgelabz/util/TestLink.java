/******************************************************************************
 *  Compilation:  javac -d . tsetLinkjava
 *  
 *  Purpose: To perform list operation
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   05-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
class Node <E>{

	E data;
	Node link;
	Node() {
		//data=0;
		link=null;
		//System.out.print(data); output=null
	}
	Node(E val,Node l) {
		data=val;
		link=l;
	}



}
class List <E>{
	Node start;
	List() {
		start=null;
	}
	public void add (E val) {
		Node<E> ref=new Node<E>();
		Node<E> reference=new Node<E>(val,null);
		if(start==null)
			start=reference;
		else {
		Node temp=start;
			while(temp.link!=null) {
			
				temp=temp.link;
				
			}
			temp.link=reference;
		
		}
	
	
	
	}
	public void display() {
	
	if(start==null) {
		System.out.println("Impossible");
		return;
	}
		if(start.link==null) {
			System.out.print(start.data+" ->");
			return;
		}
		else
		{
			Node temp=start;
			temp=temp.link;
			//System.out.print(temp.data+" ->");
			while(temp.link!=null) {
				System.out.print(temp.data+" ->");
				temp=temp.link;
		
			}
				System.out.print(temp.data+" \n");
		}
	
	}






}
public class TestLink {
	public static void main(String[] args) {
	
	//List<Integer> ls=new List<Integer>();
	List<String> ls=new List<String>();
	ls.display();
	//ls.add(5);
	//ls.add(new Integer(5));
	ls.add(new String("hello"));
	ls.display();
	//ls.add(6);
	//ls.add(4);
	ls.add("in govandi ^)");
	ls.display();
	
	}
}
