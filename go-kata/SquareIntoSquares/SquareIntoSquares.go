package main

import "fmt"

type stack []int64

func (s *stack) IsEmpty() bool {
	return len(*s) == 0
}

func (s *stack) Push(num int64) {
	*s = append(*s, num)
}

func (s *stack) Pop() (int64, bool) {
	if s.IsEmpty() {
		return -1, false
	}

	index := len(*s) - 1
	elem := (*s)[index]
	*s = (*s)[:index]
	return elem, true
}

func main() {
	fmt.Println(Decompose(11))
}

func Decompose(n int64) []int64 {
	var square int64 = n * n
	testNum := n - 1

	fmt.Println(square)
	var trial stack

	for {
		if target == 0 {
			break
		}
	}

	return trial
}
