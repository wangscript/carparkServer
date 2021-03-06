package image;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * @author panmingzhi815
 * 
 */
public class ImageUtil {

	public static Map<String, Image> imgMap = new HashMap<String, Image>();

	public static Image getImg(String imageName) {
		Image image = imgMap.get(imageName);
		if (image != null) {
			return image;
		}

//		URL resource = ImageUtil.class.getResource(imageName);
		InputStream resourceAsStream = ImageUtil.class.getResourceAsStream(imageName);
		image = new Image(Display.getDefault(), resourceAsStream);
		imgMap.put(imageName, image);
		return image;
	}

}
