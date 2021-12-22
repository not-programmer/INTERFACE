fun main() {
    val rect: Transforming = Rect(0, 0, 2, 4)
    println("Начальные координаты центра прямоугольника - (0, 0), ширина - 2, высота - 4, площадь данного прямоугольника = ${rect.area1()}")
    rect.move(2,1)
    rect.resize(2)
    println("Площадь прямоугольника с новыми размерами = ${rect.area2()}")
    rect.rotate(RotateDirection.CLOCKWISE, 8, 2)
    println()
    val square: Transforming = Square(3,2,3)
    println("Начальные координаты центра квадрата - (3, 2), длина стороны = 3, площадь данного квадрата = ${square.area1()}")
    square.move(10,5)
    square.resize(5)
    println("Площадь квадрата с новыми размерами = ${square.area2()}")
    square.rotate(RotateDirection.COUNTERCLOCKWISE, 3, 3)
    println()
    val circle: Transforming = Circle(5, 1, 2)
    println("Начальные координаты центра круга - (5, 1), радиус = 2, площадь данного круга = ${circle.area1()}")
    circle.move(4,11)
    circle.resize(3)
    println("Площадь круга с новыми размерами = ${circle.area2()}")
    circle.rotate(RotateDirection.CLOCKWISE, 13, 9)
}

// Когда фигуры вращаются вокруг заданной точки, их начальные координаты центров равны не тем,
// которые заданы изначально, а тем, которые получились после перемещения фигур