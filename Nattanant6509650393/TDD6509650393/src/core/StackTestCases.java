package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase 
{
		//TC1
			public void testCreateNewEmptyStack() 
			{
				Stack tc1 = new Stack(10);
				assertEquals(true,tc1.isEmpty());
				
				assertEquals(0,tc1.getSize());
			}

		//TC2
	        public void testPushElmToTop() 
	        {
	            Stack tc2 = new Stack(10);
	            Object element = "TestElement";
	            try 
	            {
	                tc2.push(element);
	                assertEquals(false, tc2.isEmpty());
	                assertEquals(element, tc2.top());
	            } catch (Exception e) 
	            {
	                fail("Unexpected exception: " + e.getMessage());
	            }
	        }
	        
	    //TC3
	        public void testPushBeTheSameType() 
	        {
	            Stack tc3 = new Stack(10);

	            try 
	            {
	                tc3.push(10);
	                tc3.push(20);
	                tc3.push(30);
	                assertEquals(false, tc3.isEmpty());
	                assertEquals(30, tc3.top());

	                tc3.push("TestString");
	                fail("Expected exception not thrown");
	            } catch (Exception e) 
	            {
	                assertEquals("All elements in the stack must be of the same type", e.getMessage());
	            }
	        }
	      //TC4
	        public void testLastInFirstOut() 
	        {
	        	Stack tc4 = new Stack(4);
	        	try 
	        	{
					tc4.push(1);
					tc4.push(2);
					assertEquals(2, tc4.top());
					assertEquals(2, tc4.pop());
					assertEquals(1, tc4.pop());
				} catch (Exception e) 
	        	{
					fail("Unexpected exception: " + e.getMessage());
				}
	        	
	        }
	        
	        //TC5
	        public void testCapacity() 
	        {
	        	Stack tc5 = new Stack(3);
	        	
	        	try 
	        	{
					tc5.push(1);
					tc5.push(2);
					tc5.push(3);
					tc5.push(4);
					fail("Element Overflow (Stack size 5 but can add 6 Element)");
				} catch (Exception e) 
	        	{
					assertEquals("Stack is Full", e.getMessage());
				}
	        }
}
