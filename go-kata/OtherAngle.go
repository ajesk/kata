package main

import "fmt"

func main() {
	fmt.Println(otherAngle(10, 20))
}

func otherAngle(a int, b int) int {
	return 180 - a - b
}
