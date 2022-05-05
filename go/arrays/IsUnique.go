package arrays

func isUnique(str string) bool {
	found := make(map[rune]bool)

	for _, v := range str {
		if found[v] {
			return false
		}
		found[v] = true
	}
	return true
}
