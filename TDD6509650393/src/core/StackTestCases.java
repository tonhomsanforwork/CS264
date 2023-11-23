package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase 
{
	//TC1
			public void testCreateNewEmptyStack() 
			{
				Stack s1 = new Stack(10);
				assertEquals(true,s1.isEmpty());
				
				assertEquals(0,s1.getSize());
			}

		//TC2
	        public void testPushandTop() 
	        {
	            Stack s2 = new Stack(10);
	            Object element = "TestElement";
	            try 
	            {
	                s2.push(element);
	                assertEquals(false, s2.isEmpty());
	                assertEquals(element, s2.top());
	            } catch (Exception e) 
	            {
	                fail("Unexpected exception: " + e.getMessage());
	            }
	        }
	        
	    //TC3
	        public void testPushMustBeSameType() 
	        {
	            Stack s3 = new Stack(10);

	            try 
	            {
	                s3.push(100);
	                s3.push(200);
	                s3.push(300);
	                assertEquals(false, s3.isEmpty());
	                assertEquals(300, s3.top());

	                s3.push("TestString");
	                fail("Expected exception not thrown");
	            } catch (Exception e) 
	            {
	                assertEquals("All elements in the stack must be of the same type", e.getMessage());
	            }
	        }
}
