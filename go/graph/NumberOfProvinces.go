package graph

func findCircleNum(isConnected [][]int) int {
	cities := make(map[int]*Element)

	for i := 0; i < len(isConnected); i++ {
		for x := 0; x < len(isConnected[i]); x++ {
			if cities[x] == nil {
				cities[x] = NewElement()
			}

			if isConnected[i][x] == 1 {
				Union(cities[i], cities[x])
			}
		}
	}

	provinces := make(map[*Element]bool)

	for _, city := range cities {
		provinces[city.Find()] = true
	}

	return len(provinces)
}
