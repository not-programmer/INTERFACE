abstract class Figure(val id: Int) {
    abstract fun area1(): Float
    abstract fun area2(): Float
    abstract fun move (dx: Int, dy: Int)
    abstract fun resize (zoom: Int)
    abstract fun rotate (direction: RotateDirection, centerX: Int, centerY: Int)
}