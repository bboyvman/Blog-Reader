package andriod.artinianv.blogreader;

import android.text.Html;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class BlogPostParser {
    private static BlogPostParser parser;
    public ArrayList<BlogPost> posts;

    private BlogPostParser()  {

    }

    public static BlogPostParser get() {
        if (parser == null) {
            parser = new BlogPostParser();
        }
        return parser;
    }

    public JSONObject prase(InputStream inputStream) {
        BufferedReader reader = BufferedReader(new InputStream(inputStream));
        StringBuilder builder = new StringBuilder();
        JSONObject jsonObject = null;

        String line;

     try {
         while (line = (reader.readLine()) != null) {
             builder.append(line);
         }
         JSONTokener jsonTokener = new JSONTokener(builder.toString());
         jsonObject = new JSONObject(JSONTokener);


             String title = Html.fromHtml(post.getString()"title")).toString();
         }

     }
     catch(IOException error) {
         Log.e("BlogPostParcer", "IOException:" + error);
     }
        catch(JSONException error) {
        Log.e("BlogPostParcer", "JSON Exception: " + error);
    }


        return jsonObject;
    }

        public void readFeed(JSONObject jsonObject) {

        }
}
