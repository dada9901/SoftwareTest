package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

	@Test
	public void testMulti() {
		assertEquals(1,new Number().multi(0));
	}

	@Test
	public void testGete() {
		assertEquals(1,new Number().multi(0));
	}

	@Test
	public void testGetfeb() {
		assertEquals(1,new Number().getfeb(0));
	}

	@Test
	public void testIssushu() {
		fail("Not yet implemented");
	}

	/*@Test
	public void testAdd(){
		assertEquals(6,new Calculate().add(3, 3));
	}
	
	@Test
	public void testsubstract(){
		assertEquals(2,new Calculate().substract(5, 3));
	}
	
	@Test
	public void testcheng(){
		assertEquals(15,new Calculate().cheng(5, 3));
	}
	@Test
	public void testchu(){
		assertEquals(2,new Calculate().chu(6, 3));
	}*/

}
