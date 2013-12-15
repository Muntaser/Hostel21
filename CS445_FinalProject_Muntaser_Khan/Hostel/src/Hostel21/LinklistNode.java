package Hostel21;


// --------------------------------------------------------------------------------------------------------
//CS445 - Fall 2013 - Project  - Submitted by Student: Muntaser Khan email:mkhan12@iit.edu
// --------------------------------------------------------------------------------------------------------

public class LinklistNode {
	
	protected
		Object			element; // link list element
		LinklistNode	prev; // previous link
		LinklistNode	next; // next link
		
	public
		LinklistNode() // constructor
		{
			element = null;
			prev = null;
			next = null;
		}
	
		LinklistNode(Object element) // constructor
		{
			this.element = element;
			prev = null;
			next = null;
		}
	
		LinklistNode	getPrev()
		{
			return prev;
		}
		
		void		setPrev(LinklistNode newPrev)
		{
			prev = newPrev;
		}
		
		LinklistNode	getNext()
		{
			return next;
		}
		
		void		setNext(LinklistNode newNext)
		{
			next = newNext;
		}
		
		Object	getElement()
		{
			return element;
		}
		
		void		setElement(Object newElement)
		{
			element = newElement;
		}
		
		

}
