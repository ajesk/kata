package graph

import (
	"testing"
)

func TestTwoUnconnectedNodes(t *testing.T) {
	elem1 := NewElement()
	elem2 := NewElement()

	if elem1.Find() == elem2.Find() {
		t.Errorf("elements should not be joined")
	}
}

func TestTwoConnectedNodes(t *testing.T) {
	elem1 := NewElement()
	elem2 := NewElement()

	Union(elem1, elem2)

	if elem1.Find() != elem2.Find() {
		t.Errorf("elements should be joined")
	}
}

func TestDifferingTrees(t *testing.T) {
	elem1 := NewElement()
	elem2 := NewElement()
	elem3 := NewElement()
	elem4 := NewElement()

	Union(elem1, elem2)
	Union(elem2, elem3)

	if elem1.Find() == elem4.Find() {
		t.Errorf("elements should be joined")
	}

	if elem2.Find() == elem4.Find() {
		t.Errorf("elements should be joined")
	}

	if elem3.Find() == elem4.Find() {
		t.Errorf("elements should be joined")
	}

}
