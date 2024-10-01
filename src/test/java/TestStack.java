import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStack {
	
	
	@Test
	void testPushandTop() {
		MyStack<String> S = new MyStack<>();
		assertThrows(StackUnderFlowException.class, () -> {
            S.top();
        });
		S.push("A");
		assertEquals("A", S.top());
		S.push("B");
		assertEquals("B", S.top());
	}
	
	@Test
	void testPop() {
		MyStack<String> S = new MyStack<>();
		assertThrows(StackUnderFlowException.class, () -> {
            S.pop();
        });
		S.push("A");
		S.push("B");
		assertEquals("B", S.pop());
		assertEquals("A", S.top());
		assertEquals("A", S.pop());
		assertThrows(StackUnderFlowException.class, () -> {
            S.pop();
        });
	}
	
	@Test
	void testisEmpty() {
		MyStack<String> S = new MyStack<>();
		assertTrue(S.isEmpty());
		S.push("A");
		assertFalse(S.isEmpty());
	}

}
