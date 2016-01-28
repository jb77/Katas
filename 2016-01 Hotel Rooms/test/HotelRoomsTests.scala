import org.junit._
import org.junit.Assert._

class HotelRoomsTests {

  @Test
  def testOneRoomHotel {
    assertEquals("111", HotelRooms.number("*"))
  }

  @Test
  def testAirBnB {
    assertEquals("311", HotelRooms.number("#  #  *  #  #"))
  }

  @Test
  def holidayInn {
    val input = """#####
                  |#####
                  |####*
                  |#####
                  |#####""".stripMargin
    assertEquals("135", HotelRooms.number(input))

  }

  @Test
  def tricky {
    val input = """           #
                  |           *
                  |           #
                  |           #
                  |           #
                  |           #
                  |           #
                  |           #
                  |#########  #  #""".stripMargin
    assertEquals("281", HotelRooms.number(input))
  }
  
  @Test
  def others {
    val input = """         #####
                  |         #####           ######
                  |         #####           ######
                  |#  #  #  #####  #  #  #  ######  *""".stripMargin
    assertEquals("911", HotelRooms.number(input))
    
    val i2 = """#
               |#  #
               |#  #  ##
               |#  #  ##  ###
               |#  #  ##  ###  #####
               |#  #  ##  ###  ##*##  ########
               |#  #  ##  ###  #####  ########""".stripMargin
    assertEquals("523", HotelRooms.number(i2))
    
   val i3 = """                        ########*
              |                        #########
              |                        #########
              |                        #########
              |                        #########
              |                        #########
              |                        #########
              |                        #########
              |#  #  #  #  #  #  #  #  #########""".stripMargin 
   assertEquals("999", HotelRooms.number(i3))
    
  }

}