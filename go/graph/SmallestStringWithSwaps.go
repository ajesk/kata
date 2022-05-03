package graph

func smallestStringWithSwaps(s string, pairs [][]int) string {
	elements := make([]*Element, len(s))
	for i, v := range s {
		elements[i] = NewElement()
		elements.Data = i
	}

	for _, pair := range pairs {
		Union(elements[pair[0]], elements[pair[1]])
	}

	result := ""
	return result
}
