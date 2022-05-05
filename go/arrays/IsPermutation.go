package arrays

import "reflect"

func isPermutation(s1 string, s2 string) bool {
	s1Mapping := make(map[rune]int)
	s2Mapping := make(map[rune]int)

	if len(s1) != len(s2) {
		return false
	}

	for _, v := range s1 {
		s1Mapping[v]++
	}

	for _, v := range s2 {
		s2Mapping[v]++
	}

	return reflect.DeepEqual(s1Mapping, s2Mapping)
}
