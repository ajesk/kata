package arrays

import (
	"testing"
)

func TestBasicUnique(t *testing.T) {
	test := "a"

	if !isUnique(test) {
		t.Errorf("%s should be unique but isn't", test)
	}
}

func TestBasicNonUnique(t *testing.T) {
	test := "aa"

	if isUnique(test) {
		t.Errorf("%s should not be unique but is", test)
	}

}

func TestLargeUnique(t *testing.T) {
	test := "abcdefghijklmnopqrstuvwxyz"

	if !isUnique(test) {
		t.Errorf("%s should be unique but isn't", test)
	}
}
func TestLargeNonUnique(t *testing.T) {
	test := "aqwertyuioplkjhgfdszxcvbnma"

	if isUnique(test) {
		t.Errorf("%s should not be unique but is", test)
	}
}
