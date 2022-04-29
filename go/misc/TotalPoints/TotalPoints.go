// Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.

// For example: ["3:1", "2:2", "0:1", ...]

// Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:

// if x>y - 3 points
// if x<y - 0 point
// if x=y - 1 point
// Notes:

// there are 10 matches in the championship
// 0 <= x <= 4
// 0 <= y <= 4
package main

import (
	"strconv"
	"strings"
)

func main() {

}

func Points(games []string) (totes int) {
	totes = 0
	for _, game := range games {
		scores := strings.Split(game, ":")
		us, _ := strconv.Atoi(scores[0])
		them, _ := strconv.Atoi(scores[1])
		if us > them {
			totes += 3
		} else if us == them {
			totes++
		}
	}
	return totes
}
