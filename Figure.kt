abstract class Figure(val id: Int) {
    abstract fun move (dx: Int, dy: Int)
    abstract fun resize (zoom: Int)
    abstract fun rotate (direction: RotateDirection, centerX: Int, centerY: Int)
}