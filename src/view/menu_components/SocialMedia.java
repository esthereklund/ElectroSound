package view.menu_components;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SocialMedia extends JPanel{
	private SMLabel fb;
	private SMLabel fs;
	private SMLabel insta;
	private SMLabel youtube;
	private SMLabel twitter;
	
	public SocialMedia() {
		this.setBounds(0, 0, 1400, 50);
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 0));
		
		this.setFb(new SMLabel("/images/fb.png"));
		this.add(this.getFb());
		
		this.setFs(new SMLabel("/images/fs.png"));
		this.add(this.getFs());
		
		this.setInsta(new SMLabel("/images/insta.png"));
		this.add(this.getInsta());
		
		this.setYoutube(new SMLabel("/images/youtube.png"));
		this.add(this.getYoutube());
		
		this.setTwitter(new SMLabel("/images/twitter.png"));
		this.add(this.getTwitter());
		
		
	}

	public SMLabel getFb() {
		return fb;
	}

	public void setFb(SMLabel fb) {
		this.fb = fb;
	}

	public SMLabel getFs() {
		return fs;
	}

	public void setFs(SMLabel fs) {
		this.fs = fs;
	}

	public SMLabel getInsta() {
		return insta;
	}

	public void setInsta(SMLabel insta) {
		this.insta = insta;
	}

	public SMLabel getYoutube() {
		return youtube;
	}

	public void setYoutube(SMLabel youtube) {
		this.youtube = youtube;
	}

	public SMLabel getTwitter() {
		return twitter;
	}

	public void setTwitter(SMLabel twitter) {
		this.twitter = twitter;
	}


	
}
