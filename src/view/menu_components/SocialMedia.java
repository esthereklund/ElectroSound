package view.menu_components;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SocialMedia extends JPanel{
	private JLabel fb;
	private JLabel fs;
	private JLabel insta;
	private JLabel youtube;
	private JLabel twitter;
	
	public SocialMedia() {
		this.setBounds(0, 0, 1400, 50);
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 0));
		
		//fl_panel_4.setAlignOnBaseline(true);
		
		this.setFb(new JLabel());
		ImageIcon unscaledfb = new ImageIcon(getClass().getResource("/images/fb.png"));
		Image scaledfb = unscaledfb.getImage().getScaledInstance(40, 40, 0);
		this.getFb().setIcon(new ImageIcon(scaledfb));
		this.add(this.getFb());
		
		this.setFs(new JLabel());
		ImageIcon unscaledfs = new ImageIcon(getClass().getResource("/images/fs.png"));
		Image scaledfs = unscaledfs.getImage().getScaledInstance(40, 40, 0);
		this.getFs().setIcon(new ImageIcon(scaledfs));
		this.add(this.getFs());
		
		this.setInsta(new JLabel());
		ImageIcon u_insta = new ImageIcon(getClass().getResource("/images/insta.png"));
		Image insta = u_insta.getImage().getScaledInstance(40, 40, 0);
		this.getInsta().setIcon(new ImageIcon(insta));
		this.add(this.getInsta());
		
		this.setYoutube(new JLabel());
		ImageIcon u_youtube = new ImageIcon(getClass().getResource("/images/youtube.png"));
		Image youtube = u_youtube.getImage().getScaledInstance(40, 40, 0);
		this.getYoutube().setIcon(new ImageIcon(youtube));
		this.add(this.getYoutube());
		
		this.setTwitter(new JLabel());
		ImageIcon u_twitter = new ImageIcon(getClass().getResource("/images/twitter.png"));
		Image twitter = u_twitter.getImage().getScaledInstance(40, 40, 0);
		this.getTwitter().setIcon(new ImageIcon(twitter));
		this.add(this.getTwitter());
		
		
	}

	public JLabel getFb() {
		return fb;
	}

	public void setFb(JLabel fb) {
		this.fb = fb;
	}

	public JLabel getFs() {
		return fs;
	}

	public void setFs(JLabel fs) {
		this.fs = fs;
	}

	public JLabel getInsta() {
		return insta;
	}

	public void setInsta(JLabel insta) {
		this.insta = insta;
	}

	public JLabel getYoutube() {
		return youtube;
	}

	public void setYoutube(JLabel youtube) {
		this.youtube = youtube;
	}

	public JLabel getTwitter() {
		return twitter;
	}

	public void setTwitter(JLabel twitter) {
		this.twitter = twitter;
	}
	
	
}
