package andriod.artinianv.blogreader;
import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BlogPostTask extends AsyncTask<Activity, Void, JSONObject> {
    @Override
    protected JSONObject doInBackground(Activity... activities) {
        JSONObject jsonObject = null;
        try {
            URL blogFeedUrl = new URL("http://blog.teamtreehouse.com/api/get_recent_summary/?count=10");

            HttpURLConnection connection = (HttpURLConnection) blogFeedUrl.openConnection();
            connection.connect();
            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {
                Log.i("BlogPostTask", "Successful Connection " + responseCode);
                BlogPostParser.get().parse(connection.getInputStream());
            }
        }
        catch(MalformedURLException error) {
            Log.e("BlogPostTask", "Malformed URL:" + error);
        }
            catch(IOException error) {
                Log.e("BlogPostTask", "IO Exception : " + error);
            }
            return jsonObject;
    }


    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        super.onPostExecute(jsonObject);
    }
}
