// You get an array of numbers, return the sum of all of the positives ones.

// Example [1,-4,7,12] => 1 + 7 + 12 = 20

// Note: if there is nothing to sum, the sum is default to 0.
package main

import "fmt"

func main() {
	fmt.Println(sumOfPositives([]int{3, 5, -1, 6}))
}

func sumOfPositives(numbers []int) (out int) {
	out = 0

	for i := range numbers {
		if numbers[i] > 0 {
			out = numbers[i] + out
		}
	}

	return out
}
