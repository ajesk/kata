package io.acode.leetcode;

import io.acode.util.TestUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

/**
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of
 * substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 * (order does not matter).
 */
public class SubstringWithMultipleWordsTest extends TestUtils {
    private SubstringWithMultipleWords swmw = new SubstringWithMultipleWords();

    @Test
    public void testGetDots() {
        assertThat(swmw.getDots(3)).isEqualTo("...");
        assertThat(swmw.getDots(10)).isEqualTo("..........");
        assertThat(swmw.getDots(1)).isEqualTo(".");
    }

    @Test
    public void testGetSlices() {
        assertThat(swmw.getSlices("barfoothefoobarman", 3))
                .isEqualTo(new String[]{"bar", "foo", "the", "foo", "bar", "man"});
        assertThat(swmw.getSlices("barfoothefoobarman", 6))
                .isEqualTo(new String[]{"barfoo", "thefoo", "barman"});
        assertThat(swmw.getSlices("barfoothefoobarman", 9))
                .isEqualTo(new String[]{"barfoothe", "foobarman"});
    }

    @Test
    public void testFindSubstring() {
        //System.out.println(Arrays.toString(swmw.findSubstring("barfoothefoobarman", new String[]{"bar", "foo"}).toArray()));

        //System.out.println(Arrays.toString(swmw.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}).toArray()));

        System.out.println(Arrays.toString(swmw.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake",
                new String[]{"fooo","barr","wing","ding","wing"}).toArray()));
    }
}
