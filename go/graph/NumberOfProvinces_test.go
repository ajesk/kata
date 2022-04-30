package graph

import (
	"testing"
)

func TestBasicNumberOfProvinces(t *testing.T) {
	test := [][]int{{1}}
	res := findCircleNum(test)

	if res != 1 {
		t.Errorf("there should only be a single element, found %d", res)
	}
}

func TestThereShouldBeTwoProvincesWhenTwoCitiesNotConnected(t *testing.T) {
	test := [][]int{
		{1, 0},
		{0, 1},
	}

	res := findCircleNum(test)
	if res != 2 {
		t.Errorf("there should be 2 provinces only found %d", res)
	}
}

func TestThreeUnconnectedCities(t *testing.T) {
	test := [][]int{
		{1, 0, 0},
		{0, 1, 0},
		{0, 0, 1},
	}

	res := findCircleNum(test)
	if res != 3 {
		t.Errorf("there should be 3 provinces only found %d", res)
	}
}

func TestTwoConnectedCitiesShouldGiveOneProvince(t *testing.T) {
	test := [][]int{
		{1, 1},
		{1, 1},
	}

	res := findCircleNum(test)
	if res != 1 {
		t.Errorf("there should be 1 provinces only found %d", res)
	}
}

func TestShouldProvideTwoProvincesWhenThereAreTwoGroupsOfCities(t *testing.T) {
	test := [][]int{
		{1, 1, 0, 0},
		{1, 1, 0, 0},
		{0, 0, 1, 1},
		{0, 0, 1, 1},
	}

	res := findCircleNum(test)
	if res != 2 {
		t.Errorf("there should be 2 provinces only found %d", res)
	}
}
