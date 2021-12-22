interface Transforming {
    fun move(dx: Int, dy: Int)
    fun resize(zoom: Int)
    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
}

enum class RotateDirection { CLOCKWISE, COUNTERCLOCKWISE }
