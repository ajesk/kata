package graph

import (
	"testing"
)

func TestBasicStringSwap(t *testing.T) {
	testSwap := [][]int{{0, 1}}
	testString := "ab"
	res := smallestStringWithSwaps(testString, testSwap)

	if res != testString {
		t.Errorf("test should come back as %s, instead got %s", testString, res)
	}
}

func TestSingleSwapOnTwoCharString(t *testing.T) {
	testSwap := [][]int{{0, 1}}
	testString := "ba"
	res := smallestStringWithSwaps(testString, testSwap)
	expectedString := "ab"

	if res != expectedString {
		t.Errorf("test should come back as %s, instead got %s", expectedString, res)
	}
}
