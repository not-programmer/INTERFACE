interface Transforming {
    fun area1(): Float
    fun area2(): Float
    fun move(dx: Int, dy: Int)
    fun resize(zoom: Int)
    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
}

enum class RotateDirection { CLOCKWISE, COUNTERCLOCKWISE }
