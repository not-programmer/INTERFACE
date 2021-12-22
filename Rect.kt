class Rect(var x1: Int, var y1: Int, var width: Int, var height: Int) : Transforming, Figure(1) {

    override fun move(dx: Int, dy: Int) { x1 += dx; y1 += dy }

    override fun resize(zoom: Int) { width = zoom * width; height = zoom * height }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction) {
            RotateDirection.CLOCKWISE -> {
                y1 = centerY - (x1 - centerX)
                x1 = centerX + (y1 - centerY)
            }
            RotateDirection.COUNTERCLOCKWISE -> {
                y1 = centerY + (x1 - centerX)
                x1 = centerX - (y1 - centerY)
            }
        }
    }
}