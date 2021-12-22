class Circle(var x3: Int, var y3: Int, var rad: Int) : Transforming, Figure(3) {

    override fun area1(): Float { return (3.14*rad*rad).toFloat() }

    override fun move(dx: Int, dy: Int) {
        x3 += dx
        y3 += dy
        println("Координаты перемещённого круга - ($x3, $y3)")
    }

    override fun resize(zoom: Int) {
        rad = zoom * rad
        println("Новый размер круга: радиус = $rad")
    }

    override fun area2(): Float { return (3.14*rad*rad).toFloat() }

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
        println("Координаты повёрнутого вокруг точки круга - ($x3, $y3)")
    }
}