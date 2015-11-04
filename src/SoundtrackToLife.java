import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
		for (int i = 0; i < 435; i++) {

			int userMood = JOptionPane.showOptionDialog(null,
					"LOOK DOWN SCRUB", "LOOK DOWN SCRUB", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] {
							"LOOMANARTY", "Sad", "Potato", "MLG PRO" }, null);

			System.out.println(userMood);

			if (userMood == 3) {
				playVideo("https://www.youtube.com/watch?v=bKdHWPJWn-4");
			}
			if (userMood == 0) {
				playVideo("https://www.youtube.com/watch?v=PJLSzsEjpWM");
			}
			if (userMood == 1) {
				playVideo("https://www.youtube.com/watch?v=RxkHuecEpgw");
			}
			if (userMood == 2) {
				playVideo("https://www.youtube.com/watch?v=efMHLkyb7ho");
			}
		}
	}

	private static void userMood() {

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
