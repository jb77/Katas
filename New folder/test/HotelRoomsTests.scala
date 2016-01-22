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
#####
####*
#####
#####"""
    assertEquals("135", HotelRooms.number(input))

  }

  @Test
  def tricky {
    val input = """           #
           *
           #
           #
           #
           #
           #
           #
#########  #  #"""
    assertEquals("281", HotelRooms.number(input))
  }
  
  @Test
  def others {
    val input = """         #####
         #####           ######
         #####           ######
#  #  #  #####  #  #  #  ######  *"""
    assertEquals("911", HotelRooms.number(input))
    
    val i2 = """#
#  #
#  #  ##
#  #  ##  ###
#  #  ##  ###  #####
#  #  ##  ###  ##*##  ########
#  #  ##  ###  #####  ########"""
    assertEquals("523", HotelRooms.number(i2))
    
   val i3 = """                        ########*
                        #########
                        #########
                        #########
                        #########
                        #########
                        #########
                        #########
#  #  #  #  #  #  #  #  #########""" 
   assertEquals("999", HotelRooms.number(i3))
    
  }

}