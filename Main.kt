import Rect as Rect
import Circle as Circle
import Square as Square

fun main() {
    val rect: Transforming = Rect(0, 0, 2, 4)
    rect.move(2,1)
    rect.resize(2)
    rect.rotate(RotateDirection.CLOCKWISE, 8, 2)
    val square: Transforming = Square(3,2,3)
    square.move(10,5)
    square.resize(1)
    square.rotate(RotateDirection.COUNTERCLOCKWISE, 3, 3)
    val circle: Transforming = Circle(5, 1, 2)
    circle.move(4,11)
    circle.resize(3)
    circle.rotate(RotateDirection.CLOCKWISE, 13, 9)
}