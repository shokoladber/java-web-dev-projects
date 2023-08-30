package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void zeroBracketsReturnsTure(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void oddNumberofBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][]["));
    }

    @Test
    public void reversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

//    These strings have balanced brackets:
//            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//            *
//            * While these do not:
//            *   "[LaunchCode", "Launch]Code[", "[", "]["

}