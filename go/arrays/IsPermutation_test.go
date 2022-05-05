package arrays

import (
	"testing"
)

func TestBasicPermutation(t *testing.T) {
	s1 := "a"
	s2 := "a"

	if !isPermutation(s1, s2) {
		t.Errorf("%s & %s should be a permutation but aren't", s1, s2)
	}
}

func TestBasicNonPermutation(t *testing.T) {
	s1 := "a"
	s2 := "b"

	if isPermutation(s1, s2) {
		t.Errorf("%s & %s should not be a permutation but are", s1, s2)
	}
}

func TestUnequalSizeNonPermutation(t *testing.T) {
	s1 := "a"
	s2 := "aa"

	if isPermutation(s1, s2) {
		t.Errorf("%s & %s should not be a permutation but are", s1, s2)
	}
}

func TestComplexPermutation(t *testing.T) {
	s1 := "gggabcdef"
	s2 := "abcdefggg"

	if !isPermutation(s1, s2) {
		t.Errorf("%s & %s should be a permutation but are not", s1, s2)
	}
}
