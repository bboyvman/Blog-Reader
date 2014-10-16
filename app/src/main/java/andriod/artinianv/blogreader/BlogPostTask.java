package andriod.artinianv.blogreader;
import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONObject;

import java.net.MalformedURLException;

public class BlogPostTask extends AsyncTask<Activity, Void, JSONObject> {
    @Override
    protected JSONObject doInBackground(Activity... activities) {
        try {
            URL blogFeedUrl = new URL("http://blog.teamtreehouse.com/api/get_recent_summary/?count=10");
        }
        catch(MalformedURLException error) {
            Log.e("BlogPostTask", "Malformed URL:" + error);
        }
            return null;
    }
}
