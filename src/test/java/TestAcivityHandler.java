import com.microsoft.bot.builder.ActivityHandler;
import com.microsoft.bot.builder.TurnContext;
import com.microsoft.bot.schema.ChannelAccount;
import com.microsoft.bot.schema.MessageReaction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class TestActivityHandler extends ActivityHandler {
    private List<String> record = new ArrayList<>();

    public List<String> getRecord() {
        return record;
    }

    public void setRecord(List<String> record) {
        this.record = record;
    }

    @Override
    protected CompletableFuture<Void> onMessageActivity(TurnContext turnContext) {
        record.add("onMessageActivity");
        return super.onMessageActivity(turnContext);
    }

    @Override
    protected CompletableFuture<Void> onConversationUpdateActivity(TurnContext turnContext) {
        record.add("onConversationUpdateActivity");
        return super.onConversationUpdateActivity(turnContext);
    }

    @Override
    protected CompletableFuture<Void> onMembersAdded(List<ChannelAccount> membersAdded, TurnContext turnContext) {
        record.add("onMembersAdded");
        return super.onMembersAdded(membersAdded, turnContext);
    }

    @Override
    protected CompletableFuture<Void> onMembersRemoved(List<ChannelAccount> membersRemoved, TurnContext turnContext) {
        record.add("onMembersRemoved");
        return super.onMembersRemoved(membersRemoved, turnContext);
    }

    @Override
    protected CompletableFuture onMessageReactionActivity(TurnContext turnContext) {
        record.add("onMessageReactionActivity");
        return super.onMessageReactionActivity(turnContext);
    }

    @Override
    protected CompletableFuture onReactionsAdded(List<MessageReaction> messageReactions, TurnContext turnContext) {
        record.add("onReactionsAdded");
        return super.onReactionsAdded(messageReactions, turnContext);
    }

    @Override
    protected CompletableFuture onReactionsRemoved(List<MessageReaction> messageReactions, TurnContext turnContext) {
        record.add("onReactionsRemoved");
        return super.onReactionsRemoved(messageReactions, turnContext);
    }

    @Override
    protected CompletableFuture onEventActivity(TurnContext turnContext) {
        record.add("onEventActivity");
        return super.onEventActivity(turnContext);
    }

    @Override
    protected CompletableFuture onTokenResponseEvent(TurnContext turnContext) {
        record.add("onTokenResponseEvent");
        return super.onTokenResponseEvent(turnContext);
    }

    @Override
    protected CompletableFuture onEvent(TurnContext turnContext) {
        record.add("onEvent");
        return super.onEvent(turnContext);
    }

    @Override
    protected CompletableFuture onUnrecognizedActivityType(TurnContext turnContext) {
        record.add("onUnrecognizedActivityType");
        return super.onUnrecognizedActivityType(turnContext);
    }
}
