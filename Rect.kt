class Rect(var x1: Int, var y1: Int, var width: Int, var height: Int) : Transforming, Figure(1) {

    override fun area1(): Float { return (width*height).toFloat() }

    override fun move(dx: Int, dy: Int) {
        x1 += dx
        y1 += dy
        println("Координаты перемещённого прямоугольника - ($x1, $y1)")
    }

    override fun resize(zoom: Int) {
        width = zoom * width
        height = zoom * height
        println("Новые размеры прямоугольника: ширина = $width, высота = $height")
    }

    override fun area2(): Float { return (width*height).toFloat() }

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
        println("Координаты повёрнутого вокруг точки прямоугольника - ($x1, $y1)")
    }
}