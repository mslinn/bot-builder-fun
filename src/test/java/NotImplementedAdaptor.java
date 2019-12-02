import com.microsoft.bot.builder.BotAdapter;
import com.microsoft.bot.builder.TurnContext;
import com.microsoft.bot.schema.Activity;
import com.microsoft.bot.schema.ConversationReference;
import com.microsoft.bot.schema.ResourceResponse;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class NotImplementedAdapter extends BotAdapter {
    @Override
    public CompletableFuture<ResourceResponse[]> sendActivities(TurnContext context, List<Activity> activities) {
        throw new NotImplementedException();
    }

    @Override
    public CompletableFuture<ResourceResponse> updateActivity(TurnContext context, Activity activity) {
        throw new NotImplementedException();
    }

    @Override
    public CompletableFuture<Void> deleteActivity(TurnContext context, ConversationReference reference) {
        throw new NotImplementedException();
    }
}
