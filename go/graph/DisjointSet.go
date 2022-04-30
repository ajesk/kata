package graph

type Element struct {
	parent *Element
	rank   int
	Data   interface{}
}

func NewElement() *Element {
	s := &Element{}
	s.parent = s
	return s
}

func (e *Element) Find() *Element {
	for e.parent != e {
		e.parent = e.parent.parent
		e = e.parent
	}
	return e
}

func Union(e1, e2 *Element) {
	e1Root := e1.Find()
	e2Root := e2.Find()
	if e1Root == e2Root {
		return
	}

	switch {
	case e1Root.rank < e2Root.rank:
		e1Root.parent = e2Root
	case e1Root.rank > e2Root.rank:
		e2Root.parent = e1Root
	default:
		e2Root.parent = e1Root
		e1Root.rank++
	}
}
