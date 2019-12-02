class BotHandler extends com.microsoft.bot.builder.ActivityHandler {
  import java.util.concurrent.CompletableFuture
  import java.util.{List => JList}
  import com.microsoft.bot.builder.{MessageFactory, TurnContext}
  import com.microsoft.bot.schema.{ChannelAccount, ResourceResponse}
  import org.apache.commons.lang3.StringUtils
  import scala.concurrent.Future
  import scala.jdk.CollectionConverters._
  import scala.jdk.FutureConverters._

  override def onMembersAdded(membersAdded: JList[ChannelAccount], turnContext: TurnContext): CompletableFuture[Void] = {
    import scala.concurrent.ExecutionContext.Implicits.global
    val cf: List[Future[ResourceResponse]] =
      membersAdded
        .stream()
        .iterator
        .asScala
        .toList
        .filter(member => !StringUtils.equals(member.getId, turnContext.getActivity.getRecipient.getId))
        .map(_ => turnContext.sendActivity(MessageFactory.text("Hello and welcome!")).asScala)
    Future
      .sequence(cf)
      .asJava
      .toCompletableFuture
      .asInstanceOf[CompletableFuture[Void]]
  }

  override def onMessageActivity(turnContext: TurnContext): CompletableFuture[Void] = {
    val cf = turnContext
      .sendActivity(MessageFactory.text("Echo: " + turnContext.getActivity.getText))
      .thenApply(_ => ())
    cf.asInstanceOf[CompletableFuture[Void]]
  }
}
