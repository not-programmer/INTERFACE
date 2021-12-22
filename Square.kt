class Square(var x2: Int, var y2: Int, var height: Int): Transforming, Figure(2) {

    override fun move(dx: Int, dy: Int) { x2 += dx; y2 += dy }

    override fun resize(zoom: Int) { height = zoom * height }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction) {
            RotateDirection.CLOCKWISE -> {
                y2 = centerY - (x2 - centerX)
                x2 = centerX + (y2 - centerY)
            }
            RotateDirection.COUNTERCLOCKWISE -> {
                y2 = centerY + (x2 - centerX)
                x2 = centerX - (y2 - centerY)
            }
        }
    }
}
