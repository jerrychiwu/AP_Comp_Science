package ap13.q1;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {
	
	private List<DownloadInfo> downloadList;
	
	public MusicDownloads() {
		
		downloadList = new ArrayList<DownloadInfo>();		
	}
	
	public DownloadInfo getDownloadInfo(String title) {
		
		for (DownloadInfo info : downloadList) {
			
			if (info.getTitle().equals(title)) {
				
				return info;
			}			
		}
		
		return null;		
	}
	
	public void updateDownloads(List<String> titles) {
		
		for (String s : titles) {
			
			if (getDownloadInfo(s) != null) {
				
				getDownloadInfo(s).incrementTimesDownloaded();
			}
			
			else {
				
				downloadList.add(new DownloadInfo(s));
			}
		}
		
	}

}
