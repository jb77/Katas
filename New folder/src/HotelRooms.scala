
// see https://github.com/holsee/HotelRoomsKata
object HotelRooms {

  def number(asciiArt: String): String = {

    val lines = asciiArt.lines.toList
    val longestLineLength = lines.maxBy { _.length }.length()
    val floors = lines.map(_.padTo(longestLineLength, ' ')).reverse // to get 1st floor as head of list
    val columns = (floors.transpose.map(_.mkString))
    val interestingColumns = columns.filter(col => col.contains('*') || !col.contains('#'))

    val buildingIndex = ((interestingColumns.indexWhere { _.contains('*') }) / 2) + 1 // 1-indexed
    val floorIndex = floors.indexWhere { _.contains('*') } + 1 // 1 indexed
    val floorWithRoom = floors.filter(_.contains('*')).head
    val absoluteRoomIndex = floorWithRoom.indexOf('*')
    val roomIndex = floorWithRoom.take(absoluteRoomIndex).reverse.takeWhile(c => c != ' ').length + 1 // 1-indexed

    buildingIndex.toString + floorIndex.toString + roomIndex.toString

  }

}