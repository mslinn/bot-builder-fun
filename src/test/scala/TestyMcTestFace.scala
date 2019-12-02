import com.microsoft.bot.builder.{MessageFactory, TurnContextImpl}
import com.microsoft.bot.schema.Activity
import org.junit.Assert
import org.scalatest.Matchers._
import org.scalatest._

class TestyMcTestFace extends WordSpec with MustMatchers {
  "The code" should {
    "work" in {
      val activity: Activity = MessageFactory.text("hello")

      val turnContext = new TurnContextImpl(new NotImplementedAdapter(), activity)

      val bot = new TestActivityHandler
      bot.onTurn(turnContext).join

      Assert.assertEquals(1, bot.getRecord.size)
      Assert.assertEquals("onMessageActivity", bot.getRecord.get(0))
//      Assert.assertEquals("onMembersAdded", bot.getRecord.get(1))
    }
  }
}
