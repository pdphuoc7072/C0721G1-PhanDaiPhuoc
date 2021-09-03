package ss19_string_va_regex.bai_tap_optional.crawl_tin_tuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    private static final String NEWS_REGEX = "title=\"(.*?)\">";
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.24h.com.vn/tin-tuc-quoc-te-c415.html");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String content;
            while ((content = br.readLine()) != null) {
                contentBuilder.append(content);
            }
            content = contentBuilder.toString();
            br.close();
            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile(NEWS_REGEX);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        } catch (UnsupportedEncodingException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
