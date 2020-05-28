import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {
	
	Password P1= new Password("Secret");
	Alphabet A1=new Alphabet(true,false,false,false);
	Alphabet A2=new Alphabet(false,true,true,true);
	Generator G1=new Generator(true,false,false,false);
	Password P2= G1.GeneratePassword(4);
	@Test
	void test1() {
		assertEquals("Secret",P1.toString());
	}

	@Test
	void test2() {
		assertEquals(A1.Pool,A1.UppercaseLetters);
	}

	@Test
	void test3() {
		assertEquals(A2.Pool,A2.LowercaseLetters+A2.Numbers+A2.Symbols);
	}
	
	@Test
	void test4() {
		assertEquals(G1.Alphabet.Pool,A1.UppercaseLetters);
	}
	
	@Test
	void test5() {
		assertEquals(G1.Alphabet.PoolSize,26);
	}
	
	
	@Test
	void test6() {
		assertEquals(P2.Length,4);
		System.out.println(P2);
	}
}
