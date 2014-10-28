package andriod.artinianv.blogreader;

import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class BlogPostParser {
    private static BlogPostParser parser;

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

         }

     }
     catch(IOException error) {
         Log.e("BlogPostParcer", "IOException:" + error);
     }

        return jsonObject;
    }
}
