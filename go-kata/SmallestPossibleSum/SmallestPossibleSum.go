package main

import (
	"fmt"
)

func main() {
	x := []int{11, 22}

	fmt.Println(Solution(x))
}

func Solution(ar []int) (sum int) {
	set := make(map[int]bool)
	for _, val := range ar {
		set[val] = true
	}

	for !areAllEqual(set) {
		var largest, secondLargest int

		for k := range set {
			if k > largest {
				secondLargest = largest
				largest = k
			} else if k > secondLargest {
				secondLargest = k
			}
		}

		set[largest-secondLargest] = true
		delete(set, largest)
	}

	sum = 0
	for k := range set {
		sum = k * len(ar)
	}
	return sum
}

func areAllEqual(ar map[int]bool) bool {
	var last int = 0
	for k := range ar {
		if last != 0 {
			if last != k {
				return false
			}
		}
		last = k
	}

	return true
}
