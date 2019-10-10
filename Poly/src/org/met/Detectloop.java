package org.met;

public class Detectloop {
		
		public static void main(String[] args) {
			
		
		
		private static Node head;
		private static class Node{
			private int value;
			private Node next;
			
			Node(int value){
				this.value=value;
				
			}
			
			public void addtoList(Node node) {
				
				if(head==null) {
					
					head=node;

				}
				
				
				else {
				
					Node temp=head;
					while(temp.next!=null)
						
						temp=temp.next;
					temp.next=node;
					
					
				}
				}
			
			public void printList() {
				
				Node temp=head;
				while(temp.next!=null) {
					System.out.format("%d", temp.value);
					temp=temp.next;
					
				}
				
				System.out.println();
			}
		}
		
		
		
		}
		

}



