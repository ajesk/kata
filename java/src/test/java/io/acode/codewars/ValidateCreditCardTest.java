package io.acode.codewars;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class ValidateCreditCardTest {

    @Test
    public void testDoubleUp() {
        List<Integer> start = Arrays.asList(new Integer[] {1, 2, 3});
        List<Integer> end = ValidateCreditCard.doubleUp(start);
        assertThat(end.get(0)).isEqualTo(1);
        assertThat(end.get(1)).isEqualTo(4);
        assertThat(end.get(2)).isEqualTo(3);
    }

    @Test
    public void test891(){
        assertThat(ValidateCreditCard.validate("891")).isFalse();
    }

    @Test
    public void test123(){
        assertThat(ValidateCreditCard.validate("123")).isFalse();
    }

    @Test
    public void test91(){
        assertThat(ValidateCreditCard.validate("91")).isTrue();
    }

    @Test
    public void test922030(){
        assertThat(ValidateCreditCard.validate("922030")).isFalse();
    }

    @Test
    public void test8675309(){
        assertThat(ValidateCreditCard.validate("8675309")).isFalse();
    }

    @Test
    public void test2121(){
        assertThat(ValidateCreditCard.validate("2121")).isTrue();
    }

    @Test
    public void test26(){
        assertThat(ValidateCreditCard.validate("26")).isTrue();
    }

    @Test
    public void test1230(){
        assertThat(ValidateCreditCard.validate("1230")).isTrue();
    }

    @Test
    public void test92(){
        assertThat(ValidateCreditCard.validate("92")).isFalse();
    }

    @Test
    public void test1(){
        assertThat(ValidateCreditCard.validate("1")).isFalse();
    }

    @Test
    public void test2626262626262626(){
        assertThat(ValidateCreditCard.validate("2626262626262626")).isTrue();
    }

    @Test
    public void test912030(){
        assertThat(ValidateCreditCard.validate("912030")).isTrue();
    }

    @Test
    public void test4111111111111111(){
        assertThat(ValidateCreditCard.validate("4111111111111111")).isTrue();
    }
}
