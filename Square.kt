class Square(var x2: Int, var y2: Int, var height: Int): Transforming, Figure(2) {

    override fun area1(): Float { return (height*height).toFloat() }

    override fun move(dx: Int, dy: Int) {
        x2 += dx
        y2 += dy
        println("Координаты перемещённого квадрата - ($x2, $y2)")
    }

    override fun resize(zoom: Int) {
        height = zoom * height
        println("Новый размер стороны квадрата: длина = $height")
    }

    override fun area2(): Float { return (height*height).toFloat() }

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
        println("Координаты повёрнутого вокруг точки квадрата - ($x2, $y2)")
    }
}
