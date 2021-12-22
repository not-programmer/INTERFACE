class Circle(var x3: Int, var y3: Int, var rad: Int) : Transforming, Figure(3) {

    override fun move(dx: Int, dy: Int) { x3 += dx; y3 += dy }

    override fun resize(zoom: Int) { rad = zoom * rad }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction) {
            RotateDirection.CLOCKWISE -> {
                y3 = centerY - (x3 - centerX)
                x3 = centerX + (y3 - centerY)
            }
            RotateDirection.COUNTERCLOCKWISE -> {
                y3 = centerY + (x3 - centerX)
                x3 = centerX - (y3 - centerY)
            }
        }
    }
}