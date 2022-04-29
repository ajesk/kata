package ScoreResultsTally

import (
	"testing"
)

func TestSum(t *testing.T) {
	x := []int{350, 550, 650, 750, 899}

	results := TallyResults(x)
	t.Log(results)
	if len(results) != 4 {
		t.Errorf("Sum was incorrect, got: %d, want: %d.", len(results), 4)
	}
}
