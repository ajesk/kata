package ScoreResultsTally

import (
	"fmt"
)

func TallyResults(scores []int) []string {

	scoreResults := make(map[string]int)
	for _, val := range scores {
		result := scoreResultString(val)
		count, pres := scoreResults[result]
		if pres {
			scoreResults[result] = count + 1
		} else {
			scoreResults[result] = 1
		}
	}
	return returnResults(scoreResults, len(scores))
}

func scoreResultString(score int) string {
	if score >= 300 && score < 500 {
		return "Poor"
	} else if score >= 500 && score < 600 {
		return "Fair"
	} else if score >= 600 && score < 750 {
		return "Good"
	} else if score >= 750 && score < 900 {
		return "Great"
	}
	return "What"
}

func returnResults(scoreTally map[string]int, total int) []string {
	var scoreResults []string
	for k, v := range scoreTally {
		scoreResults = append(scoreResults, k+": "+fmt.Sprintf("%.2f", float64(v)*100.00/float64(total))+"%")
	}
	return scoreResults
}
